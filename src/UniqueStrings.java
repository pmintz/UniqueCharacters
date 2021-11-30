import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueStrings {
	
	//Comparator c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aaabbcccdabc";
		//output - a3b2c3d1a1b1c1
		List list = new ArrayList<>();
		
		
		char[] charArr = input.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		int value = 0;
		
		for(char c: charArr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c) +1);
			}else {
				map.put(c, 1);
			}
				
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.toString());
		}
		
		

	}

}
