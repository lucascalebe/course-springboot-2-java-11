package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;
  										
                                          //tipo Entidade = User, tipo Id = Long 
public interface UserRepository extends JpaRepository<User, Long>{
	
}
