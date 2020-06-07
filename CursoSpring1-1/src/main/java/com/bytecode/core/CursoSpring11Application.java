package com.bytecode.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.bytecode.core.model.Conexion;

@SpringBootApplication
public class CursoSpring11Application implements CommandLineRunner{
	@Autowired
	@Qualifier("beanConexion")
	private Conexion conexion;

	public static void main(String[] args) {
		SpringApplication.run(CursoSpring11Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println(conexion.getDb());
	}
}
