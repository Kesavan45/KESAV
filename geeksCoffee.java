import java.util.*;
public class geeksCoffee{
public static void main(String[] args){
Scanner s = new Scanner (System.in);
int t=s.nextInt();
int n=0,j=0;
for(int k=0;k<t;k++){
n=s.nextInt();
j=s.nextInt();
for(int i=1;i<j;i++){
n=n/2;
}
System.out.println(n);
}
}
}