import com.lakers.dao.AccountDao;
import com.lakers.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @Author: panyusheng
 * @Date: 2020/5/10 23:27
 * @Version 1.0
 */
public class MybatisTest {
    public static void main(String[] args) throws Exception {
        // 读取配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        // 创建 SqlSessionFactory 的构建者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 创建 SqlSessionFactory 工厂
        SqlSessionFactory factory = builder.build(in);
        // 使用 SqlSessionFactory 工厂对象创建 SqlSession 对象
        SqlSession session = factory.openSession();
        // 使用 SqlSession 创建 dao 接口的代理对象
        AccountDao mapper = session.getMapper(AccountDao.class);

        // 使用代理对象执行查询所有方法
//        List<Account> accounts = mapper.findAll();
//        for(Account ac : accounts) {
//            System.out.println(ac);
//        }

//        Account ac = mapper.findByName("小明");
//        System.out.println(ac);

        Account ac = new Account();
        ac.setUsername("小明");
        List<Account> byCondition = mapper.findByCondition(ac);
        for (Account acc : byCondition) {
            System.out.println(acc);
        }


        session.commit();
        // 释放资源
        session.close();
        in.close();

    }
}
