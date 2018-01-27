import java.util.*;
public class set1_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
		}int c,d=0;
		for(int i=0;i<N;i++){
			int e=0;
			c=a[i];
			for(int j=i+1;j<N;j++){
			
			if(c==a[j]){
				e++;
				d++;
			}
			}
			if(e!=0)
			{
				System.out.println(c);
			}
		
		}
		if(d==0){
			System.out.println("Unique");
		}
	}

}
