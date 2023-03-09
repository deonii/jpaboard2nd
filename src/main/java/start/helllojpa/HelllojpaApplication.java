package start.helllojpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HelllojpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelllojpaApplication.class, args);
	}
}
