package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.model.Toy;


public interface Repo extends JpaRepository<Toy,Integer>{

    
}