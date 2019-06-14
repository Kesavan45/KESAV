import java.util.*;
class fibb {
public static void main(String args[]) {
int n,i,l,a=0,b=1,flag=0;
Scanner t=new Scanner(System.in);
n=t.nextInt();
for(i=1;i<=1000;++i){
System.out.print(a);
l=a+b;
a=b;
b=l;
}
}}