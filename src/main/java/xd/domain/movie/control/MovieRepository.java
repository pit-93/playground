package xd.domain.movie.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xd.client.omdb.boundary.OMDBClient;
import xd.client.omdb.entity.OMDBSearch;
import xd.domain.movie.entity.Movie;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MovieRepository {

    @Autowired
    private OMDBClient OMDBClient;
    @Autowired
    private MovieMapper mapper;

    public List<Movie> findMovies(String name) {
        OMDBSearch movieData = OMDBClient.getMovieData(name);
        return movieData.getOMDBMovies().stream()
                .map(omdbMovie -> mapper.toMovie(omdbMovie))
                .collect(Collectors.toList());
    }
}
