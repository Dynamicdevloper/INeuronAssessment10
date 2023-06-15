package in.ineuron;

import java.util.ArrayList;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ans=new ArrayList<>();
		ans.add(1);
		ans.add(2);
		ans.add(3);
		ans.add(4);
		ans.add(5);
		ans.add(6);
		ans.add(7);
		ans.add(8);
		ans.add(9);
		
		int res =findLastNumber(ans,0);
		
		System.out.println(res);
	}

	private static int findLastNumber(ArrayList<Integer> list,int count) {
		
		if(list.size() ==1) {
			return list.get(0);
		}
		if(count ==0) {
			for(int i=0; i<list.size(); i++) {
				//System.out.print(list.get(i)+" ");
				list.remove(i);
				
			}
			count =1;
		}else {
			for(int i=list.size()-1; i>=0; i-=2) {
			//System.out.print(list.get(i)+" ");
				list.remove(i);
			}
			count=0;
		}
		
		return findLastNumber(list,count);
	}

}
