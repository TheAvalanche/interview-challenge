package lv.ipr.interview.rest;

public class request {
	
	public String value1;
	public String value2;
	public String value3;

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2 + value3;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}
}
