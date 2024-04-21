package vsu.cs.is.infsysserver.news.adapter.rest.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

public record NewsCreateRequest(
        @Schema(description = "Заголовок новости", example = "Крутая новость")
        String title,
        @Schema(description = "Контент новости", example = "<p> Контент новость </p>")
        String content,
        @Schema(description = "Ссылка на главную картинку", example = "https://cs.vsu.ru/image/123")
        String imageLink
) {
}
