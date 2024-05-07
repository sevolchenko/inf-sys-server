package vsu.cs.is.infsysserver.slider.adapter;

import org.mapstruct.Mapper;
import vsu.cs.is.infsysserver.slider.adapter.jpa.entity.SliderElement;
import vsu.cs.is.infsysserver.slider.adapter.rest.dto.request.SliderElementCreateRequest;
import vsu.cs.is.infsysserver.slider.adapter.rest.dto.response.SliderElementResponse;

@Mapper
public interface SliderMapper {

    SliderElementResponse map(SliderElement sliderElement);

    SliderElement map(SliderElementCreateRequest sliderElementCreateRequest);
}
