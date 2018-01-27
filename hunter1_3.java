import java.util.*;
public class set1_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a[]=new int[N];
		int b[]=new int[N];
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
		}int x=0;
		for(int i=0;i<N;i++){
			if(i==a[i]){
				b[x]=i;
				x++;
			}
		}
		int u=0;
		for(int z:b){
		
		}
		System.out.println();
		int e=0;
		
		for(int z:b){
			if(z!=0){
				e++;
			}
		}
		int d[]=new int[e];
		for(int i=0;i<e;i++){
			d[i]=b[i];
		}
		for(int z:d){
			System.out.print(z+" ");
		}
	}

}
