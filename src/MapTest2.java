import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class MapTest2 {
	//Chapter3 OPP - 3.11 : Lab 3.11 MapTest2
	public static void main(String[] args) {
		Map<String, String> favoriteFruits = new HashMap<String, String>();
		favoriteFruits.put("Apple", "High");
		favoriteFruits.put("Orage", "Medium");
		favoriteFruits.put("Grape", "High");
		favoriteFruits.put("Banana", "Low");
		
		Set<String> keySet = favoriteFruits.keySet();
		System.out.println("key " + " : " + "value");
		for (String key : keySet) {
			String value = favoriteFruits.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
