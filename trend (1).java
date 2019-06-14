import java.util.*;
class trend {
public static void main(String args[]) {
int n,a,b;
Scanner t=new Scanner(System.in);
n=t.nextInt();
a=n/10;
b=a%10;
if(a%3==0)
System.out.println("trendy");
else
System.out.println("Non trendy");
}}