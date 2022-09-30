package practice2;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("practice2")
public class FilehandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilehandlingApplication.class, args);
	}

}
