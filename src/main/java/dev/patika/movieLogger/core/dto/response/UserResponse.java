package dev.patika.movieLogger.dto.response;

import dev.patika.movieLogger.entities.enums.AccountStatus;
import dev.patika.movieLogger.entities.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    private Long id;
    private String username;
    private String displayName;
    private String email;
    private Integer credits;
    private Role role;
    private AccountStatus accountStatus;
    private LocalDateTime signupDate;
    private LocalDateTime lastLogin;
    private Boolean isVerified;
    private Boolean isMailNotificationEnabled;
    private Boolean isTwoFactorEnabled;
    private Boolean isReceiveWeeklyDigestEnabled;
    private Integer followersCount;
    private Integer followingCount;
    private Integer watchlistCount;
    private Integer commentsCount;
    private Integer achievementsCount;
} 