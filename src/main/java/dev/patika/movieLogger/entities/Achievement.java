package dev.patika.movieLogger.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "achievements")
public class Achievement extends BaseEntity {

    @Column(name = "achievements_title",nullable = false, unique = true)
    private String title;

    @Column(name ="achievements_desctiption",nullable = false)
    private String description;

    @Column(name = "achievements_icon_url",nullable = false)
    private String iconUrl;


}