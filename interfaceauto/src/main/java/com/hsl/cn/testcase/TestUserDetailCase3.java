package com.hsl.cn.testcase;

import com.hsl.cn.model.UserDetailCase;
import com.hsl.cn.repository.UserDetailCaseDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserDetailCase3 {
    @Autowired
    UserDetailCaseDao userDetailCaseDao;

    @Test
    public void TestUserList2() throws IOException {
        List<UserDetailCase> userDetailCase =userDetailCaseDao.findAll();
        System.out.println(userDetailCase.toString());
        //组参数
        Map <String ,Object> map =new HashMap<String, Object>();
        //map.put("id",userDetailCase.getUserId());
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

}
