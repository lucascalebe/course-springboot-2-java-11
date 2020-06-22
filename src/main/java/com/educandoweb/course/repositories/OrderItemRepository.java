package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;
  										
                                          //tipo Entidade = OrderItem, tipo Id = Long 
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
