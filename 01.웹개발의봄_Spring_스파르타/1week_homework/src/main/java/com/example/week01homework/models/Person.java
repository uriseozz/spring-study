package com.example.week01homework.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Person {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String job;

    public Person(PersonRequestDto requestDto) {
        this.name = requestDto.getName();
        this.job = requestDto.getJob();
        this.age = requestDto.getAge();
        this.address = requestDto.getAddress();
    }

    public void update(PersonRequestDto requestDto) {
        this.name = requestDto.getName();
        this.job = requestDto.getJob();
        this.age = requestDto.getAge();
        this.address = requestDto.getAddress();
    }
}
