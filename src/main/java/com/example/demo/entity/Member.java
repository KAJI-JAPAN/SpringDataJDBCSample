package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// getter setterの設定　hashCode() equals() toString()　追加
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
  @Id
  private Integer id;
  private String name;
  
}
