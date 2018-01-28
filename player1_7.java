import java.util.*;
public class player1_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c;
		String s1=sc.next();
		char c1[]=s1.toCharArray();
		for(int i=0;i<s1.length();i=i+2){
			
				c=c1[i];
				c1[i]=c1[i+1];
				c1[i+1]=c;
							
		}
		for(char z:c1){
			System.out.print(z);
		}

	}

}
