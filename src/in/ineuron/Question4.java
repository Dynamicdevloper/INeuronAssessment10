package in.ineuron;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int ans= strLen("geeksforgeeks");
		System.out.println(ans);

	}

	private static int strLen(String str) {
		if(str.length()==0) return 0;
		return 1+strLen(str.substring(1));
	}

}
