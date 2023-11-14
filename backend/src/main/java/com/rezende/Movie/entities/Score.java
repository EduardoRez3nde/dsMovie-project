package com.rezende.Movie.entities;

import com.rezende.Movie.entities.pk.ScorePK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {

    @EmbeddedId
    private final ScorePK id = new ScorePK();

    private Double _value;

    public Score() {}

    public Score(Movie movie, User user, Double value) {
        this.id.setMovie(movie);
        this.id.setUser(user);
        this._value = value;
    }

    public User getUser() {
        return this.id.getUser();
    }

    public void setUser(User user) {
        this.id.setUser(user);
    }

    public Movie getMovie() {
        return this.id.getMovie();
    }

    public void setMovie(Movie movie) {
        this.id.setMovie(movie);
    }

    public Double getValue() {
        return _value;
    }

    public void setValue(Double value) {
        this._value= value;
    }
}
