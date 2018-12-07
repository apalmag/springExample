package mx.company.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import mx.company.code.config.RestConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Application {
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

	@Bean
	public RestConfiguration restConfiguration() {
		return new RestConfiguration();
	}

	/**
	 * Se genera un bean de rest template
	 * 
	 * @return RestTemplate
	 */
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
