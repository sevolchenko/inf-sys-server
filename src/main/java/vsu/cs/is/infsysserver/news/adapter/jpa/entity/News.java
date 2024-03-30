package vsu.cs.is.infsysserver.news.adapter.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import vsu.cs.is.infsysserver.news.adapter.rest.dto.request.NewsUpdateRequest;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "news")
@Entity
public class News {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "news_sequence"
    )
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "image_link", nullable = false)
    private String imageLink;

    @CreationTimestamp
    @Column(name = "publication_at")
    private LocalDateTime publicationAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public void updateFromRequest(NewsUpdateRequest request) {
        this.title = request.title();
        this.content = request.content();
        this.imageLink = request.imageLink();
        this.updatedAt = LocalDateTime.now();
    }
}
