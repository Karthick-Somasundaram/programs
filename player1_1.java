import java.util.*;
public class player1_1 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	for(int i=0,j=0;i<s.length();i++,j++){
		System.out.print(s.charAt(s.length()-j-1));
	}
	}
}
