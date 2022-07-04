package kr.co.bzsys.study.controller;

import kr.co.bzsys.study.dto.ArticleForm;
import kr.co.bzsys.study.entity.Article;
import kr.co.bzsys.study.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

  @Autowired
  private ArticleRepository articleRepository;
  @GetMapping("/articles/new")
  public String newArticleForm() {
    return "articles/new";
  }

  @PostMapping("/articles/create")
  public String creatArticle(ArticleForm form) {
    System.out.println(form.toString());
    //1. Dto를 Entity로 변환
    Article article = form.toEntity();
    System.out.println(article.toString());
    // 2. Repository에게 Entity를 DB로 저장하게함
    Article saved = articleRepository.save(article);
    System.out.println(saved.toString());
    return "";

  }




}
