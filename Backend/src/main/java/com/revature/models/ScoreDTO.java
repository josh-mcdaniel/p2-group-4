package com.revature.models;

public class ScoreDTO {

    private int score;
    private int user_id;


    public ScoreDTO() {
        super();
        // TODO Auto-generated constructor stub
    }


    public ScoreDTO(int score, int user_id) {
        super();
        this.score = score;
        this.user_id = user_id;
    }


    public int getScore() {
        return score;
    }


    public void setScore(int score) {
        this.score = score;
    }


    public int getUser_id() {
        return user_id;
    }


    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }


    @Override
    public String toString() {
        return "ScoreDTO [score=" + score + ", user_id=" + user_id + "]";
    }


}