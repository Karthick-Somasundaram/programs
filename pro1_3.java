package pro;
import java.util.*;
public class pro1_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String X=sc.next();
		String Y=sc.next();
		int e=0,r=0,x=0;
		char r1[]=new char[25];
		char r2[]=new char[25];
		char c1[]=X.toCharArray();
		char c2[]=Y.toCharArray();
		for(char z:c1){
			r1[x]=z;
			x++;
		}
		x=0;
		for(char y:c2){
			r2[x]=y;
			x++;
		}

		for(int i=0;i<Y.length();i++){
			if(r1[i]==r2[i]){
				e++;
			}else{
				r++;
			}
		}
		System.out.println(r);

	}

}
