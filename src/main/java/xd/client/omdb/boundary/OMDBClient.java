package xd.client.omdb.boundary;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import xd.client.omdb.entity.OMDBSearch;

import java.net.URI;
import java.util.Collections;

@Component
public class OMDBClient {

    public OMDBSearch getMovieData(String search) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        URI uri = UriComponentsBuilder.fromUriString("http://omdbapi.com")
                .queryParam("apiKey", "d7768d40")
                .queryParam("s", search)
                .build()
                .toUri();

        return restTemplate.getForObject(uri, OMDBSearch.class);
    }
}
