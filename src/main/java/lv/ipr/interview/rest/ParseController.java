package lv.ipr.interview.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ParseController {

	public static String LINE_SEPARATOR = "\n";

	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public String doAction(@RequestBody request x) {
		String resS = new String("");
		try {
			String[] str = x.value1.split(" ");
			HashMap<String, Integer> map = new HashMap<>();
			
			for (int i = 0; i < str.length; i++) {
				if (map.get(str[i]) != null) {
					map.put(str[i], map.get(str[i]) + 1);
				} else {
					map.put(str[i], 1);
				}
			}

			Response response = new Response("");
			
			for (Map.Entry<String, Integer> e : map.entrySet()) {
				resS = resS + " " + e.getKey() + " : " + e.getValue() + LS();
			}
			response.setA(resS);
			return resS;
		} catch (Exception e) {
			Class npe = NullPointerException.class;
			if (e.getClass().getName().equals(npe.getName())) {
				resS = "NULL_EXCEPTION";
			} else  {
				resS = "EXCEPTION";
			}
		}
		return null;
	}

	private static String LS() {
		return LINE_SEPARATOR;
	}
}
