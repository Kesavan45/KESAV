import java.util.*;
class evensame {
public static void main(String args[]) {
int a,b,i,j,c,d,e;
Scanner in=new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
for(i=a;i<=b;i++) {
if(i%2==0){
j=i;
d=j%100;
c=j/100;
e=d%10;
if(c==d || c==e)
System.out.print(j + " ");
}}
}}