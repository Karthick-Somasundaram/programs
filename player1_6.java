import java.util.*;
public class player1_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int e=0;
		
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		int k=0;
		int a[]=new int[c1.length];
		for(int i=0;i<c1.length;i++){
			e=0;
			for(int j=c2[i];j!=c1[i];j++){
				if(j!=c1[i]){
					e++;
				}
				a[i]=e;
			}
			System.out.println(e);
		}int h=0;
		for(int i=1;i<c1.length;i++){
			if(a[0]!=a[i]){
				h++;
			}
		}
		if(h==0)
			System.out.println("yes");

	}

}
