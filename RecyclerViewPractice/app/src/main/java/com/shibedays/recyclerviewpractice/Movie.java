package com.shibedays.recyclerviewpractice;

/**
 * Created by ttbot on 2/10/2018.
 */

public class Movie {

    private String title, genre, year;

    public Movie(){

    }

    public Movie(String title, String genre, String year){
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle(){
        return title;
    }

    public String getGenre(){
        return genre;
    }

    public String getYear(){
        return year;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setYear(String year){
        this.year = year;
    }

}
