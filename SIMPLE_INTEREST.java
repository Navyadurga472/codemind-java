import java.util.*;
public class SimpleInterest
{
    public static void main(String args[])
    {
        int P,T,R,I;
        Scanner sc=new Scanner(System.in);
        P=sc.nextInt();
        T=sc.nextInt();
        R=sc.nextInt();
        I=P*T*R/100;
        System.out.println(I);
        sc.close();
        
    }
    
}