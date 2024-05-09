package vsu.cs.is.infsysserver.news;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vsu.cs.is.infsysserver.exception.GeneralException;
import vsu.cs.is.infsysserver.news.adapter.NewsMapper;
import vsu.cs.is.infsysserver.news.adapter.jpa.NewsRepository;
import vsu.cs.is.infsysserver.news.adapter.jpa.entity.News;
import vsu.cs.is.infsysserver.news.adapter.rest.dto.request.NewsCreateRequest;
import vsu.cs.is.infsysserver.news.adapter.rest.dto.request.NewsUpdateRequest;
import vsu.cs.is.infsysserver.news.adapter.rest.dto.response.NewsResponse;

import java.util.Collection;

@RequiredArgsConstructor
@Service
public class NewsService {

    private final NewsRepository newsRepository;

    private final NewsMapper newsMapper;

    public Collection<NewsResponse> getAllNews() {
        var news = newsRepository.findAll();

        return news.stream()
                .map(newsMapper::map)
                .toList();
    }

    public NewsResponse getNewsById(Long id) {
        var news = processFindNewsById(id);

        return newsMapper.map(news);
    }

    public NewsResponse createNews(NewsCreateRequest createRequest) {
        var news = newsMapper.map(createRequest);

        var savedNews = newsRepository.save(news);

        return newsMapper.map(savedNews);
    }

    @Transactional
    public NewsResponse updateNewsById(Long id, NewsUpdateRequest updateRequest) {
        var news = processFindNewsById(id);

        news.updateFromRequest(updateRequest);

        return newsMapper.map(news);
    }

    public void deleteNewsById(Long id) {
        var news = processFindNewsById(id);

        newsRepository.delete(news);
    }

    private News processFindNewsById(Long id) {
        return newsRepository.findById(id).orElseThrow(
                () -> new GeneralException("Новости по такому идентификатору не существует", HttpStatus.NOT_FOUND)
        );
    }
}
