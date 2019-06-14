import java.util.*;
class series {
public static void main(String args[]) {
int a,i,j,l=1;
Scanner t=new Scanner(System.in);
a=t.nextInt();

for(i=1;i<=a;i++) {
j=(i*4)+l;
System.out.print(""+j);
l=j;
}

}}
