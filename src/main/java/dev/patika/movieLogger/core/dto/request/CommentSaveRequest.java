package dev.patika.movieLogger.core.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentSaveRequest {

    @NotNull(message = "User ID cannot be null")
    private Long userId;

    @NotNull(message = "Movie ID cannot be null")
    private Long movieId;

    @NotBlank(message = "Comment content cannot be empty")
    private String content;

    private Long parentId; // null olabilir (nested comment için)
}

