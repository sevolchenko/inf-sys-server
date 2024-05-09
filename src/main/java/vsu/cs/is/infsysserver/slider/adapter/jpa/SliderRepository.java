package vsu.cs.is.infsysserver.slider.adapter.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import vsu.cs.is.infsysserver.slider.adapter.jpa.entity.SliderElement;

public interface SliderRepository extends JpaRepository<SliderElement, Long> {
}
