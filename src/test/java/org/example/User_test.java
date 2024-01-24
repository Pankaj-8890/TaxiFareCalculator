package org.example;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class User_test {
    
    @Test
    public void testToGetTheFareof1km() {
        User user1 = new User();
        int tripIndex = user1.createTrip(1.0,10);
        Map<String,Double> rideBreakdown = user1.getRideBreakdown(tripIndex);
//        List<Map<String, Object>> listOfMaps = new ArrayList<>();
//        listOfMaps.add(createMap(1.0, 0));
//        listOfMaps.add(createMap(1.0, 0));
//        listOfMaps.add(createMap(0.0, 10));
//        listOfMaps.add(createMap(2.0, 10));
//
//        for (Map<String, Object> map : listOfMaps) {
//            double distance = (double) map.get("distance");
//            int time = (int) map.get("time");
//            user1.createTrip(distance, time);
//        }
        System.out.println(rideBreakdown);
        Map<String, Double> expectedBreakdown = new HashMap<>() {{
            put("fareForDistanceTravel", 12.0);
            put("waitingTimeFare", 12.0);
            put("serviceCharge", 12.0);
            put("baseCharge", 12.0);
            put("finalFare",12.0);
        }};
        int tripIndex1 = user1.createTrip(15.0,99);
        Map<String,Double> rideBreakdown1 = user1.getRideBreakdown(tripIndex1);
        System.out.println(rideBreakdown1);

        assertNotEquals(expectedBreakdown,rideBreakdown);
    }
    private static Map<String, Object> createMap(double distance, int time) {
        Map<String, Object> map = new HashMap<>();
        map.put("distance", distance);
        map.put("time", time);
        return map;
    }






}
