package kh.edu.bbu.firststartspringboot.repositories;

import kh.edu.bbu.firststartspringboot.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
    List<Article> findAllByStatusInOrderByIdDesc(List<String> statustList);
}
