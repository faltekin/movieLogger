package dev.patika.movieLogger.core.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportSaveRequest {

    @NotNull(message = "Reporter user ID cannot be null")
    private Long reporterUserId;

    @NotNull(message = "Reported user ID cannot be null")
    private Long reportedUserId;

    @NotNull(message = "Comment ID cannot be null")
    private Long commentId;

    @NotBlank(message = "Reason cannot be blank")
    private String reason;
}

