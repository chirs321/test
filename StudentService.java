package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.Student;


public interface StudentService {

    //根据学生id查询学生详情
    Student queryStudentById(Integer id);

    //获取学生总人数
    Integer queryAllStudentCount();
}
