package lv.ipr.interview.rest;

public class Response {
	
	private String a;

	public Response(String a) {
		this.a = a;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Response response = (Response) o;

		return a != null ? a.equals(response.a) : response.a == null;
	}
}
