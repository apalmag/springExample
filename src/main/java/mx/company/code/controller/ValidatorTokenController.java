package mx.company.code.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import mx.company.code.model.TokenValidoResponse;
import mx.company.code.service.IConsultaService;
import mx.company.code.util.TokeknValidatorJwt;

@RestController
@RequestMapping("/token")
public class ValidatorTokenController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ValidatorTokenController.class);

	@Autowired
	private TokeknValidatorJwt validadorJwt;
	
	@Autowired
	private IConsultaService consultaService;

	@RequestMapping(value = "/validador", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ApiOperation(value = "Validador de token", notes = "Valida un token")
	@ApiResponses(value = { @ApiResponse(code = 500, message = "En caso de que se presente un error inesperado.") })
	public ResponseEntity<TokenValidoResponse> validadorToken(@RequestHeader String token) {
		LOGGER.info("Entrando al controller -->{}", ValidatorTokenController.class);
		//TokenValidoResponse responseToken = validadorJwt.validarToken(token);
		String respuesta = consultaService.Consultar();
		//LOGGER.info("Token validado -->{} ", responseToken.toString());
		LOGGER.debug("Message de debug");
		LOGGER.error("log de erro");
		LOGGER.warn("log de warning");
		LOGGER.trace("LOG  De trance");
		
		
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
}
