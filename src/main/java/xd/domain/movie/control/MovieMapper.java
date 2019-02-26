package xd.domain.movie.control;

import org.springframework.stereotype.Component;
import xd.client.omdb.entity.OMDBMovie;
import xd.domain.movie.entity.Movie;

@Component
public class MovieMapper {

    public Movie toMovie(OMDBMovie omdbMovie){
        return Movie.builder()
                .withTitle(omdbMovie.getTitle())
                .build();
    }
}
