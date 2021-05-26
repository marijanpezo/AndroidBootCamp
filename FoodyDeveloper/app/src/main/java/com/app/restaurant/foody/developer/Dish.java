package com.app.restaurant.foody.developer;

import androidx.annotation.NonNull;

import java.math.BigDecimal;

public class Dish {

    String title;
    String description;
    int price;

    Dish(String title, String description, int price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @NonNull
    @Override
    public String toString() {
        return "Dish{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
