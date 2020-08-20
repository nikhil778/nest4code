import java.util.*;
public class day_4 {
    //find the odd and even numbers
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int a1=sc.nextInt();
        String st=Integer.toString(a1);
        System.out.println(st);
        int len=st.length();
        int count=0;
        int count1=0;
         for(int i=0;i<len;i++)
        {
            if (st.charAt(i)%2==1) {
                count1++;
            }
            else if(st.charAt(i)%2==0)
            {
                count++;
            }
        }
        System.out.println("Odd digit : " +count1);
        System.out.println("Evan digit : " +count);
        
    }
}
