package com.sparta.week01.prac;

public class Tutor {
    private String name;
    private String bio;

    //기본생성자
    public Tutor() {
    }

    //생성자
    public Tutor(String name, String bio){
        this.name = name;
        this.bio = bio;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setBio(String bio) {
        this.bio = name;
    }

    //getter
    public String getName() {
        return this.name;
    }

    public String getBio() {
        return this.bio;
    }

}
