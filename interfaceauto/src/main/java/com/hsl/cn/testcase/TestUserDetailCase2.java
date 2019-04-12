package com.hsl.cn.testcase;


import com.hsl.cn.config.BaseTest;
import com.hsl.cn.model.UserDetailCase;
import com.hsl.cn.repository.UserDetailCaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.*;

@SpringBootTest
public class TestUserDetailCase2  extends BaseTest {
    @Autowired
    UserDetailCaseDao userDetailCaseDao;

    @DataProvider(name="userdetaildata")
    public Iterator<Object[]> getdata(){

        List<UserDetailCase> list= userDetailCaseDao.findAll();
        System.out.println(list);

        List<Object[]> result=new ArrayList<>();
        Iterator it=list.iterator();
        while(it.hasNext()){
            result.add(new Object[] { it.next() });
        }
        return  result.iterator();
    }


    @DataProvider(name="userdetaildata2")
    public Object [][] getdata2() {
        UserDetailCase u1=userDetailCaseDao.findByUserId(1);
        System.out.println(u1.toString()+"111111111111111111");
        Object[][] data =new Object[][] {
                {u1}
        };
        return data;
    }



    @DataProvider(name="userdetaildata3")
    public Object [][] getdata3() {
        Map <String ,String> map =new HashMap <>();
        map.put("id","1");
        map.put("userid","1");
        Object[][] data=new Object[][]{
                {map}
        };
        return data;
    }

    @Test(dataProvider = "userdetaildata2")
    public void TestUserList2(UserDetailCase userDetailCase) throws IOException {
        System.out.println(userDetailCase.toString());
        //组参数
        Map <String ,Object> map =new HashMap<String, Object>();
//
//        //发请求,返回响应的内容
//        String  result= HttpClientUtils.sendGet(Config.getUserDetailUrl,map);
//
//        //解析断言
//        Gson gson=new Gson();
//        //对象转成json串 gson.toJson(result);
//       Map<String,Object > resultjson =gson.fromJson(result,Map.class);
//       for (Map.Entry<String ,Object> entry:resultjson.entrySet() ) {
//           System.out.println(entry.getKey()+":"+entry.getValue());
//       }



    }
    @Test(dataProvider = "userdetaildata3")
    public void TestUserList3(Map<String,String> map) throws IOException {
        System.out.println(map.toString());;

    }



}
