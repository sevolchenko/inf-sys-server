package vsu.cs.is.infsysserver.news.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vsu.cs.is.infsysserver.news.adapter.rest.api.NewsAPI;
import vsu.cs.is.infsysserver.news.adapter.rest.dto.request.NewsCreateRequest;
import vsu.cs.is.infsysserver.news.adapter.rest.dto.request.NewsUpdateRequest;
import vsu.cs.is.infsysserver.news.adapter.rest.dto.response.NewsResponse;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RequestMapping("/news")
@RestController
public class NewsController implements NewsAPI {

    @GetMapping
    public ResponseEntity<Collection<NewsResponse>> getAllNews() {
        return ok(List.of(
                new NewsResponse(1L,
                        "new new",
                        "new new",
                        "https://new.ru/new",
                        LocalDateTime.now(),
                        null
                ),
                new NewsResponse(2L,
                        "new new new",
                        "new new new",
                        "https://new.ru/new",
                        LocalDateTime.now(),
                        LocalDateTime.now()
                )
        ));
    }

    @GetMapping("/{id}")
    public ResponseEntity<NewsResponse> getNewsById(@PathVariable Long id) {
        return ok(new NewsResponse(id,
                "new new",
                "new new",
                "https://new.ru/new",
                LocalDateTime.now(),
                null
        ));
    }

    @PostMapping
    public ResponseEntity<NewsResponse> createNews(
            @RequestBody NewsCreateRequest createRequest
    ) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new NewsResponse(1L,
                        "new new",
                        "new new",
                        "https://new.ru/new",
                        LocalDateTime.now(),
                        null
                ));
    }

    @PutMapping("/{id}")
    public ResponseEntity<NewsResponse> updateNewsById(
            @PathVariable Long id,
            @RequestBody NewsUpdateRequest updateRequest
    ) {
        return ok(new NewsResponse(1L,
                "new new",
                "new new",
                "https://new.ru/new",
                LocalDateTime.now(),
                null
        ));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNewsById(@PathVariable Long id) {
        return ok().build();
    }
}
