import java.util.*;
class setbits {
public static void main(String args[]) {
int i,c=0;
Scanner in=new Scanner(System.in);
i=in.nextInt();
String b=Integer.toBinaryString(i);
int a=Integer.bitcount(i);
System.out.print(a);
}}