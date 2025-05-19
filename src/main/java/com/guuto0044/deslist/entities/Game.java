package com.guuto0044.deslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb-game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String title;

    @Column(name = "game_year")
    private Integer year;

    private String genre;
    private String plataforms;
    private Double score;
    private String imgUrl;
    private String shortDecription;
    private String longDescription;

    public Game(){

    }

    public Game(Long id, String title, Integer year, String genre, String plataforms, Double score,
                String imgUrl, String shortDecription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.plataforms = plataforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDecription = shortDecription;
        this.longDescription = longDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlataforms() {
        return plataforms;
    }

    public void setPlataforms(String plataforms) {
        this.plataforms = plataforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDecription() {
        return shortDecription;
    }

    public void setShortDecription(String shortDecription) {
        this.shortDecription = shortDecription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
