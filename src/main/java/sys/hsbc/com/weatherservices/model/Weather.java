package sys.hsbc.com.weatherservices.model;

import java.util.List;

public class Weather {

	private String cod;
	private Integer cnt;
	private List<City> list;
	
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public Integer getCnt() {
		return cnt;
	}
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}
	public List<City> getList() {
		return list;
	}
	public void setList(List<City> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Weather [cod=" + cod + ", cnt=" + cnt + ", list=" + list + "]";
	}
	
	
	
}
