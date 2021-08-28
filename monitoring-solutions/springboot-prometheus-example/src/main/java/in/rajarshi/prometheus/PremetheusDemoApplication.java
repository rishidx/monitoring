package in.rajarshi.prometheus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PremetheusDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PremetheusDemoApplication.class, args);
	}
	
	@GetMapping("/")
	public String welcome() {
		return "<h1>Welcome !!!</h1>";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "<h1>Hello User !!!</h1>";
	}

}
