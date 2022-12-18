package constructor.Movie;

import java.time.LocalDate;
import java.util.ArrayList;

public class movie {
    public String country;
    public String title;
    public String genre;
    public LocalDate releaseDate;
    public String director;


    public movie(String country, String title, LocalDate releaseDate, String casts ){
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
        //this.casts = casts;


    }


    public String toString() {
        return "Country: " + country + "\n Title: " + title + "Release Date: " + releaseDate +
                "\n Total number of casts: ";//+ casts.length ;
    }
}
/*
Task04:
    1. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
            addCast(String): adds the given string argument to the arrayList casts
            addCasts(String[]): adds the given string array argument to the arrayList casts
            toString(): returns the name of country, title, release date, and total number of casts

    2. create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2021
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

        print the full info of the movie

 */