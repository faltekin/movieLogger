package dev.patika.movieLogger.core.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentUpdateRequest {

    @NotNull(message = "Comment ID cannot be null")
    private Long id;

    @NotBlank(message = "Comment content cannot be empty")
    private String content;
}

