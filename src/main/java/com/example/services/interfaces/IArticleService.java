package com.example.services.interfaces;

import java.util.List;

import com.example.entites.Article;

public interface IArticleService {
    void createArticle(String name, int stockQuantity);
    List<Article> listAvailableArticles();
}
