package mybatis;

import com.dao.*;
import com.entity.*;
import com.utils.MyBatisUtils;
import com.utils.SerialNumberUtils;
import org.apache.ibatis.session.SqlSession;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class MyBatisTest {
    private SqlSession sqlSession;

    @Before
    public void before() {
        sqlSession = MyBatisUtils.getSqlSession();
    }

    @Test
    public void selectUser() {
        UserMapper mapper=sqlSession.getMapper((UserMapper.class));

        System.out.println(mapper.selectUserAll());
    }

    @Test
    public void userTest(){
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<String> authorities=new LinkedList<>();
        User user=userMapper.login("12321", "123321");

        if( user != null) {
            for(Authority authority : user.getAuthority()) {
                authorities.add(authority.getType());
            }
        }
        System.out.println(authorities);
    }

    @After
    public void after() {
        sqlSession.commit();
        sqlSession.close();
    }
}