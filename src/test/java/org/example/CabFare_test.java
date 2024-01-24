//package org.example;
//import org.example.CabFare;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotEquals;
//public class CabFare_test {
//
//
//    @Test
//    public void testToGetTheFareof1km() {
//
//        CabFare cab = new CabFare(1.0,0);
//        double actual = cab.calculateFare();
//        double expected = 27.0;
//        assertEquals(expected,actual,0.0);
//    }
//
//    @Test
//    public void testToGetTheFareof1kmAndWaitingTime15min() {
//
//        CabFare cab = new CabFare(1.0,15);
//        double actual = cab.calculateFare();
//        double expected = 44.0;
//        assertEquals(expected,actual,0.0);
//    }
//
//    @Test
//    public void testToGetTheFareof10km800mAndWaitingTime15min() {
//
//        CabFare cab = new CabFare(10.8,15);
//        double actual = cab.calculateFare();
//        double expected = 153.5;
//        assertEquals(expected,actual,0.0);
//    }
//
//    @Test
//    public void testToGetTheFareof0kmAndWaitingTime15min() {
//
//        CabFare cab = new CabFare(0.0,15);
//        double actual = cab.calculateFare();
//        double expected = 32.0;
//        assertEquals(expected,actual,0.0);
//    }
//
//    @Test
//    public void testToGetTheFareof1kmAndWaitingTime5min() {
//
//        CabFare cab = new CabFare(1.0,5);
//        double actual = cab.calculateFare();
//        double expected = 27.0;
//        assertEquals(expected,actual,0.0);
//    }
//
//    @Test
//    public void testToGetTheFareof200m() {
//
//        CabFare cab = new CabFare(0.2,0);
//        double actual = cab.calculateFare();
//        double expected = 27.0;
//        assertEquals(expected,actual,0.0);
//    }
//
//}
