//package kh.edu.bbu.firststartspringboot.repositories.impl;
//
//import kh.edu.bbu.firststartspringboot.models.Teacher;
//import kh.edu.bbu.firststartspringboot.repositories.TeacherRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class TeacherRepositoryImpl implements TeacherRepository {
//    // Local Database
//    private final List<Teacher> teacherList = new ArrayList<>();
//    // Default constructor
//    // Block
//    {
//        if(teacherList.isEmpty()){
//            for(int i=1; i<20; i++){
//                Teacher teacher = new Teacher(i, "Teacher Name : "+ i, "");
//                if(i%2==0){
//                    teacher.setGender("Male");
//                }else{
//                    teacher.setGender("Female");
//                }
//                teacherList.add(teacher);
//            }
//        }
//    }
//    @Override
//    public List<Teacher> findAll() {
//        return teacherList;
//    }
//
//    @Override
//    public void save(Teacher teacher) {
//        if(teacher.getId()==0) {
//            teacher.setId(teacherList.size() + 1);
//            teacherList.add(teacher);
//        }else{
//            for (int i=0; i<teacherList.size(); i++){
//                if(teacher.getId()==teacherList.get(i).getId()){
//                    teacherList.remove(teacherList.get(i));
//                    teacherList.add(i, teacher);
//                    break;
//                }
//            }
//        }
//    }
//
//    @Override
//    public Teacher findById(Integer id) {
//        for(Teacher teacher: teacherList){
//            if(id==teacher.getId()){
//                return teacher;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public void delete(Teacher teacher) {
//        for (int i=0; i<teacherList.size(); i++){
//            if(teacher.getId()==teacherList.get(i).getId()){
//                teacherList.remove(teacherList.get(i));
//                break;
//            }
//        }
//    }
//
//}
