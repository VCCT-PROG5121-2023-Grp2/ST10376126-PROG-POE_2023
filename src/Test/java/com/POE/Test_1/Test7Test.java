package com.POE.Test_1;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test7Test {
    
    Test7 t = new Test7();
    
    @Test
    public void testUnit8() {
        System.out.println("---------------------------");
        System.out.println("Unit Test - 8");
        System.out.println("---------------------------\n");
        
        t.main(null);
        Boolean actual = t.GetValue();
  
        assertFalse("False",actual);
        System.out.println("False");
    }
}
//----------------------------------... END OF FILE...--------------------//
