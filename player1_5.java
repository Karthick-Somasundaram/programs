import java.util.*;
public class player1_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s[]={"0","I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"};
		String a=sc.next();
		for(int i=0;i<s.length;i++){
			if(a.equals(s[i])){
				System.out.println(i);
		}
		}
	}

}
