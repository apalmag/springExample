/**
 * 
 */
package mx.company.code.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author apalma
 *
 */

@Component
@ConfigurationProperties(prefix = "sb-prueba-service")
public class RestConfiguration {

	@Value("${server.port}")
	private String server;

	public String getServer() {
		return server;
	}
	
}
