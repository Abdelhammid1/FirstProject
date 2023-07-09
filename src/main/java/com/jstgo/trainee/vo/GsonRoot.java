package com.jstgo.trainee.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class GsonRoot {

  @SerializedName("UserName")
  private String userName;
  @SerializedName("SureName")
  private String sureName;
  @SerializedName("Age")
  private int age;
  @SerializedName("Adresses")
  private Adresses adresses;
  @SerializedName("R U Working")
  private boolean rUWorking;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getSureName() {
    return sureName;
  }

  public void setSureName(String sureName) {
    this.sureName = sureName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Adresses getAdresses() {
    return adresses;
  }

  public void setAdresses(Adresses adresses) {
    this.adresses = adresses;
  }

  public boolean isrUWorking() {
    return rUWorking;
  }

  public void setrUWorking(boolean rUWorking) {
    this.rUWorking = rUWorking;
  }
}
