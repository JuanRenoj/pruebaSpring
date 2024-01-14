package com.example.pruebaSpring.services;

import com.example.pruebaSpring.model.UsuarioModel;
import com.example.pruebaSpring.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> getAllUSer(){
      return (ArrayList<UsuarioModel>)  usuarioRepository.findAll();
    }

    public UsuarioModel saveUser(UsuarioModel usuarioModel){

            return usuarioRepository.save(usuarioModel);

    }
    public Optional<UsuarioModel> getById(Long id){
        return usuarioRepository.findById(id);
    }
    public ArrayList<UsuarioModel> getByName(String fullname){
        return  usuarioRepository.findByFullname(fullname);
    }
    public boolean deleteUser(long id){
        try {
            usuarioRepository.deleteById(id);
            return  true;
        }catch (Exception e){
            System.out.println(e);
            return  false;
        }
    }

}
