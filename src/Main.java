import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int sum=Sum(n);
            int sqsum=Sqsum(n);
            System.out.println(sum+" "+sqsum);
        }
    }
    public static int Sum(int n){
        int sum=0;
        for(int i=n;i>0;i/=10){
            sum=sum+i%10;
        }
        return sum;
    }
    public static int Sqsum(int n){
        int sum=0;
        for(int i=n*n;i>0;i/=10){
            sum=sum+i%10;
        }
        return sum;
    }
}
