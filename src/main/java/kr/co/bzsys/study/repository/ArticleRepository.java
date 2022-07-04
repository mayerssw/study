package kr.co.bzsys.study.repository;

import kr.co.bzsys.study.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}
