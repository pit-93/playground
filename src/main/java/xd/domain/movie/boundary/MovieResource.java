package xd.domain.movie.boundary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xd.domain.movie.control.MovieRepository;
import xd.domain.movie.entity.Movie;

import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/resource")
public class MovieResource {

    @Autowired
    private MovieRepository movieRepository;

    @RequestMapping(value = "/movie", method = RequestMethod.GET)
    public String search(@RequestParam(value = "search") String searchParam) {
       return movieRepository.findMovies(searchParam).stream()
               .map(Movie::getTitle)
               .filter(Optional::isPresent)
               .map(Optional::get)
               .collect(Collectors.joining("<br>"));
    }


}
