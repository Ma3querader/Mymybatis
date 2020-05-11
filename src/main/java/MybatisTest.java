import com.lakers.dao.AccountDao;
import com.lakers.domain.Account;
import com.lakers.vo.QueryVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: panyusheng
 * @Date: 2020/5/10 23:27
 * @Description: dao接口代理对象的方式
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

        // 根据密码查询
        QueryVo vo = new QueryVo();
        List<String> pwds = new ArrayList<>();
        pwds.add("10");
        pwds.add("15");
        pwds.add("16");
        vo.setPasswords(pwds);
        List<Account> byCondition = mapper.findByPwd(vo);
        System.out.println(byCondition);



        session.commit();
        // 释放资源
        session.close();
        in.close();

    }
}
