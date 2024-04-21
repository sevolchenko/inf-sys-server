package vsu.cs.is.infsysserver.news.adapter.rest.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

public record NewsResponse(
        @Schema(description = "Идентификатор новости", example = "1")
        Long id,
        @Schema(description = "Заголовок новости", example = "Крутая новость")
        String title,
        @Schema(description = "Контент новости", example = "<p> Контент новость </p>")
        String content,
        @Schema(description = "Ссылка на главную картинку", example = "https://cs.vsu.ru/image/123")
        String imageLink,
        @Schema(description = "Дата и время публикации")
        LocalDateTime publicationAt,
        @Schema(description = "Дата и время обновления")
        LocalDateTime updatedAt
) {
}
