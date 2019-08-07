package test;

import entity.Address;
import entity.Grade;
import entity.Student;
import entity.StudentBusiness;
import mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    // 查询单个学生
    public static void queryStudentByStuno() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession

        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        Student student = studentMapper.queryStudentByStuno(1); // 接口中的方法 -> SQL语句

        System.out.println(student);
        session.close();
    }

    // 查询单个学生 Grade
    public static void queryStudentsWithNosInGrade() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession

        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        Grade grade = new Grade();
        List<Integer> stuNos = new ArrayList<>();
        stuNos.add(1);
        stuNos.add(2);
//        stuNos.add(53);
        grade.setStuNos(stuNos);
        List<Student> students = studentMapper.queryStudentsWithNosInGrade(grade); // 接口中的方法 -> SQL语句

        System.out.println(students);
        session.close();
    }

    // 查询单个学生 HashMap
    public static void queryStudentByIdWithHashMap() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession

        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        Student student = studentMapper.queryStudentByIdWithHashMap(2); // 接口中的方法 -> SQL语句

        System.out.println(student);
        session.close();
    }

    // 查询单个学生，使用SQL标签
    public static void queryStuByNOrAWithSQLTag() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession

        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

        StudentMapper studentMapper = session.getMapper(StudentMapper.class);

        Student stu = new Student();
        stu.setStuAge(24);
        stu.setStuName("ls");

        Student student = studentMapper.queryStuByNOrAWithSQLTag(stu); // 接口中的方法 -> SQL语句

        System.out.println(student);
        session.close();
    }

    // 查询单个学生 ID
    public static void queryStudentById() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession

        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        Student student = studentMapper.queryStudentById(2); // 接口中的方法 -> SQL语句

        System.out.println(student);
        session.close();
    }

    // 查询单个学生 学号
    public static void queryStuByStuno() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession

        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        Student student = studentMapper.queryStuByStuno(2); // 接口中的方法 -> SQL语句

        System.out.println(student);
        session.close();
    }

    // 查询单个学生
    public static void queryStudentByNoWithOO() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession

        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        StudentBusiness studentBusiness = studentMapper.queryStudentByNoWithOO(2); // 接口中的方法 -> SQL语句

        System.out.println(studentBusiness);
        session.close();
    }

    // 查询学生，结果为Map类型
    public static void queryStudentOutByHashMap() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession

        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        HashMap<String, Object> studentMap = studentMapper.queryStudentOutByHashMap(); // 接口中的方法 -> SQL语句

        System.out.println(studentMap);
        session.close();
    }

    // 查询所有学生，结果为Map类型
    public static void queryAllStudentsOutByHashMap() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession

        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        List<HashMap<String, Object>> studentMap = studentMapper.queryAllStudentsOutByHashMap(); // 接口中的方法 -> SQL语句

        System.out.println(studentMap);
        session.close();
    }

    // 查询学生总数
    public static void queryStudentCount() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession

        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        int count = studentMapper.queryStudentCount(); // 接口中的方法 -> SQL语句

        System.out.println(count);
        session.close();
    }

    // 查询单个学生byName
    public static void queryStudentByStuname() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession

        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        Student student = studentMapper.queryStudentByStuname("ww53"); // 接口中的方法 -> SQL语句

        System.out.println(student);
        session.close();
    }

    // 查询单个学生（使用了转换器）
    public static void queryStudentByStunoWithConverter() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession

        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        Student student = studentMapper.queryStudentByStunoWithConverter(1); // 接口中的方法 -> SQL语句

        System.out.println(student);
        session.close();
    }

    // 查询全部学生
    public static void queryAllStudents() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession
        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

//        String statement = "mapper.studentMapper." + "queryAllStudents";
//        List<Student> students = session.selectList(statement);
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        List<Student> students = studentMapper.queryAllStudents();

        System.out.println(students);
        session.close();
    }

    // 查询全部学生 WithArray
    public static void queryStudentsWithArray() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession
        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

//        String statement = "mapper.studentMapper." + "queryAllStudents";
//        List<Student> students = session.selectList(statement);
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);

        int[] stuNos = {1, 2, 53};
        List<Student> students = studentMapper.queryStudentsWithArray(stuNos);

        System.out.println(students);
        session.close();
    }

    // 查询全部学生 WithList
    public static void queryStudentsWithList() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession
        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

//        String statement = "mapper.studentMapper." + "queryAllStudents";
//        List<Student> students = session.selectList(statement);
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);

        List<Integer> stuNos = new ArrayList<>();
        stuNos.add(1);
        stuNos.add(2);
        stuNos.add(53);

        List<Student> students = studentMapper.queryStudentsWithList(stuNos);

        System.out.println(students);
        session.close();
    }

    // 查询全部学生
    public static void queryStudentsWithObjectArray() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession
        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

        StudentMapper studentMapper = session.getMapper(StudentMapper.class);

        Student stu1 = new Student();
        stu1.setStuNo(1);
        Student stu2 = new Student();
        stu2.setStuNo(2);
        Student stu53 = new Student();
        stu53.setStuNo(53);
        Student[] stus = new Student[] {stu1, stu2, stu53};
        List<Student> students = studentMapper.queryStudentsWithObjectArray(stus);

        System.out.println(students);
        session.close();
    }

    // 查询全部学生，并且根据姓名排序
    public static void queryStudentOrderByColumn() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession
        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

//        String statement = "mapper.studentMapper." + "queryAllStudents";
//        List<Student> students = session.selectList(statement);
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        List<Student> students = studentMapper.queryStudentOrderByColumn("stuno");

        System.out.println(students);
        session.close();
    }

    // 根据姓名或年龄查询学生
    public static void queryStudentByStuageOrStuname() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession
        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

//        String statement = "mapper.studentMapper." + "queryAllStudents";
//        List<Student> students = session.selectList(statement);
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        Student student = new Student();
        student.setStuAge(24);
//        student.setStuName("%w%");
        student.setStuName("w");
        List<Student> students = studentMapper.queryStudentByStuageOrStuname(student);

        System.out.println(students);
        session.close();
    }

    // 根据姓名或年龄查询学生（输入参数HashMap）
    public static void queryStudentByStuageOrStunameWithHashMap() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession
        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

        StudentMapper studentMapper = session.getMapper(StudentMapper.class);

        Map<String, Object> studentMap = new HashMap<>();
        studentMap.put("stuAge", 24);
        studentMap.put("stuName", "zs");

        List<Student> students = studentMapper.queryStudentByStuageOrStunameWithHashMap(studentMap);

        System.out.println(students);
        session.close();
    }

    // 根据地址查学生
    public static void queryStudentByAddress() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession
        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
//        Address address = new Address();
//        address.setHomeAddress("xa");
//        address.setSchoolAddress("x");

        Student student = new Student();
        Address address = new Address();
        address.setHomeAddress("xa");
        address.setSchoolAddress("x");
        student.setAddress(address);

//        List<Student> students = studentMapper.queryStudentByAddress(address);
        List<Student> students = studentMapper.queryStudentByAddress(student);

        System.out.println(students);
        session.close();
    }

    // 根据存储过程查询某个年级的学生总数
    public static void queryCountByGradeWithProcedure() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession
        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

//        String statement = "mapper.studentMapper." + "queryAllStudents";
//        List<Student> students = session.selectList(statement);
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);

        Map<String, Object> params = new HashMap<>();
        params.put("gName", "g1"); // 指定存储过程的输入参数gName的值是g1

//        int count = studentMapper.queryCountByGradeWithProcedure(params); // gName: s1
        studentMapper.queryCountByGradeWithProcedure(params); // 调用存储过程，并传入输入参数

        // 获取存储过程的输出参数
        Object count = params.get("sCount");

        System.out.println(count);
        session.close();
    }

    // 增加学生（带转换器）
    public static void addStudentWithConverter() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession
        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

//        String statement = "mapper.studentMapper." + "addStudent";
        Student student = new Student(53, "ww53", 23, "s3");
        student.setStuSex(true); // 1

//        int count = session.insert(statement, student); // statement：指定执行的SQL   student：SQL中需要的参数(? ? ?)
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        studentMapper.addStudentWithConverter(student);

        session.commit(); // 提交事务

        System.out.println("增加成功");
        session.close();
    }

    // 删除学生
    public static void deleteStudentByStuno() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession
        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

//        String statement = "mapper.studentMapper." + "deleteStudentByStuno";
//        int count = session.delete(statement, 3); // statement：指定执行的SQL   student：SQL中需要的参数(? ? ?)

        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        studentMapper.deleteStudentByStuno(13);
        session.commit(); // 提交事务

        System.out.println("删除成功");
        session.close();
    }

    // 根据学号删除学生（存储过程）
    public static void deleteStudentByStunoWithProcedure() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession
        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("sno", 3);
        studentMapper.deleteStuBynoWithProcedure(map);

        session.commit();
        session.close();
    }

    // 修改学生
    public static void updateStudentByStuno() throws IOException {
        // Connection - SqlSession操作MyBatis
        // conf.xml -> reader
        Reader reader = Resources.getResourceAsReader("conf.xml");
        // reader -> SqlSession
        // 可以通过build的第二参数指定数据库环境
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();

//        String statement = "mapper.studentMapper." + "updateStudentByStuno";
        // 修改的参数
        Student student = new Student();
        // 修改哪个人，where stuno = 2
        student.setStuNo(2);
        // 修改成什么样子？
        student.setStuName("ls");
        student.setStuAge(24);
        student.setGraName("g1");
//        int count = session.update(statement, student);
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        studentMapper.updateStudentByStuno(student);

        session.commit(); // 提交事务

        System.out.println("修改成功");
        session.close();
    }

    public static void main(String[] args) throws IOException {
//        queryStudentByStuno();
//        queryStudentByStuname();
//        queryStudentOrderByColumn();
//        queryStudentByStuageOrStuname();
//        queryStudentByAddress();
//        queryStudentByStuageOrStunameWithHashMap();
//        queryCountByGradeWithProcedure();
//        deleteStudentByStunoWithProcedure();
//        queryStudentCount();
//        queryStuByStuno();
//        queryStudentOutByHashMap();
//        queryAllStudentsOutByHashMap();
//        queryStudentById();
//        queryStudentByIdWithHashMap();
//        queryStuByNOrAWithSQLTag();
//        queryStudentsWithNosInGrade();
//        queryStudentsWithArray();
//        queryStudentsWithList();
//        queryStudentsWithObjectArray();
        queryStudentByNoWithOO();
//        queryStudentByStunoWithConverter();
//        queryAllStudents();
//        addStudent();
//        addStudentWithConverter();
//        deleteStudentByStuno();
//        updateStudentByStuno();
//        queryAllStudents();
    }
}
