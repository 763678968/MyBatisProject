package entity;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class TestMyBatis {
    public static void main(String[] args) throws IOException {
        // 加载MyBatis配置文件（为了访问数据库）
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        // session - connection
        SqlSession session = sessionFactory.openSession();
        String statement = "entity.personMapper.queryPersonById";
        Person person = session.selectOne(statement, 1);
        System.out.println(person);
        session.close();
    }
}
