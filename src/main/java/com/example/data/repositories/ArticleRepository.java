package com.example.data.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.data.entites.Article;

public class ArticleRepository {
    private final List<Article> articles = new ArrayList<>();

    public void createArticle(Article article) {
        articles.add(article);
    }

    public List<Article> listAvailableArticles() {
        List<Article> availableArticles = new ArrayList<>();
        for (Article article : articles) {
            if (article.getStockQuantity() > 0) {
                availableArticles.add(article);
            }
        }
        return availableArticles;
    }
}
