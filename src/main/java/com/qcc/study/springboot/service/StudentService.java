package com.qcc.study.springboot.service;

import com.qcc.study.springboot.entity.Student;
import com.qcc.study.springboot.repository.StudentReporistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * TODO
 *
 * @author qianchaochen
 * @date 2020/5/16 17:09
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, timeout = 1000, readOnly = false, isolation = Isolation.DEFAULT)
public class StudentService {

    @Autowired
    private StudentReporistory studentReporistory;

    public Student addStudent(String name, String sex){
        Student student = Student.builder().name(name).sex(sex).build();
        studentReporistory.insertStudent(student);

        return studentReporistory.findStudentByNear();
    }

}
