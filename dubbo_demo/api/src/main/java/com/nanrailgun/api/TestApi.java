package com.nanrailgun.api;

import com.nanrailgun.entity.Student;

public interface TestApi {
    Student getStudent(Integer id,String name);
}
