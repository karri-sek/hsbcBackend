package sys.hsbc.com.weatherservices.service.impl;

import java.util.stream.Collectors;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;
import sys.hsbc.com.weatherservices.model.Weather;
import sys.hsbc.com.weatherservices.service.WeatherService;


@Service
public class WeatherServiceImpl implements WeatherService {
	final String apiUri = "https://samples.openweathermap.org/data/2.5/box/city?bbox=12,32,15,37,100026appid=b1b15e88fa797225412429c1c50c122a1&appid=a45c0be957d2ae453c9ced97fcc52dde";


	
	@Override
	public Integer getCitiesCount(String letter) {
		RestTemplate restTemplate = new RestTemplate();
		 Weather weather = restTemplate.getForObject(apiUri, Weather.class);
		 return weather.getList()
				 .stream()
				 .filter(c->c.getName().toLowerCase().startsWith(letter.toLowerCase()))
				 .collect(Collectors.toList()).size();
	}
}
