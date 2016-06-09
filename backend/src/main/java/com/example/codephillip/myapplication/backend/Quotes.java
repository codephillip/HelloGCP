package com.example.codephillip.myapplication.backend;


/**
 * Created by codephillip on 6/9/16.
 */
public class Quotes {
    Long id;
    String who;
    String whom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getWhom() {
        return whom;
    }

    public void setWhom(String whom) {
        this.whom = whom;
    }
}
