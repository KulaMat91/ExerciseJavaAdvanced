package org.ClassAndInterface.Task2;

public class Movie {
    private String title;
    private String director;
    private Integer yearProduced;
    private String genre;
    private String publisher;

    public Movie(MovieBuilder movieBuilder){
        this.title = movieBuilder.getTitle();
        this.director = movieBuilder.getDirector();
        this.yearProduced = movieBuilder.getYearProduced();
        this.genre = movieBuilder.getGenre();
        this.publisher = movieBuilder.getPublisher();
    }

    public Movie(String title, String director, Integer yearProduced, String genre, String publisher) {
        this.title = title;
        this.director = director;
        this.yearProduced = yearProduced;
        this.genre = genre;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public Integer getYearProduced() {
        return yearProduced;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setYearProduced(Integer yearProduced) {
        this.yearProduced = yearProduced;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", yearProduced=" + yearProduced +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public static MovieBuilder newMovieBuilder() {
        return new MovieBuilder();
    }

    public static class MovieBuilder {
        private String title;
        private String director;
        private Integer yearProduced;
        private String genre;
        private String publisher;

        public String getTitle() {
            return title;
        }

        public String getDirector() {
            return director;
        }

        public Integer getYearProduced() {
            return yearProduced;
        }

        public String getGenre() {
            return genre;
        }

        public String getPublisher() {
            return publisher;
        }

        public MovieBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public MovieBuilder setDirector(String director) {
            this.director = director;
            return this;
        }

        public MovieBuilder setYearProduced(Integer yearProduced) {
            this.yearProduced = yearProduced;
            return this;
        }

        public MovieBuilder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public MovieBuilder setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }



        public Movie toMovie(){
          return new Movie(this);
        }
    }


}
