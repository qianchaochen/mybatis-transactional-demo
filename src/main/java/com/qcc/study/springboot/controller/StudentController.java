package com.qcc.study.springboot.controller;

import com.qcc.study.springboot.entity.Student;
import com.qcc.study.springboot.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author qianchaochen
 * @date 2020/5/16 17:15
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/add/stu")
    public Student addStu(@RequestParam("username") String name,@RequestParam("gender") String sex){

        Student student = studentService.addStudent(name, sex);
        return student;
    }

    @GetMapping("/add/stu2")
    public Student addStu2(@Param("username") String name, @RequestParam("sex") String sex){

        Student student = studentService.addStudent(name, sex);
        return student;
    }

    @GetMapping("/add/stu3")
    public Student addStu3(@Param("name") String name, @Param("sex") String sex){

        Student student = studentService.addStudent(name, sex);
        return student;
    }
}
