package ProdutoApi.ProdutoApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@Configuration
public class ProdutoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutoApiApplication.class, args);
	}

}
