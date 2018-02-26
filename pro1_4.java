package pro;
import java.util.*;
public class pro1_4 {
	public static void main(String [] args){
		Scanner sc=new Scanner (System.in);
		String s1=sc.next();
		String s2=sc.next();
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		char a[]=new char[25];
		char b[]=new char[25];
		int x=0,e=0;
		for(char z:c1){
			a[x]=c1[x];
			x++;
		}x=0;
		char y;
		for(char z:c2){
			b[x]=c2[x];
			x++;
		}
		
		
		for(int i=0;i<s2.length();i++){
			y=a[i];
			for(int j=0;y!=b[i];j++){
			if(y!=b[i]){
				y++;
				e++;
			}
		}
		}
		System.out.println(e);
	}
}
