package com.POE.Test_1;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test8Test {
    
    Test8 t = new Test8();
    
    @Test
    public void testUnit9() {
        System.out.println("---------------------------");
        System.out.println("Unit Test - 9");
        System.out.println("---------------------------\n");
        
        t.main(null);
        Boolean actual = t.GetValue();
  
        assertTrue(actual);
        System.out.println("True");
    }
}
//----------------------------------... END OF FILE...--------------------//