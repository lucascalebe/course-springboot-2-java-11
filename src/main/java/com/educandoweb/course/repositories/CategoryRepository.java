package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;
  										
                                          //tipo Entidade = Category, tipo Id = Long 
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
