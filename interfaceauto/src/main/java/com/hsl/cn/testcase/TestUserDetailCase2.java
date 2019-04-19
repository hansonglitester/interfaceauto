package com.hsl.cn.testcase;


import com.hsl.cn.model.UserDetailCase;
import com.hsl.cn.repository.UserDetailCaseDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.*;


public class TestUserDetailCase2  extends BaseTest {

    Logger logger = LoggerFactory.getLogger(TestUserDetailCase2.class);
    Logger logger1=LoggerFactory.getLogger(TestUserDetailCase2.class);

    @Autowired
    UserDetailCaseDao userDetailCaseDao;

    @DataProvider(name="data")
    public Iterator<Object[]> getdata(){

        List<UserDetailCase> userlist= userDetailCaseDao.findAll();
        System.out.println(userlist);
        Iterator it=userlist.iterator();
        List<Object[]> result=new ArrayList<>();
        while(it.hasNext()){
            result.add(new Object[] { it.next() });
        }

        return   result.iterator();
    }



    @DataProvider(name="data2")
    public Object[][] getdata2(){

        List<UserDetailCase> userlist= userDetailCaseDao.findAll();
        logger.info(userlist.toString());

        //定义二位数组，用于返回测试数据
        Object[][] result =new Object[userlist.size()][];

        for (int i=0;i<userlist.size();i++){

            result[i]=new Object[]{userlist.get(i)};
        }
        return  result;
    }


    @Test(dataProvider = "data2")
    public void TestUserList2(UserDetailCase userDetailCase) throws IOException {
        logger.info(userDetailCase.toString());
        System.out.println(userDetailCase.toString());
        //组参数
        Map <String ,Object> map =new HashMap<String, Object>();


    }



}
