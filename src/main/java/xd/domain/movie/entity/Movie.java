package xd.domain.movie.entity;

import java.util.Optional;

public class Movie {

    private Long id;
    private String externalId;
    private String title;
    private String year;
    private String type;
    private String poster;

    private Movie(Builder builder) {
        this.id = builder.id;
        this.externalId = builder.externalId;
        this.title = builder.title;
        this.year = builder.year;
        this.type = builder.type;
        this.poster = builder.poster;
    }

    public Optional<Long> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getExternalId() {
        return Optional.ofNullable(externalId);
    }

    public Optional<String> getTitle() {
        return Optional.ofNullable(title);
    }

    public Optional<String> getYear() {
        return Optional.ofNullable(year);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    public Optional<String> getPoster() {
        return Optional.ofNullable(poster);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String externalId;
        private String title;
        private String year;
        private String type;
        private String poster;

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder withYear(String year) {
            this.year = year;
            return this;
        }

        public Builder withType(String type) {
            this.type = type;
            return this;
        }

        public Builder withPoster(String poster) {
            this.poster = poster;
            return this;
        }

        public Movie build() {
            return new Movie(this);
        }
    }
}
