package com.example.pruebaSpring.repositories;

import com.example.pruebaSpring.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    public  abstract ArrayList<UsuarioModel> findByFullname(String fullname);

}
