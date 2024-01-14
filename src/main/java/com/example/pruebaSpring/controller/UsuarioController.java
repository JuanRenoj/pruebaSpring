package com.example.pruebaSpring.controller;

import com.example.pruebaSpring.model.UsuarioModel;
import com.example.pruebaSpring.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> getAllUser(){
        return usuarioService.getAllUSer();
    }
    @PostMapping()
    public UsuarioModel saveUser(@RequestBody UsuarioModel usuarioModel){
        return  usuarioService.saveUser(usuarioModel);
    }
    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> getById(@PathVariable("id") Long id){
        return usuarioService.getById(id);
    }
    @GetMapping("/getbyname")
    public  ArrayList<UsuarioModel> getByName(@RequestParam("id") String name){
        return  usuarioService.getByName(name);
    }
    @DeleteMapping(path = "/{id}")
    public  String deleteUSer(@PathVariable("id")Integer id){
        boolean deleted=usuarioService.deleteUser(id);
         return deleted ? ( "Item deleted"+id) :  ("item could´nt be deleted"+id);
    }

}
