/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estancias.exterior.repositorios;

import com.estancias.exterior.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface usuarioRepositorio extends JpaRepository<Usuario, String> {
    
     @Query("SELECT u FROM usuario u WHERE u.email = :email")
    public Usuario buscarPorEmail(@Param("email")String email);
    
    
    @Query("SELECT u FROM usuario u WHERE u.nombre = :nombre")
    public Usuario buscarPorNombre(@Param("nombre")String nombre);
}
