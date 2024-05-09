package vsu.cs.is.infsysserver.news.adapter;

import org.mapstruct.Mapper;
import vsu.cs.is.infsysserver.news.adapter.jpa.entity.News;
import vsu.cs.is.infsysserver.news.adapter.rest.dto.request.NewsCreateRequest;
import vsu.cs.is.infsysserver.news.adapter.rest.dto.response.NewsResponse;

@Mapper
public interface NewsMapper {

    NewsResponse map(News news);

    News map(NewsCreateRequest newsCreateRequest);

}
