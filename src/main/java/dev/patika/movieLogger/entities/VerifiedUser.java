package dev.patika.movieLogger.entities;

import dev.patika.movieLogger.entities.enums.VerifiedRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "verified_users")
public class VerifiedUser extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "verified_users_user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "verified_users_movie_id", nullable = false)
    private Movie movie;

    @Enumerated(EnumType.STRING)
    @Column(name = "verified_users_verified_role")
    private VerifiedRole verifiedRole; // CAST, CREW, DIRECTOR, WRITER vb.
}

