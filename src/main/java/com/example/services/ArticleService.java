package com.example.services;

import java.util.List;

import com.example.entites.Article;
import com.example.repositories.ArticleRepository;
import com.example.services.interfaces.IArticleService;

public class ArticleService implements IArticleService {
    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public void createArticle(String name, int stockQuantity) {
        Article article = new Article(name, stockQuantity);
        articleRepository.createArticle(article);
    }

    @Override
    public List<Article> listAvailableArticles() {
        return articleRepository.listAvailableArticles();
    }
}
