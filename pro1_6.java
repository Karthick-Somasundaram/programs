package pro;
import java.util.*;
public class pro1_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<N-1;i++){
			int x=a[i],e=0;
			for(int j=i+1;j<N;j++){
				if(x==a[j]){
					e++;
				}
			}
			if(e!=0)
				System.out.print(x+" ");
			
		}

	}

}
