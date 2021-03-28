package sys.hsbc.com.weatherServices.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import sys.hsbc.com.weatherservices.apiModel.ResponseEntity;
import sys.hsbc.com.weatherservices.model.Weather;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WeatherControllerTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void shouldBeAbleToCallAndGetProducts() throws Exception {
		ResponseEntity responseEntity = restTemplate.getForObject("/getCities?letter=z", ResponseEntity.class);
		assertTrue(responseEntity.getNoOfCitiesMatched()>0);
	}

}
