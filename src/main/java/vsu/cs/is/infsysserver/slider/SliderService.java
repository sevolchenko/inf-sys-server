package vsu.cs.is.infsysserver.slider;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vsu.cs.is.infsysserver.slider.adapter.SliderMapper;
import vsu.cs.is.infsysserver.slider.adapter.jpa.SliderRepository;
import vsu.cs.is.infsysserver.slider.adapter.jpa.entity.SliderElement;
import vsu.cs.is.infsysserver.slider.adapter.rest.dto.request.SliderElementCreateRequest;
import vsu.cs.is.infsysserver.slider.adapter.rest.dto.request.SliderElementUpdateRequest;
import vsu.cs.is.infsysserver.slider.adapter.rest.dto.response.SliderElementResponse;

import java.util.Collection;

@RequiredArgsConstructor
@Service
public class SliderService {

    private final SliderRepository sliderRepository;

    private final SliderMapper sliderMapper;

    public Collection<SliderElementResponse> getSlider() {
        return sliderRepository.findAll().stream().map(sliderMapper::map).toList();
    }

    public SliderElementResponse getSliderElementById(Long id) {
        return sliderMapper.map(findByIdOrThrow(id));
    }

    public SliderElementResponse createSliderElement(SliderElementCreateRequest sliderElementCreateRequest) {
        var savedSliderElement = sliderRepository.save(sliderMapper.map(sliderElementCreateRequest));

        return sliderMapper.map(savedSliderElement);
    }

    @Transactional
    public SliderElementResponse updateSliderElementById(Long id,
                                                         SliderElementUpdateRequest sliderElementUpdateRequest) {
        var sliderElement = findByIdOrThrow(id);
        sliderElement.updateFromRequest(sliderElementUpdateRequest);

        var upadatedSliderElement = sliderRepository.save(sliderElement);

        return sliderMapper.map(upadatedSliderElement);
    }

    public void deleteSliderElementById(Long id) {
        sliderRepository.delete(findByIdOrThrow(id));
    }

    private SliderElement findByIdOrThrow(Long id) {
        return sliderRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("По идентификатору: " + id
                        + " не найдено ни одного элемента слайдера"));
    }

}
