package com.POE.Test_1;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test0Test {
    
    Test0 t = new Test0();
    
    @Test
    public void testGetValue() {
        System.out.println("---------------------------");
        System.out.println("Unit Test - 1");
        System.out.println("---------------------------\n");
        t.main(null);
        String actual="";
        Boolean Value = t.GetValue();
        String FirstName = t.GetFN();
        String Surname = t.GetSN();
        String expected = "Username successfully  captured";
        
        if(Value){
            actual ="Username successfully  captured";
        }
        

       assertEquals(expected, actual);
       System.out.println("Welcome "+ FirstName +","+ Surname + " it is great to see you again");
    }
}
//----------------------------------... END OF FILE...--------------------//