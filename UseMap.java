package datastructure;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
			ArrayList<String> cityOfUSA = new ArrayList<String>();
			cityOfUSA.add("NY");
			cityOfUSA.add("PA");

			ArrayList<String> cityOfBD = new ArrayList<String>();
			cityOfBD.add("Rajshahi");
			cityOfBD.add("Dhaka");

			Map<String, ArrayList<String>> hashmap2 = new LinkedHashMap<String, ArrayList<String>>();
			hashmap2.put("Bangladesh", cityOfBD);
			hashmap2.put("USA", cityOfUSA);

			for(Map.Entry<String, ArrayList<String>> country2:hashmap2.entrySet()) {
				System.out.println(country2.getKey()+ country2.getValue());
			}

		}
	}


