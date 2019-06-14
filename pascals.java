import java.util.*;
class pascals {
public static void main(String args[]) {
int a,i,j;
Scanner in=new Scanner(System.in);
a=in.nextInt();
for(i=0;i<=a;i++) { 
for(k=0;k<a-i-1;k++) {
System.out.print(" ");
}
int t=1;
for(j=1;j<=i;j++){
System.out.print(t+" ");
t=t*(i-j)/(j);
}
System.out.println();
}}}