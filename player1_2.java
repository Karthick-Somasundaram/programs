import java.util.*;
public class player1_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int c=1;
		for(int i=1;i<=N;i++){
			c*=i;
		}
		System.out.println(c);
	

	}

}
