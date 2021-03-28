package sys.hsbc.com.weatherservices.apiModel;


public class ResponseEntity {

	int noOfCitiesMatched;

	public int getNoOfCitiesMatched() {
		return noOfCitiesMatched;
	}

	public void setNoOfCitiesMatched(int noOfCitiesMatched) {
		this.noOfCitiesMatched = noOfCitiesMatched;
	}

	@Override
	public String toString() {
		return "ResponseEntity [noOfCitiesMatched=" + noOfCitiesMatched + "]";
	}
}
