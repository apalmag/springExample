package mx.company.code.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import mx.company.code.model.TokenValidoResponse;

@Component
public class TokeknValidatorJwt {
	
	@Value("${jwt.secret}")
	private String secret;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TokeknValidatorJwt.class);

	public TokenValidoResponse validarToken(String token) {
		LOGGER.debug("Validando token --->{}", TokeknValidatorJwt.class);
		TokenValidoResponse response = new TokenValidoResponse();
		String secret = "password";
		try {

			// Validador de token
			Jwts.parser().setSigningKey(secret).parseClaimsJws(token);// .getBody();

			LOGGER.info("Token Valido!!! ---> \n {}", token);
			response.setToken(token);
			response.setValido(true);
		} catch (JwtException e) {
			// En caso de que el token no sea valido
			LOGGER.error("Ha ocurrido un error al validar el token --> {}", e.getMessage());
			response.setValido(false);
			response.setToken(token);
			// e.printStackTrace();
		}
		return response;
	}

	/**
	 * @return the secret
	 */
	public String getSecret() {
		return secret;
	}
}
