package kh.edu.bbu.firststartspringboot.repositories;

import kh.edu.bbu.firststartspringboot.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository  extends JpaRepository<Teacher, Integer> {
    List<Teacher> findAllByStatus(String status);

}
