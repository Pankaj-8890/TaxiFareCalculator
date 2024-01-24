package org.example;
import org.junit.Test;
import java.util.Arrays;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class User_test {
    
    @Test
    public void testToGetTheFareof1km() {
        ArrayList<CabFare> list = new ArrayList<>(Arrays.asList(
                new CabFare(1.0, 0),
                new CabFare(1.0, 0),
                new CabFare(0.0, 10)
                ));
        User fareList = new User(list);
        assertEquals(81.0, fareList.getAccumulateFare(), 0.0);
    }






}
