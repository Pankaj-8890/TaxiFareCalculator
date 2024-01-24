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

    public CabFare(double d,int time){
        this.distance = d;
        this.waitingTime = time;
        this.fareForDistanceTravel = 0.0;
        this.waitingTimeFare = 0.0;
        this.serviceCharge = 0.0;
        this.totalFare = 0.0;
    }


    protected double calculateFare() {

        fareForDistanceTravel = Math.floor(distance) * 12;
        waitingTimeFare = waitingTime * 2;
        totalFare = fareForDistanceTravel + waitingTimeFare;
        if (totalFare > 100) serviceCharge = totalFare * 0.01;
        return Math.max((totalFare + serviceCharge),25) + baseCharge;
    }

    protected Map<String,Double> getFareBreakdown(){
        Map<String, Double> rideBreakdown = new HashMap<>();
        rideBreakdown.put("fareForDistanceTravel",fareForDistanceTravel);
        rideBreakdown.put("waitingTimeFare",waitingTimeFare);
        rideBreakdown.put("serviceCharge",serviceCharge);
        rideBreakdown.put("baseCharge",baseCharge);

        return rideBreakdown;
    }




}



