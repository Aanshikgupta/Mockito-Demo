package com.aanshik.mockitodemo;

import com.aanshik.mockitodemo.Service.DataService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MockTest {

    @InjectMocks
    DataUsage dataUsage;
    @Mock
    DataService dataService;
    @Test
    void dataUsageTest(){

        //create a mock
        //dataService=mock(DataService.class);

        //provide data using mockito mock methods
        //v. v. easy
        when(dataService.retrieveAllData()).thenReturn(new int[]{1,2,3,4});

        //DataUsage dataUsage=new DataUsage(dataService);
        int x=dataUsage.greatestOfAll();

        assertEquals(x,4);

    }

    @Test
    void listTest(){
        List listMock=mock(List.class);

        when(listMock.size()).thenReturn(1).thenReturn(3);

        assertEquals(1,listMock.size());//works fine as first time it return 1
        assertEquals(3,listMock.size());//second call it returns 3
        assertEquals(3,listMock.size());//subsequent call it returns last return value ie 3
    }


}