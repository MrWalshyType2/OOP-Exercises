package doggo_competition;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String args[]) {
		int input = 27;
		List<Integer> st = new ArrayList<>();
		List<Integer> nd = new ArrayList<>();
		List<Integer> rd = new ArrayList<>();
		List<Integer> th = new ArrayList<>();
		st.add(1);
		nd.add(2);
		rd.add(3);
		th.addAll(List.of(0, 4, 5, 6, 7, 8, 9));
		
		for (int i = 1; i <= 100; i++) {
			if (i == input) { continue; }
			
			String num = Integer.toString(i);
			char lastChar = num.charAt(num.length() - 1);
			int lastNum = Character.getNumericValue(lastChar);
			
			if (st.contains(Integer.valueOf(lastNum))) {
				if (i != 11) {
					System.out.println(num + "st");
				} else {
					System.out.println(num + "th");
				}
			} else if ((nd.contains(Integer.valueOf(lastNum)) && (i < 10 || i > 20)) || i == 12) {
				if (i != 12) {
					System.out.println(num + "nd");
				} else {
					System.out.println(num + "th");
				}
			} else if (rd.contains(Integer.valueOf(lastNum))) {
				if (i != 13) {
					System.out.println(num + "rd");
				} else {
					System.out.println(num + "th");
				}
			} else if (th.contains(Integer.valueOf(lastNum))) {
				System.out.println(num + "th");
			}

		}
	}
}
