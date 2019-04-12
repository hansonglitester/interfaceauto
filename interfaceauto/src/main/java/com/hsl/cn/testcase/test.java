package com.hsl.cn.testcase;


import com.hsl.cn.config.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class test extends BaseTest {
    @DataProvider
    public Object[][]  getdata(){
        Object[][] object=null;
        Map<String,String> map=new HashMap <>();
        map.put("id","1");
        map.put("id1","2");
        map.put("id2","3");
        object=new Object[][]{{map}};

        return object;
    }
    //dataProvider = "userdetaildata2"

    @Test(dataProvider = "getdata")
    public void test1(Map<String,String> map){
        System.out.println(map.toString());

    }
}
