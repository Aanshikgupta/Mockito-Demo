package com.aanshik.mockitodemo;

import com.aanshik.mockitodemo.Service.DataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockitoStubTest {

    DataService dataService;
    @Test
    void dataUsageTest(){
        dataService=new DataServiceImpl();
        DataUsage dataUsage=new DataUsage(dataService);
        int x=dataUsage.greatestOfAll();

        assertEquals(x,4);
    }

    //For multiple cases we have to create multiple class for implementation like DataServiceImplStub and DataServiceImplStub1
    @Test
    void zeroMemberDataUsageTest(){
        dataService=new DataServiceImpl1();
        DataUsage dataUsage=new DataUsage(dataService);
        int x=dataUsage.greatestOfAll();

        assertEquals(x,4);
    }
}


class DataServiceImpl implements DataService
{

    @Override
    public int[] retrieveAllData() {
        return new int[]{1,2,3,4};
    }
}

class DataServiceImpl1 implements DataService
{

    @Override
    public int[] retrieveAllData() {
        return new int[]{};
    }
}