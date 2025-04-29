package dev.patika.movieLogger.entities;

import dev.patika.movieLogger.entities.log.GiftLog;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comments")
public class Comment extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "comment_user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "comment_movie_id", nullable = false)
    private Movie movie;

    @Column(name = "comment_content")
    private String content;

    @Column(name = "comment_is_from_verified_cast",nullable = false)
    private boolean isFromVerifiedCast;

    @Column(name = "comment_is_from_verified_crew",nullable = false)
    private boolean isFromVerifiedCrew;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<Comment> replies = new ArrayList<>();

    // Her comment parent sahip olmamalı
    @ManyToOne
    @JoinColumn(name = "comment_parent_id")
    private Comment parent;

    @OneToMany(mappedBy = "comment", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GiftLog> receivedGifts = new ArrayList<>();

    @OneToMany(mappedBy = "comment", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CommentVote> votes = new ArrayList<>();

    @OneToMany(mappedBy = "reportedComment", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Report> reports = new ArrayList<>();

}
