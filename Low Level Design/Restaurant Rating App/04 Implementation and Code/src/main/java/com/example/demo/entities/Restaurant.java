package com.example.demo.entities;

public class Restaurant {
  private Integer id;
  private String name;
  private Double averageRating = 0.0;

  private Integer ratedByPeople = 0;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getAverageRating() {
    return averageRating / ratedByPeople;
  }

  public void setAverageRating(Double averageRating) {
    this.averageRating = averageRating;
  }

  public void incrementRating(Double rating) {
    this.averageRating += rating;
    this.ratedByPeople += 1;
  }

  @Override
  public String toString(){
    return String.format("Restaurant [id=%d]", this.getId());
  }
}
