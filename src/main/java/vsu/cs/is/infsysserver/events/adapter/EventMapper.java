package vsu.cs.is.infsysserver.events.adapter;

import org.mapstruct.Mapper;
import vsu.cs.is.infsysserver.events.adapter.jpa.entity.Event;
import vsu.cs.is.infsysserver.events.adapter.rest.dto.request.EventCreateRequest;
import vsu.cs.is.infsysserver.events.adapter.rest.dto.response.EventResponse;

@Mapper
public interface EventMapper {

    EventResponse map(Event event);

    Event map(EventCreateRequest eventCreateRequest);
}
