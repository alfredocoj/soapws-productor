package br.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.ws.conf.JPAConfiguration;

@SpringBootApplication
public class WssoapApplication {

	public static void main(String[] args) {
		SpringApplication.run(WssoapApplication.class, args);
		
		new JPAConfiguration();
	}
}
