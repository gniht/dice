package com.company;

public class Player {
  private String name;
  private int score;


  public Player(String name){
    this.name = name;
    this.score = 0;
  }

  private int getScore(){
    return this.score;
  }

  private void incScore(){
    this.score++;
  }
  private void incScore(int amountIncreased){
    this.score += amountIncreased;
  }

  @Override
  public String toString(){
    return "Name: " + this.name + " Score: " + this.score;
  }


}
