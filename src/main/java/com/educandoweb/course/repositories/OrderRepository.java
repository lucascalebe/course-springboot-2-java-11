package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;
  										
                                          //tipo Entidade = Order, tipo Id = Long 
public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
