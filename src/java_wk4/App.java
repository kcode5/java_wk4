package java_wk4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

	public static void main(String[] args) {
	
		//1-3. define instances of ArrayList, HashSet and HashMap
		List<String> employeeNames = new ArrayList<String>();
		Set<Integer> ids = new HashSet<Integer>();
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		//4. entries for both collections
		employeeNames.add("Fred");
		employeeNames.add("Bob");
		employeeNames.add("Sam");
		employeeNames.add("Earl");
		employeeNames.add("Bart");
		
		ids.add(0);
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		
		//5. load employeeMap with for loop: iterate over ids using .put to add new k/v pairs
		for (int i = 0; i < employeeNames.size(); i++) {
			employeeMap.put(i, employeeNames.get(i));
		}	
			
		//6. create employeeMap keySet and loop to print k/v pairs 
		Set<Integer> empKeys = employeeMap.keySet();		
		 
		for (Integer key : empKeys) {
			System.out.println(key + " : " + employeeMap.get(key));
		}	 
		
		//7. define idsBuilder
		StringBuilder idsBuilder = new StringBuilder();
		
		//8. loop over ids Hashset and append ids
		for (int i = 0; i < ids.size(); i++) {
			idsBuilder.append(i + "-");
		}
		
		//9.convert to String and print ids
		System.out.println(idsBuilder.toString());
		
		//10. define namesBuilder
		StringBuilder namesBuilder = new StringBuilder();
		
		//11. loop over employeeNames ArrayList and append values
		for (int i = 0; i < employeeNames.size(); i++) {
			namesBuilder.append(employeeNames.get(i) + " ");
		}
		
		//12. convert to String and print values
		System.out.println(namesBuilder.toString());

	}		
			
		
}
