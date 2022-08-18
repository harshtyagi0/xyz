package training;

import java.util.*;

public class question{

	public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the String needs to be checked : ");
	String input=sc.nextLine();
	
	question_marks q=new question_marks();

	q.q_m(input);
	sc.close();

		
	}	

	
}

 class question_marks {
	
	public void q_m(String s){
	
		int arr[];
		int count=0;
		boolean b;
		boolean ans=true;
		for(int i=0;i<s.length();i++){
			b=Character.isDigit(s.charAt(i));
			if(b){
			count++;
			}
		}
		if(count>0 && count%2==0)
		{
			int j=0;
			arr=new int[count];
				for(int i=0;i<s.length();i++){
					b=Character.isDigit(s.charAt(i));
					if(b){
						arr[j]=i;
						j++;
					}
				}
			
			for(int i=0;i<arr.length;i+=2){
			
				System.out.println(i);
				if(!(s.substring(arr[i],arr[i+1]).contains("???")) || (Character.getNumericValue(s.charAt(arr[i]))+Character.getNumericValue(s.charAt(arr[i+1]))!=10)){
					ans =false;
					break;
				}
			
			}
			System.out.println(ans);
		}

		else 
		System.out.println("false");


	}
}