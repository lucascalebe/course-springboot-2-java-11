package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

//classe de configuração
@Configuration
// roda configuração quando estiver no perfil de "teste"
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	//injeção de dependencia automatica
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		//tudo que estiver neste método será executado quando a aplicação iniciar.
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		//instanciar no banco
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}
