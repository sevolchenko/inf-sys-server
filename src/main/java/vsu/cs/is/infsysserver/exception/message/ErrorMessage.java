package vsu.cs.is.infsysserver.exception.message;

import io.swagger.v3.oas.annotations.media.Schema;

public record ErrorMessage(
        @Schema(description = "Код ошибки")
        String code,
        @Schema(description = "Сообщение ошибки")
        String message
) {
}
