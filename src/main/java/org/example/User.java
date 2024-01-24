package org.example;

import java.util.HashMap;
import java.util.Map;

public class User{

    private Map<Integer, CabFare> cabFareMap;
    private int tripIndex;

    public User(){
        tripIndex=1;
        cabFareMap = new HashMap<>();
   }

    public int createTrip(double distance,int waitingTime){
        CabFare cabfare = new CabFare(distance,waitingTime);
        System.out.printf("Added a new trip.%nTrip Index is: %d%n", tripIndex);
        cabFareMap.put(tripIndex,cabfare);
        tripIndex++;
        return tripIndex - 1;
    }

    public Map<String, Double> getRideBreakdown(int tripIndex) {
        if (cabFareMap.containsKey(tripIndex)) {
            CabFare cabObject = cabFareMap.get(tripIndex);
            return cabObject.getFareBreakdown();
        } else {
            System.out.println("Invalid trip index");
            return null; // or handle the case where the index is invalid
        }
    }

//    public Map<String,Double> getAllRidesBreakdown(){
//        for (Map.Entry<Integer, CabFare> entry : cabFareMap.entrySet()) {
//            CabFare cabFare = entry.getValue();
//            Map<String,Double> rideBreakdown;
//            cabFare.getFareBreakdown();
//
//        }
}
