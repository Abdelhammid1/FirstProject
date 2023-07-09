package com.jstgo.trainee.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class Adresses {

  @SerializedName("Egypt")
  private ArrayList<Object> egypt;
  @SerializedName("UAE")
  private String uAE;

  public ArrayList<Object> getEgypt() {
    return egypt;
  }

  public void setEgypt(ArrayList<Object> egypt) {
    this.egypt = egypt;
  }

  public String getuAE() {
    return uAE;
  }

  public void setuAE(String uAE) {
    this.uAE = uAE;
  }
}
