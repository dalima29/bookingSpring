package it.ariadne.bookingspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"it.ariadne.bookingspring"})
@EntityScan("it.ariadne.bookingspring.entity")
@EnableJpaRepositories("it.ariadne.bookingspring.dao")
@ServletComponentScan(basePackages = {"it.ariadne.bookingspring"})
public class BookingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingSpringApplication.class, args);
	}
}
