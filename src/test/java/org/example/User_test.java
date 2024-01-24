package org.example;
import org.junit.Test;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class User_test {

    @Test
    public void testgetAccumulateFareforMultipleTrips() {
        ArrayList<CabFare> list = new ArrayList<>(Arrays.asList(
                new CabFare(1.0, 5),
                new CabFare(0.0, 0),
                new CabFare(0.2, 5),
                new CabFare(1.9, 75),
                new CabFare(0.0, 95)
                ));
        User fareList = new User(list);
        assertEquals(440.52, fareList.getAccumulateFare(), 0.0);
    }

    @Test
    public void testgetRideBreakdownfor1km_And_5min_WaitingTime() {


        User fareList = new User(new ArrayList<>());
        Map<String, Double> actual;
        actual= fareList.getRideBreakdown(1.0,5);
        Map<String, Double> Expected = new HashMap<>();
        Expected.put("fareForDistanceTravel",12.0);
        Expected.put("waitingTimeFare",10.0);
        Expected.put("serviceCharge",0.0);
        Expected.put("baseCharge",2.0);
        Expected.put("totalFare",27.0);

        assertEquals(Expected, actual);
    }

    @Test
    public void testGetFareBreakDown200m_and_0m_WaitingTime() {


        User fareList = new User(new ArrayList<>());
        Map<String, Double> actual;
        actual= fareList.getRideBreakdown(0.2,5);
        Map<String, Double> Expected = new HashMap<>();
        Expected.put("fareForDistanceTravel",12.0);
        Expected.put("waitingTimeFare",10.0);
        Expected.put("serviceCharge",0.0);
        Expected.put("baseCharge",2.0);
        Expected.put("totalFare",27.0);

        assertNotEquals(Expected, actual);
    }

    @Test
    public void testGetFareBreakDown0km_and_0m_WaitingTime() {


        User fareList = new User(new ArrayList<>());
        Map<String, Double> actual;
        actual= fareList.getRideBreakdown(0.0,0);
        Map<String, Double> Expected = new HashMap<>();
        Expected.put("fareForDistanceTravel",0.0);
        Expected.put("waitingTimeFare",0.0);
        Expected.put("serviceCharge",0.0);
        Expected.put("baseCharge",2.0);
        Expected.put("totalFare",27.0);

        assertEquals(Expected, actual);
    }

    @Test
    public void testGetFareBreakDown1km_and_0m_WaitingTime() {


        User fareList = new User(new ArrayList<>());
        Map<String, Double> actual;
        actual= fareList.getRideBreakdown(1.0,0);
        Map<String, Double> Expected = new HashMap<>();
        Expected.put("fareForDistanceTravel",12.0);
        Expected.put("waitingTimeFare",0.0);
        Expected.put("serviceCharge",0.0);
        Expected.put("baseCharge",2.0);
        Expected.put("totalFare",27.0);

        assertEquals(Expected, actual);
    }

    @Test
    public void testGetFareBreakDown0km_and_90m_WaitingTime() {


        User fareList = new User(new ArrayList<>());
        Map<String, Double> actual;
        actual= fareList.getRideBreakdown(0.0,90);
        Map<String, Double> Expected = new HashMap<>();
        Expected.put("fareForDistanceTravel",0.0);
        Expected.put("waitingTimeFare",180.0);
        Expected.put("serviceCharge",1.8);
        Expected.put("baseCharge",2.0);
        Expected.put("totalFare",183.8);

        assertEquals(Expected, actual);
    }

}
