package vsu.cs.is.infsysserver.staticPage.adapter.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import vsu.cs.is.infsysserver.staticPage.adapter.jpa.entity.StaticPage;

public interface StaticPageRepository extends JpaRepository<StaticPage, Long> {
}
