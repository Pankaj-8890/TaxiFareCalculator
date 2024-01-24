package org.example;
import org.example.CabFare;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class CabFare_test {


    @Test
    public void testcalculateFare1km_and_0m_WaitingTime() {

        CabFare cab = new CabFare(1.0,0);
        double actual = cab.calculateFare();
        double expected = 27.0;
        assertEquals(expected,actual,0.0);
    }

    @Test
    public void testcalculateFare1km_and_15m_WaitingTime() {

        CabFare cab = new CabFare(1.0,15);
        double actual = cab.calculateFare();
        double expected = 44.0;
        assertEquals(expected,actual,0.0);
    }

    @Test
    public void testcalculateFare1800m_and_15m_WaitingTime() {

        CabFare cab = new CabFare(10.8,15);
        double actual = cab.calculateFare();
        double expected = 153.5;
        assertEquals(expected,actual,0.0);
    }

    @Test
    public void testcalculateFare0km_and_15m_WaitingTime() {

        CabFare cab = new CabFare(0.0,15);
        double actual = cab.calculateFare();
        double expected = 32.0;
        assertEquals(expected,actual,0.0);
    }

    @Test
    public void testcalculateFare1km_and_5m_WaitingTime() {

        CabFare cab = new CabFare(1.0,5);
        double actual = cab.calculateFare();
        double expected = 27.0;
        assertEquals(expected,actual,0.0);
    }

    @Test
    public void testcalculateFare200m_and_0m_WaitingTime() {

        CabFare cab = new CabFare(0.2,0);
        double actual = cab.calculateFare();
        double expected = 27.0;
        assertEquals(expected,actual,0.0);
    }

    @Test
    public void testGetFareBreakDownfor1km_And_5min_WaitingTime() {

        CabFare cab = new CabFare(1.0,5);
        double res = cab.calculateFare();

        Map<String, Double> actual;
        actual = cab.getFareBreakdown();
        actual.put("totalFare",res);
        Map<String, Double> Expected = new HashMap<>();
        Expected.put("fareForDistanceTravel",12.0);
        Expected.put("waitingTimeFare",10.0);
        Expected.put("serviceCharge",0.0);
        Expected.put("baseCharge",2.0);
        Expected.put("totalFare",27.0);

        assertEquals(Expected,actual);
    }

    @Test
    public void testGetFareBreakDown1km_and_15m_WaitingTime() {

        CabFare cab = new CabFare(1.0,15);
        double res = cab.calculateFare();

        Map<String, Double> actual;
        actual = cab.getFareBreakdown();
        actual.put("totalFare",res);
        Map<String, Double> Expected = new HashMap<>();
        Expected.put("fareForDistanceTravel",12.0);
        Expected.put("waitingTimeFare",30.0);
        Expected.put("serviceCharge",0.0);
        Expected.put("baseCharge",2.0);
        Expected.put("totalFare",44.0);

        assertEquals(Expected,actual);
    }

    @Test
    public void testGetFareBreakDown200m_and_0m_WaitingTime() {
        CabFare cab = new CabFare(0.2,0);
        double res = cab.calculateFare();

        Map<String, Double> actual;
        actual = cab.getFareBreakdown();
        actual.put("totalFare",res);
        Map<String, Double> Expected = new HashMap<>();
        Expected.put("fareForDistanceTravel",0.0);
        Expected.put("waitingTimeFare",0.0);
        Expected.put("serviceCharge",0.0);
        Expected.put("baseCharge",2.0);
        Expected.put("totalFare",27.0);

        assertEquals(Expected,actual);
    }


}
