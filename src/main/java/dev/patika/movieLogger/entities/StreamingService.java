package dev.patika.movieLogger.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "streaming_services")
public class StreamingService extends BaseEntity {

    @Column(name="streaming_services_name",nullable = false, unique = true)
    private String name;

    @Column(name="streaming_services_logo_url",nullable = false, unique = true)
    private String logoUrl; // opsiyonel alan: servisin logosu vs.

    @ManyToMany(mappedBy = "services")
    private Set<Movie> movies = new HashSet<>();
}
