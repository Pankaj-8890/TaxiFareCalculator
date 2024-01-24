package org.example;
import java.lang.Math;
import java.util.HashMap;
import java.util.Map;

public class CabFare{

    private final double distance;
    private final int waitingTime;
    private double fareForDistanceTravel;
    private double waitingTimeFare;
    private final double baseCharge = 2.0;
    private double serviceCharge;
    private double totalFare;
    private double finalFare;

    public CabFare(double distance, int waitingTime) {
        this.distance = distance;
        this.waitingTime = waitingTime;
        this.fareForDistanceTravel = 0.0;
        this.waitingTimeFare = 0.0;
        this.serviceCharge = 0.0;
        this.totalFare = 0.0;
        calculateFare();
    }
    protected void calculateFare() {
        fareForDistanceTravel = Math.floor(distance) * 12;
        waitingTimeFare = waitingTime * 2;
        totalFare = fareForDistanceTravel + waitingTimeFare;
        if (totalFare > 100) serviceCharge = totalFare * 0.01;
        finalFare= Math.max((totalFare + serviceCharge),25) + baseCharge;
    }

    protected Map<String,Double> getFareBreakdown(){
        Map<String, Double> rideBreakdown = new HashMap<>();
        rideBreakdown.put("fareForDistanceTravel",fareForDistanceTravel);
        rideBreakdown.put("waitingTimeFare",waitingTimeFare);
        rideBreakdown.put("serviceCharge",serviceCharge);
        rideBreakdown.put("baseCharge",baseCharge);
        rideBreakdown.put("finalFare",finalFare);

        return rideBreakdown;
    }
    public double getFinalFare() {
        return finalFare;
    }
}



