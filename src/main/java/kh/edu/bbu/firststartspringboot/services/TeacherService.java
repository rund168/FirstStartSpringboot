package kh.edu.bbu.firststartspringboot.services;

import kh.edu.bbu.firststartspringboot.models.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();
    void create(Teacher teacher);
    Teacher getTeacherById(Integer id);
    void delete(Integer id);
    List<Teacher> getAllTeachers(String status);
}
