package in.ineuron;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans =countSubStr("abcab");
		System.out.println(ans);
	}

	private static int countSubStr(String str) {
		int count=0;
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length()+1; j++) {
				String subStr=str.substring(i,j);
				if(subStr.charAt(0) == subStr.charAt(subStr.length()-1)) {
					count++;
				}
			}
		}
		return count;
	}

}
