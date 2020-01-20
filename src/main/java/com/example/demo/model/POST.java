package com.example.demo.model;

import lombok.Data;

import java.util.Date;

@Data
public class POST {

  private String id;
  private String title;
  private String body;
  private Date createdAt;
  private Date updatedAt;

}
