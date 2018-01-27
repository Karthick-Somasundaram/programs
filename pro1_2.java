import java.util.*;
public class pro1_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a,e=0;
		for(int i=1;c>0;i++){
			c=c/10;
			e++;
		}int d;
		c=a;
		for(int i=1;i<=b;i++){
			d=(int) Math.pow(10,e-1);
			System.out.println(d);
			c=c%d;
			e--;
		}
		System.out.println(c);
	}
}
