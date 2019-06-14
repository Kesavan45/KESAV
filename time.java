import java.util.*;
class time {
public static void main(String args[]) {
int h,m,s;int flag=0;
String a;
Scanner in =new Scanner(System.in);
h=in.nextInt();
m=in.nextInt();
s=in.nextInt();
in.nextLine();
a=in.nextLine();
if(h<12 && m<59 && s<59 && (a.equals("am") || a.equals("pm"))){
flag=0;}
else {
flag=1;
}
if(a.equals("pm") && flag==0) {
System.out.println(""+(h+12) +':' + ""+m +':' + ""+s);
}
else{
System.out.println(""+h +':' + ""+m +':' + ""+s);
}
if(flag == 1) {
System.out.println("Invalid");
}
}}
