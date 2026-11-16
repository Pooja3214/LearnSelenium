package com.ex15_DataDrivenTesting_POI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab33_DDT_TestNG_POI {

    @Test(dataProvider ="get_data" )
        public  void test_vwo_login(String username,String password,String ER){
        System.out.println("Running:");
        System.out.println(username + " - " + password +" - "  +ER);
        System.out.println();
        }

        @DataProvider
    public Object[][] get_data(){
        return new Object[][]{
                new Object[]{"admin@admin.com","pwd123","Expected Result 1"},
                new Object[]{"admin@admin.com","pwd123","Expected Result 2"},
                new Object[]{"admin@admin.com","pwd123","Expected Result 3"}
        };
        }

}
