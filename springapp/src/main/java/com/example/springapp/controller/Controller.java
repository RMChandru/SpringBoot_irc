package com.example.springapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.repository.Repo;
import com.example.springapp.model.Toy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class Controller {
    @Autowired
    Repo repo;
    @GetMapping("/Toy")
    public List<Toy> getAll()
    {
        List<Toy> students =repo.findAll();
        return students;
    }
    @GetMapping("/Toy/{id}")
    public Toy getStudent(@PathVariable int id)
    {
        Toy toystore = repo.findById(id).get();
        return toystore;
    }
    @PostMapping("/Toy/add")
    public void createStudent(@RequestBody Toy toystore)
    {
        repo.save(toystore);
    }
    @PutMapping("/Toy/update/{id}")
    public void updateStudent(@PathVariable int id)
    {
        Toy toystore = repo.findById(id).get();
        toystore.setName("Doll");
        toystore.setToycost(100);
        toystore.setCategory("Kids");
        repo.save(toystore);
    }
    @DeleteMapping("/Toy/delete/{id}")
    public void deleteStudent(@PathVariable int id)
    {
        Toy toystore = repo.findById(id).get();
        repo.delete(toystore);
    }
}