import com.lakers.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


/**
 * @Author: panyusheng
 * @Date: 2020/5/9 10:40
 * @Version 1.0
 */
public class TestAccount {

    @Test
    public void findAll(){
        try {
            InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            Account account = sqlSession.selectOne("com.lakers.dao.AccountDao.findByName", "小明");
            System.out.println(account);
            System.out.println(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
