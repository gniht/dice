package com.company;

public class Player {
  private String name;
  private int score;


  public Player(String name){
    this.name = name;
    this.score = 0;
  }

  int getScore(){
    return this.score;
  }

  void incScore(){
    this.score++;
  }
  void incScore(int amountIncreased){
    this.score += amountIncreased;
  }

  @Override
  public String toString(){
    return "Player Name: " + this.name + " - - - Total Score: " + this.score;
  }


}
