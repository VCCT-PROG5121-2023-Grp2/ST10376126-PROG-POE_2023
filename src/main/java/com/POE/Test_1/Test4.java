package com.POE.Test_1;
import com.POE.MyLoginClass;

/**
 *
 * @author Alexi
 */
public class Test4 {
    public Test4(){}
      
    static String value ;
    public static void setValue(String newValue) {
            value = newValue;
        }
       
    public String GetValue(){
       return value;
    }
        
      
        
      public static void main(String[] args){
        
        MyLoginClass Test4 = new MyLoginClass("Jose","Lubota","kyl_1","2J@42J@42J@4");
       
        Test4.registerStatus("kyl_1","2J@4");
        Test4.loginUser("kyl_1", "2J@4");
        
        setValue(Test4.LoginStatus());
    }

    
}
