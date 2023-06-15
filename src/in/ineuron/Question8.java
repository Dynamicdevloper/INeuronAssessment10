package in.ineuron;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res= countConsonants("abc de");
		System.out.println(res);
	}
	
	public static int countConsonants(String str) {
		
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'
					|| str.charAt(i)=='u' || str.charAt(i)=='o'
					||str.charAt(i)==' ') continue;
			count++;
		}
		
		return count;
	}

}
