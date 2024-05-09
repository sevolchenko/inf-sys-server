package vsu.cs.is.infsysserver.staticPage.adapter;

import org.mapstruct.Mapper;
import vsu.cs.is.infsysserver.staticPage.adapter.jpa.entity.StaticPage;
import vsu.cs.is.infsysserver.staticPage.adapter.rest.dto.request.StaticPageCreateRequest;
import vsu.cs.is.infsysserver.staticPage.adapter.rest.dto.response.StaticPageResponse;

@Mapper
public interface StaticPageMapper {

    StaticPageResponse map(StaticPage event);

    StaticPage map(StaticPageCreateRequest staticPageCreateRequest);
}
