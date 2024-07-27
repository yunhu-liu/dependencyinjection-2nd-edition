package com.luitech.dipractices;

import com.luitech.dipractices.ch01.ConsoleMessageWriter;
import com.luitech.dipractices.ch01.IMessageWriter;
import com.luitech.dipractices.ch01.Salutation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DipracticesApplication {

	public static void main(String[] args) {

		IMessageWriter writer = new ConsoleMessageWriter();
		Salutation salutation = new Salutation(writer);
		salutation.exclaim("Hello DI");

		SpringApplication.run(DipracticesApplication.class, args);

	}

}
