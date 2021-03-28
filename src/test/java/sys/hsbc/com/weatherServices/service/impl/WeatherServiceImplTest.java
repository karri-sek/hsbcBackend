package sys.hsbc.com.weatherServices.service.impl;


import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.web.client.RestTemplate;

import sys.hsbc.com.weatherservices.service.WeatherService;


public class WeatherServiceImplTest {

    @Mock
    private RestTemplate restTemplate;
   
    private WeatherService weatherService;
    
    private WeatherService getServiceWithMockValues(String letter){
    	weatherService = createNiceMock(WeatherService.class);
        expect(weatherService.getCitiesCount(letter)).andReturn(3);
        replay(weatherService);
        return weatherService;
    }

    @Test
    public void weatherServiceShouldReturnSizeFromMocks() {
    	weatherService = getServiceWithMockValues("r");
    	int count = weatherService.getCitiesCount("r");
        Assert.assertEquals(count, 3);
       
    }
}