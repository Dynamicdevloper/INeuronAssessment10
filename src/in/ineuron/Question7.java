package in.ineuron;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("ABC");
	}
	
	public static void permutation(String str) {
		
		char[] ch =str.toCharArray();
		int n=str.length();
		generatePermutation(ch, 0, n-1);
	}

	private static void generatePermutation(char[] ch, int left, int right) {
		
		if(left==right) {
			System.out.println(new String(ch));
			return;
		}
		
		for(int i=left; i<=right; i++) {
			swap(ch, left, i);
			generatePermutation(ch, left+1, right);
			swap(ch,left, i);
		}
		
	}

	private static void swap(char[] ch, int left, int i) {
		
		char temp= ch[left];
		ch[left]=ch[i];
		ch[i]=temp;
		
	}
}
