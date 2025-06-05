package dev.patika.movieLogger.core.dto.response;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StreamingServiceResponse {

    private Long id;

    private String name;

    private String logoUrl;
}
