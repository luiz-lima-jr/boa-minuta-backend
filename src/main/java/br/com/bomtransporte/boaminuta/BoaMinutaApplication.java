package br.com.bomtransporte.boaminuta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication()
@EnableScheduling
public class BoaMinutaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoaMinutaApplication.class, args);
	}

}
