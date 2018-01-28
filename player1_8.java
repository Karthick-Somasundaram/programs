import java.util.*;
public class player1_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		c1[0]-=32;
		c2[0]-=32;
		for(char z:c1){
			System.out.print(z);
		}
		System.out.println();
		for(char z:c2){
			System.out.print(z);
		}

	}

}
