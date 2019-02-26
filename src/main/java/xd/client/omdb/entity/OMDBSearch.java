package xd.client.omdb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
        "Search",
        "totalResults",
        "Response"
})
public class OMDBSearch {

    @JsonProperty("Search")
    private List<OMDBMovie> OMDBMovies = new ArrayList<>();
    @JsonProperty("totalResults")
    private String totalResults;
    @JsonProperty("Response")
    private String response;

    public List<OMDBMovie> getOMDBMovies() {
        return OMDBMovies;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public String getResponse() {
        return response;
    }

    @Override
    public String toString() {
        return "OMDBSearch{" +
                "OMDBMovies=" + OMDBMovies +
                ", totalResults='" + totalResults + '\'' +
                ", response='" + response + '\'' +
                '}';
    }
}
