package com.concretepage.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.concretepage.entity.Article;

public interface ArticleRepository extends CrudRepository<Article, Long>  {

	Optional<Article> findByCategory(String category);


}
