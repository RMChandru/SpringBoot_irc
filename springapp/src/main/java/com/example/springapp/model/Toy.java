package com.example.springapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name  = "Toy_Store")
public class Toy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id ;
    @Column(name = "Toy_Name")
    String name;
    @Column(name = "Category")
    String category;
    @Column(name = "ToyCost")
    int toycost;
    public Toy() {
    }
    public Toy(int id, String name, String category, int toycost) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.toycost = toycost;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getToycost() {
        return toycost;
    }
    public void setToycost(int toycost) {
        this.toycost = toycost;
    }
    
}