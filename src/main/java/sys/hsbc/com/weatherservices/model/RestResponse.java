package sys.hsbc.com.weatherservices.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import sys.hsbc.com.weatherservices.apiModel.APIProduct;

public class RestResponse {
	
	@JsonProperty
	private List<APIProduct> products;
	
	public List<APIProduct> getProducts() {
		return products;
	}

}
