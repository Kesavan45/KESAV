import java.util.*;
class binarychk {
public static void main(String args[]) {
int u,flag=0,i;
String c="";
Scanner t=new Scanner(System.in);
u=t.nextInt();
//System.out.print(""+Integer.toBinaryString(u));
String n=Integer.toBinaryString(u);
System.out.println(n);
char[] s=n.toCharArray();
if(s[0]==s[s.length-1] ){
flag =1;
}
for(i=1;i<=s.length-2;i++){
if(s[i]=='1') {
c="q";
}
}

if(flag==1 && c!="q")
System.out.print("true");
else
System.out.print("false");
}}