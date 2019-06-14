import java.util.*;
class divrange {
public static void main(String args[]) {
int m=0,a,b,c,i;
Scanner in=new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
for(i=a;i<=b;i++) {
if(i%c==0) 
m++;
}
System.out.println(""+m);
}}