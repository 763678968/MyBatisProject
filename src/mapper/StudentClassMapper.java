package mapper;

import entity.StudentClass;

import java.util.List;

// 操作MyBatis的接口
public interface StudentClassMapper {
    // 查询全部班级
    List<StudentClass> queryClassAndStudents();
}
