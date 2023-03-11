package com.aanshik.mockitodemo;

import com.aanshik.mockitodemo.Service.DataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockTest {

    DataService dataService;
    @Test
    void dataUsageTest(){

        //create a mock
        dataService=mock(DataService.class);

        //provide data using mockito mock methods
        //v. v. easy
        when(dataService.retrieveAllData()).thenReturn(new int[]{1,2,3,4});

        DataUsage dataUsage=new DataUsage(dataService);
        int x=dataUsage.greatestOfAll();

        assertEquals(x,4);
    }


}