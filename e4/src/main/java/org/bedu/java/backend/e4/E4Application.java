package org.bedu.java.backend.e4;

import org.bedu.java.backend.e4.model.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class E4Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(E4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca su nombre: ");
		String nombre = scanner.nextLine();
		System.out.print("\nIngrese su numero telefonico: ");
		String telefono = scanner.nextLine();

		Persona persona = new Persona(nombre, telefono);
		System.out.println("Nombre de la persona: " + persona.getNombre());
		System.out.println("Telefono de la persona: " + persona.getTelefono());
	}
}
