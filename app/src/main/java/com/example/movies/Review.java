package com.example.movies;

import com.google.gson.annotations.SerializedName;

public class Review {
    @SerializedName("review")
    private String review;
    @SerializedName("author")
    private String author;
    @SerializedName("type")
    private String type;

    public Review(String review, String author, String type) {
        this.review = review;
        this.author = author;
        this.type = type;
    }

    public String getReview() {
        return review;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Review{" +
                "review='" + review + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
