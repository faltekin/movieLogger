package dev.patika.movieLogger.entities;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "refresh_token")
public class RefreshToken extends BaseEntity{

    @Column(name = "refresh_token")
    private String refreshToken;

    @Column(name = "refresh_token_expire_date")
    private Date expireDate;

    @ManyToOne
    @JoinColumn(name = "refresh_token_user_id", nullable = false)
    private User user;

}
