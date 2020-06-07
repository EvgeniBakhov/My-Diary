package com.evgenbakhov.mydiary.pojos;

import java.time.LocalDate;

public class Day {

    private String title;
    private String description;
    private String image;
    private boolean satisfied;

    public Day(String title,
               String description,
               String image,
               boolean satisfied,
               LocalDate date) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.satisfied = satisfied;
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    private LocalDate date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isSatisfied() {
        return satisfied;
    }

    public void setSatisfied(boolean satisfied) {
        this.satisfied = satisfied;
    }
}
