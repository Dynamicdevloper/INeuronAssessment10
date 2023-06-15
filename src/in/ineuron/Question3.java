package in.ineuron;

import java.util.ArrayList;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> al=new ArrayList<>();
		generateSubStrings("abc",al);
	}

	private static void generateSubStrings(String str,ArrayList<Character> list) {
		
		generateSubStringsHelper(str, 0, str.length()-1, list);
	}

	private static void generateSubStringsHelper(String ch,int start, int end, ArrayList<Character> list) {
		
		if(start>end) {
			for(Character s: list) {
				System.out.print(s);
			}
			System.out.println();
			return;
		}
		
		generateSubStringsHelper(ch,start+1,end, list);
		list.add(ch.charAt(start));
		generateSubStringsHelper(ch,start+1,end, list);
		list.remove(list.size()-1);
		
	}

}
