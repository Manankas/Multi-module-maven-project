package project.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages="project")
@EntityScan("project.data")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
