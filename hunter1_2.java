import java.util.*;
public class set1_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a[]=new int [N];
		int b[]=new int[N];
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
		}int x=0;
		for(int i=0;i<N;i++){
			int c=a[i],e=0;
			for(int j=i+1;j<N;j++){
				if(c==a[j]){
					a[j]=0;
					e++;
				}
			}			
		}System.out.println();
		for(int y:a){
	//	System.out.print(" "+y);	
		}
		for(int i=0;i<N;i++){
			if(a[i]!=0){
				b[x]=a[i];
				x++;
			}
		}//System.out.println();
		for(int z:b){
			if(true&&z!=0){
			System.out.print(" "+z);
			}System.out.println();
		}int u;
	
		int d=0,e=0;
		for(int i=0;i<N;i++){
			if(b[i]!=0){
			e++;
			}
		}
		int k[]=new int[e];
		for(int i=0;i<e;i++){
			k[i]=b[i];
		}
		
		for(int i=0;i<e;i++){
			int c=k[i];
			for(int j=i+1;j<e;j++){
				if(c<k[j]){
					u=c;
					c=k[j];
					k[j]=u;
				}
				k[i]=c;
			}
		}
		for(int z:k){
			if(z!=0)
			System.out.print(z);
		}
			}

}
