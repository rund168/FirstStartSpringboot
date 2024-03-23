package kh.edu.bbu.firststartspringboot.services.impl;

import kh.edu.bbu.firststartspringboot.constants.Constants;
import kh.edu.bbu.firststartspringboot.models.Article;
import kh.edu.bbu.firststartspringboot.repositories.ArticleRepository;
import kh.edu.bbu.firststartspringboot.services.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;

    @Override
    public List<Article> getAllArticles() {
        return articleRepository.findAllByStatusInOrderByIdDesc(Constants.getAllStatusString());
    }

    @Override
    public void create(Article article) {
        articleRepository.save(article);
    }

    @Override
    public Article getArticleById(Integer id) {
        return articleRepository.findById(id).orElse(null);
    }
}
