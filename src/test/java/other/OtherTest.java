package other;

import com.dao.UserMapper;
import com.entity.User;
import com.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class OtherTest {

    @Test
    public void getSqlSession() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<User> list=userMapper.findAll();

        for(User user : list) {
            System.out.println(user);
        }
    }
}
