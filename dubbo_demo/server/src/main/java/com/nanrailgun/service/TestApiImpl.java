package com.nanrailgun.service;

import com.nanrailgun.api.TestApi;
import com.nanrailgun.entity.Student;

public class TestApiImpl implements TestApi {
    @Override
    public Student getStudent(Integer id, String name) {
        Student student= new Student();
        student.setId(id);
        student.setName(name);
        return student;
    }
}
