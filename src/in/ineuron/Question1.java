package in.ineuron;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(powerOfThree(6));
	}
	
	public static boolean powerOfThree(int n) {
		int power=1;
		
		while(power<n) {
			power*=3;
		}
		
		if(power==n) return true;
		return false;
	}

}
