package kh.edu.bbu.firststartspringboot.repositories;

import kh.edu.bbu.firststartspringboot.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    List<Category> findAllByStatus(String status);
    List<Category> findAllByStatusInOrderByIdDesc(List<String> statusList);
}
