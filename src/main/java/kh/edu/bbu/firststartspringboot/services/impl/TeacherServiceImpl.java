package kh.edu.bbu.firststartspringboot.services.impl;

import kh.edu.bbu.firststartspringboot.models.Teacher;
import kh.edu.bbu.firststartspringboot.repositories.TeacherRepository;
import kh.edu.bbu.firststartspringboot.services.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final  TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }


    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public List<Teacher> getAllTeachers(String status) {
        return teacherRepository.findAllByStatus(status);
    }

    @Override
    public void create(Teacher teacher) {
        teacher.setStatus("ACT");
        teacherRepository.save(teacher);
    }

    @Override
    public Teacher getTeacherById(Integer id) {
        return teacherRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        Teacher findTeacher = teacherRepository.findById(id).orElse(null);
        if(findTeacher != null){
            findTeacher.setStatus("DEL");
            teacherRepository.save(findTeacher);
        }
    }


}
