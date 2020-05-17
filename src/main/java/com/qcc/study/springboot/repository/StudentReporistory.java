package com.qcc.study.springboot.repository;

import com.qcc.study.springboot.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * TODO
 *
 * @author qianchaochen
 * @date 2020/5/16 17:04
 */
@Repository
public interface StudentReporistory {

    @Update("insert into student(name, sex) values(#{student.name}, #{student.sex})")
    void insertStudent(@Param("student") Student student);

    @Select("select * from student where id = (SELECT @@IDENTITY) ")
    Student findStudentByNear();

}
