package mx.company.code.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import mx.company.code.model.BcomServiceRequestBean;
import mx.company.code.model.BcomServiceResponseBean;

@Component
public class ConsultaService implements IConsultaService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ConsultaService.class);

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public String Consultar() {
		String uri = "http://172.16.1.201:9080/AutorizationBCOMServiceWeb/BCOMService/consulta";

		// BcomServiceRequestBean bean = new BcomServiceRequestBean();
		// bean.setApp("Ventanilla");
		// bean.setCanal("Canales");
		// bean.setSucursal("4857");
		// bean.setTipoOper("0000");

		HttpHeaders headers = new HttpHeaders();
		// headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
		//headers.add("Content-Type", "application/json");

		HttpEntity<BcomServiceRequestBean> request = new HttpEntity<>(new BcomServiceRequestBean());

		ResponseEntity<BcomServiceResponseBean> response = restTemplate.exchange(uri, HttpMethod.POST, request,
				BcomServiceResponseBean.class);

		// BcomServiceResponseBean response = restTemplate.postForObject(uri, request,
		// BcomServiceResponseBean.class);

		HttpStatus statusCode = response.getStatusCode();
		LOGGER.debug("OP service --> getOper() --> Estatus de la operacion --> {}", statusCode);

		BcomServiceResponseBean bsResponse = response.getBody();
		// String bsResponse = response.getBody();
		LOGGER.debug("OP service --> getBody --> Body JSON --> {}", bsResponse);
		return null;
	}

}
