import java.util.*;
class special {
public static void main(String args[]) {
int n,a,b,c,d,e,f;
Scanner t=new Scanner(System.in);
n=t.nextInt();
a=n/10;
b=n%10;
d=b*a;
e=b+a;f=d+e;
if(n==f)
System.out.println("Special number");
else
System.out.println("not a special number");
}}