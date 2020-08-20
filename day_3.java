import java.util.*;
public class day_3 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the 1st String : ");
			String s1=sc.next();
			System.out.println("Enter the 2nd String : ");
			String s2=sc.next();
			String a=null;
			String b=null;

			//+s2.substring(0,2);
			
			if (s1.length() == s2.length()) {
				a=s2.substring(s2.length()-2)+s2.substring(0,2);
				System.out.println(a);
				b=s1.substring(s1.length()-2)+s1.substring(0,2);
				System.out.println(b);
			}
			else if (s1.length()>s2.length()) {
				a=s2.substring(s2.length()-2)+s1.substring(2, 7)+s2.substring(0, 2);
				System.out.println(a);
				
				b=s1.substring(s1.length()-2)+s2.substring(2, 6)+s1.substring(0, 2);
				System.out.println(b);
			}
		}
	}

}
