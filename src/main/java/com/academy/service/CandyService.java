package com.academy.service;

import com.academy.model.entity.Candy;

import java.util.Arrays;
import java.util.List;

public class CandyService {
    public List<Candy> getCandies() {
        return Arrays.asList(
                new Candy("Chocolate", 10),
                new Candy("Nuts in chocolate", 15),
                new Candy("lollipop", 5)
        );
    }

}
