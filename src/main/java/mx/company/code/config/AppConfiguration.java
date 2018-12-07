/**
 * 
 */
package mx.company.code.config;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author apalma
 *
 */
@Configuration
public class AppConfiguration extends WebMvcConfigurerAdapter{

	private static final Logger LOGGER = LoggerFactory.getLogger(AppConfiguration.class);

	/**
	 * Validator para peticiones post y manejar la internacionalizacion
	 * 
	 * @param messageSource
	 *            codigos de mensaje de donde obtendra los mensajes
	 * @return LocalValidatorFactoryBean con los mensajes configurados
	 */
	@Bean
	public LocalValidatorFactoryBean validator(Properties messageSource) {
		LOGGER.info("Registrando validator para peticiones post.");
		LOGGER.info("Message info");
		LOGGER.debug("Message de debug");
		LOGGER.error("log de erro");
		LOGGER.warn("log de warning");
		LocalValidatorFactoryBean factory = new LocalValidatorFactoryBean();
		return factory;
	}

}
