package com.aanshik.mockitodemo;

import com.aanshik.mockitodemo.Service.DataService;

import javax.xml.crypto.Data;

public class DataUsage {

    public DataUsage(DataService dataService) {
        this.dataService = dataService;
    }

    DataService dataService;
    public int greatestOfAll(){
        int[] arr=dataService.retrieveAllData();
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>max){
                max=x;
            }
        }
        return max;
    }
}
