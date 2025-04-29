package dev.patika.movieLogger.entities;
import dev.patika.movieLogger.entities.enums.AccountStatus;
import dev.patika.movieLogger.entities.enums.Role;
import dev.patika.movieLogger.entities.log.AchievementLog;
import dev.patika.movieLogger.entities.log.EventLog;
import dev.patika.movieLogger.entities.log.GiftLog;
import dev.patika.movieLogger.entities.log.MovieLog;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User extends BaseEntity implements UserDetails{

    @Column(name = "user_name",nullable = false)
    private String username;

    @Column(name = "display_name",nullable = false)
    private String displayName;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "credits")
    private Integer credits = 1000;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_role")
    private Role role = Role.USER;

    @Column(name = "user_status")
    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus = AccountStatus.PENDING;

    @Column(name = "user_signup_date")
    private LocalDateTime signupDate;

    @Column(name = "user_last_login")
    private LocalDateTime lastLogin;

    @Column(name = "user_two_factor_secret")
    private String twoFactorSecret;

    @Column(name = "user_password_reset_token")
    private String passwordResetToken;

    @Column(name = "user_password_reset_token_expiration")
    private LocalDateTime passwordResetTokenExpiration;

    @Column(name = "user_failed_login_attempts")
    private int failedLoginAttempts;

    @Column(name = "is_user_verified")
    private Boolean isVerified = false;

    @Column(name = "is_user_mail_notification_enabled")
    private Boolean isMailNotificationEnabled = false;

    @Column(name = "is_two_factor_enabled")
    private boolean isTwoFactorEnabled = false;

    @Column(name = "is_receive_weekly_digest_enabled")
    private Boolean isReceiveWeeklyDigestEnabled = false;

    // Follow Entity
    @OneToMany(mappedBy = "follower", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Follow> following = new ArrayList<>();

    @OneToMany(mappedBy = "followed", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Follow> followers = new ArrayList<>();

    // TODO MovieLog Entity
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<MovieLog> movieLogs = new ArrayList<>();

    // TODO WatchList Entity
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Watchlist> watchlist = new ArrayList<>();

    // TODO Comment
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Comment> comments = new ArrayList<>();

    // TODO GiftLog
    @OneToMany(mappedBy = "giftedBy", cascade = CascadeType.ALL)
    private List<GiftLog> sentGifts = new ArrayList<>();

    @OneToMany(mappedBy = "giftedTo", cascade = CascadeType.ALL)
    private List<GiftLog> receivedGifts = new ArrayList<>();

    // TODO PurchasedGift
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<PurchasedGift> purchasedGifts = new ArrayList<>();

    // TODO OwnedGift
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<OwnedGift> ownedGifts = new ArrayList<>();

    // TODO AchievementLog
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<AchievementLog> achievements = new ArrayList<>();

    // TODO VerifiedUser
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<VerifiedUser> verifiedRoles = new ArrayList<>();

    // TODO Person
    @OneToOne(mappedBy = "user")
    private Person personProfile;

    // TODO CommentVote
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<CommentVote> commentVotes = new ArrayList<>();

    // TODO EventLog
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<EventLog> eventLogs = new ArrayList<>();

    // TODO Notification
    @OneToMany(mappedBy = "receiver", cascade = CascadeType.ALL)
    private List<Notification> notifications = new ArrayList<>();

    // TODO Reports
    @OneToMany(mappedBy = "reporter", cascade = CascadeType.ALL)
    private List<Report> reportsByMe = new ArrayList<>();

    @OneToMany(mappedBy = "reportedUser", cascade = CascadeType.ALL)
    private List<Report> reportsAboutMe = new ArrayList<>();

    // TODO RefreshToken
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<RefreshToken> refreshTokens;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled();
    }
}
