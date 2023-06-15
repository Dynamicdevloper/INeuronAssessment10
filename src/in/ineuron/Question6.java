package in.ineuron;

public class Question6 {

	public static void main(String[] args) {
		
	
		System.out.println(getTotalMoves(3));
	}
	
	public static int getTotalMoves(int n) {
        if (n <= 0)
            return 0;
        return 2 * getTotalMoves(n - 1) + 1;
    }


}
