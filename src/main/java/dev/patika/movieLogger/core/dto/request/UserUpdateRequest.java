package dev.patika.movieLogger.core.dto.request;

import dev.patika.movieLogger.entities.enums.AccountStatus;
import dev.patika.movieLogger.entities.enums.Role;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateRequest {

    @NotNull(message = "User ID cannot be null")
    private Long id;

    @NotBlank(message = "Username cannot be empty")
    @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters")
    private String username;

    @NotBlank(message = "Display name cannot be empty")
    @Size(min = 2, max = 100, message = "Display name must be between 2 and 100 characters")
    private String displayName;

    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Invalid email format")
    private String email;

    @NotNull(message = "Credits cannot be null")
    @Min(value = 0, message = "Credits cannot be negative")
    private Integer credits;

    @NotNull(message = "Role cannot be null")
    private Role role;

    @NotNull(message = "Account status cannot be null")
    private AccountStatus accountStatus;

    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;

    private Boolean isMailNotificationEnabled;
    private Boolean isTwoFactorEnabled;
    private Boolean isReceiveWeeklyDigestEnabled;
} 