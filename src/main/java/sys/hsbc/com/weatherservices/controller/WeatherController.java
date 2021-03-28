package sys.hsbc.com.weatherservices.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sys.hsbc.com.weatherservices.apiModel.ResponseEntity;
import sys.hsbc.com.weatherservices.service.WeatherService;

@RestController
public class WeatherController {

	@Autowired
	private WeatherService weatherService;

	@GetMapping("/getCities")
	public ResponseEntity getProducts(@RequestParam(required = true) Optional<String> letter) {
		ResponseEntity responseEntity = new ResponseEntity();
		System.out.println(" letter "+letter.get());
		
		responseEntity.setNoOfCitiesMatched(weatherService.getCitiesCount(letter.get()));
		return responseEntity;
	}
}
