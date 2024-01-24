package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class User{

    private ArrayList<CabFare> cabFareList;

    public User(ArrayList<CabFare> fareList){
        this.cabFareList = fareList;
    }

    public double getAccumulateFare(){

        ArrayList<CabFare> list = this.cabFareList;
        Double accumulateFare = 0.0;

        for(CabFare e : list){
            accumulateFare += e.calculateFare();
        }
        return accumulateFare;
    }

    public Map<String, Double> getRideBreakdown(){
        Map<String, Integer> rideBreakdown = new HashMap<>();
        CabFare cab = new CabFare();
        rideBreakdown =

    }
}
