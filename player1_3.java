import java.util.*;
public class player1_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int b=N,e=0;
		for(int i=0;b>0;i++){
			b/=10;
			e++;
		}
		int c=N;
		System.out.println(e);
		for(int i=0;i<e;i++){
			b=c%10;
			System.out.print(b);
			c=c/10;
		}

	}

}
