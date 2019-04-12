package com.hsl.cn.testcase;


import com.hsl.cn.config.Config;
import com.hsl.cn.utils.HttpClientUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class TestUserDetailCase {
   public  ResourceBundle bunble = ResourceBundle.getBundle("config");
    @Test
    public void TestUserList() throws IOException {
        String url= Config.getUserDetailUrl;
        System.out.println(url);

        //组参数
        Map<String,Object> paramMap=new HashMap<String, Object>();
        paramMap.put("id",12);

        //发请求
        String result= HttpClientUtils.sendGet(url,paramMap);
        //解析，断言
        System.out.println("result:"+result);
        Assert.assertEquals("id=12, name=/'null/'","id=12, name=null");
        Assert.assertNotEquals("","");
        Assert.assertTrue(true);
        Assert.assertNotNull("","");
        Assert.assertSame("","");
    }
}
