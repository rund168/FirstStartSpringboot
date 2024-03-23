package kh.edu.bbu.firststartspringboot.services;

import kh.edu.bbu.firststartspringboot.models.Article;
import kh.edu.bbu.firststartspringboot.models.Category;

import java.util.List;

public interface ArticleService {
    List<Article> getAllArticles();
    void create(Article article);
    Article getArticleById(Integer id);
}
