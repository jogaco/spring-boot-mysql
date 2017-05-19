/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operatornew.gamemanager.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "game")
public class Game {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Integer id;

 private String name;

 private String description;

 public Game() {}

 public Game(String name, String description) {
   this.name = name;
   this.description = description;
 }

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

 public String getDescription() {
   return description;
 }

 public void setDescription(String description) {
   this.description = description;
 }
}