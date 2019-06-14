import java.util.*;
class prime {
public static void main(String args[]) {
int a,b,i,j,k=0;
Scanner t= new Scanner(System.in);
a=t.nextInt();
b=t.nextInt();
for(i=a;i<=b;i++) {
for(j=2;j<i;j++) {
if(i%j==0) 
{
k=0;
break; 
}
else 
{
k=1;
}}
if(k==1) 
{
System.out.print(i);
}}
}}