import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Test1 {
	static ArrayList<String> subString = new ArrayList<String>();

	public static boolean checkString(String check1, String check2) {
		boolean accept = false;

		ArrayList<Character> myCheck = new ArrayList<Character>();
		ArrayList<Character> dumpString = new ArrayList<Character>();
		for (int i = 0; i < check2.length(); i++)
			myCheck.add(check2.charAt(i));
		for (int i = 0; i < check1.length(); i++) {
			for (int j = 0; j < myCheck.size(); j++)
				if (check1.charAt(i) == myCheck.get(j)) {
					myCheck.remove(j);
					dumpString.add(check1.charAt(i));
				}
		}
		StringBuilder sb = new StringBuilder(); 
        for (Character ch : dumpString) { 
            sb.append(ch); 
        } 
        String string = sb.toString(); 
		System.out.println(string);
		if(string.equals(check1))
			accept=true;
		return accept;
	}

	public static void main(String[] args) {
		String str = "qploresinazxrhqknhoilerthf";
		String letter = "lion";
		int max = letter.length();
		int strLenght = str.length();

		System.out.println(checkString("Sky07", "yS9pkYn0Qd7"));
	}
}
