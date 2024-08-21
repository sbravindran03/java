package Basicproblems;
import  java.util.*;
public class primecirular{
    public static boolean  isprime(int n){
        if(n==0 ||n==1)
        return false;
        for (int i=2;i<n;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String cir =sc.nextLine();
        boolean iscir=true;
        char[] a=cir.toCharArray();
        int n =a.length;
        for(int i =1; i<=n;i++){
            char  first =a[0];
    for(int j=0; j<a.length-1;j++){
        a[j]=a[j+1];

    }
    a[a.length-1]=first;
cir=new String(a);
if(isprime(Integer.parseInt(cir)==false)){
    
}
}
    }

}