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
        double accumulateFare = 0.0;

        for(CabFare e : list){
            accumulateFare += e.calculateFare();
        }
        return accumulateFare;
    }

    public Map<String, Double> getRideBreakdown(double d,int time){

        Map<String, Double> rideBreakdown;
        CabFare cab = new CabFare(d,time);
        double res = cab.calculateFare();
        rideBreakdown = cab.getFareBreakdown();
        rideBreakdown.put("totalFare",res);

        return rideBreakdown;
    }


}
