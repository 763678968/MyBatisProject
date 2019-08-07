package mapper;

import entity.Address;
import entity.Grade;
import entity.Student;
import entity.StudentBusiness;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 操作MyBatis的接口
public interface StudentMapper {
    /**
     * 1. 方法名和mapper.xml文件中标签的id值相同
     * 2. 方法的输入参数和mapper.xml文件中标签的parameterTyep类型一致
     * 3. 方法的返回值和mapper.xml文件中标签的resultType类型一致
     */
//    public abstract Student queryStudentByStuno(int stuno);
    Student queryStudentByStuno(int stuno);

    Student queryStudentById(int stuno);
    Student queryStudentByIdWithHashMap(int stuno);

    List<Student> queryStudentsWithNosInGrade(Grade grade);

    List<Student> queryStudentsWithArray(int[] stuNos);
    List<Student> queryStudentsWithList(List<Integer> stuNos);

    StudentBusiness queryStudentByNoWithOO(int stuno);
    List<Student> queryStudentsWithObjectArray(Student[] students);

    Student queryStuByNOrAWithSQLTag(Student student);
    int queryStudentCount();

    Student queryStuByStuno(int stuno);

    // 查询全部
    List<Student> queryAllStudents();
    HashMap<String, Object> queryStudentOutByHashMap();

    List<HashMap<String, Object>> queryAllStudentsOutByHashMap();

    // 增加
//    void addStudent(Student student);

    Student queryStudentByStuname(String stuName);

    List<Student> queryStudentOrderByColumn(String column);

    List<Student> queryStudentByStuageOrStuname(Student student);

    List<Student> queryStudentByStuageOrStunameWithHashMap(Map<String, Object> map);

//    List<Student> queryStudentByAddress(Address address);
    List<Student> queryStudentByAddress(Student student);

    void addStudentWithConverter(Student student);

    // 删除
    void deleteStudentByStuno(int stuno);

    // 修改
    void updateStudentByStuno(Student student);

    Student queryStudentByStunoWithConverter(int stuno);

    // 根据存储过程查询某个年级的学生总数
    void queryCountByGradeWithProcedure(Map<String, Object> params);

    void deleteStuBynoWithProcedure(Map<String, Object> params);

}