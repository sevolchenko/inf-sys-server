package vsu.cs.is.infsysserver.news.adapter.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import vsu.cs.is.infsysserver.news.adapter.jpa.entity.News;

public interface NewsRepository extends JpaRepository<News, Long> {
}
