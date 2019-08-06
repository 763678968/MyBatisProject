package mapper;

import entity.Student;

import java.util.List;

// 操作MyBatis的接口
public interface StudentMapper {
    /**
     * 1. 方法名和mapper.xml文件中标签的id值相同
     * 2. 方法的输入参数和mapper.xml文件中标签的parameterTyep类型一致
     * 3. 方法的返回值和mapper.xml文件中标签的resultType类型一致
     */
//    public abstract Student queryStudentByStuno(int stuno);
    Student queryStudentByStuno(int stuno);

    // 查询全部
    List<Student> queryAllStudents();

    // 增加
    void addStudent(Student student);

    // 删除
    void deleteStudentByStuno(int stuno);

    // 修改
    void updateStudentByStuno(Student student);
}