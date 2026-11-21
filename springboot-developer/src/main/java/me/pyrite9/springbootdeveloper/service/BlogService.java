package me.pyrite9.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.pyrite9.springbootdeveloper.domain.Article;
import me.pyrite9.springbootdeveloper.dto.AddArticleRequest;
import me.pyrite9.springbootdeveloper.dto.UpdateArticleRequest;
import me.pyrite9.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor        // final이 붙거나 @NotNull이 붙은 필드의 생성ㅅ자 추가
@Service    // bean 등록
public class BlogService {

    private final BlogRepository blogRepository;

    // 블로그 글 추가
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    // 블로그 글 목록 조회
    public List<Article> findAll() {
        return blogRepository.findAll();
    }


    public Article findById(long id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    }

    // 삭제
    public void delete(long id) {
        blogRepository.deleteById(id);
    }


    // 업데이트
    @Transactional
    public Article update(long id, UpdateArticleRequest request) {
        Article article = blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));

        article.update(request.getTitle(), request.getContent());

        return article;
    }
}
