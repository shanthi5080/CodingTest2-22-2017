package codingtestFeb22;

import java.util.Map;
import java.util.HashMap;

public class FirstDupCharString {
	public static void main(String[] args) {

		String str = "prashanthi";

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		{

			for (int i = 0; i < str.length(); i++) {
				if (!map.containsKey(str.charAt(i))) {

					map.put(str.charAt(i), (Integer) 1);
				} else {
					map.put(str.charAt(i), map.get(str.charAt(i) + 1));
					System.out.println(" the first duplicate char is "
							+ str.charAt(i));
					break;
				}

				

			}
		}
	}
}