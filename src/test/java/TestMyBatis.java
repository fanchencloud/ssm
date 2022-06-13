import cn.fanchencloud.ssm.entity.User;
import cn.fanchencloud.ssm.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Version: V1.0    <br/>
 * Datetime:   2022/6/13 14:41   <br/>
 * Description: 测试MyBatis
 *
 * @author: chen
 */
public class TestMyBatis {

    @Test
    public void testMyBatis() throws IOException {
        // 加载MyBatis配置文件
        InputStream inputStream = TestMyBatis.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        // 创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 获取接口实现类对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectUserById(1);
        System.out.println(user);
        sqlSession.close();
        assert inputStream != null;
        inputStream.close();
    }
}