package org.example;

import java.util.HashMap;
import java.util.Map;

public class CabFare {

    private final double distance;
    private final int waitingTime;
    private static double fareForDistanceTravel;
    private double waitingTimeFare;
    private final double baseCharge = 2.0;
    private double serviceCharge;
    private double totalFare;

    public CabFare(double distance, int waitingTime) {
        this.distance = distance;
        this.waitingTime = waitingTime;
    }

    protected double calculateFare() {
        fareForDistanceTravel = Math.floor(this.distance) * 12;
        waitingTimeFare = this.waitingTime * 2;
        totalFare = fareForDistanceTravel + waitingTimeFare;
        serviceCharge = totalFare > 100 ? totalFare * 0.01 : 0.0;
        return Math.max(totalFare + serviceCharge, 25) + baseCharge;
    }

    protected Map<String, Double> getFareBreakdown() {
        Map<String, Double> rideBreakdown = new HashMap<>();
        rideBreakdown.put("fareForDistanceTravel", fareForDistanceTravel);
        rideBreakdown.put("waitingTimeFare", waitingTimeFare);
        rideBreakdown.put("serviceCharge", serviceCharge);
        rideBreakdown.put("baseCharge", baseCharge);
        return rideBreakdown;
    }
}
