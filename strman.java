import java.util.*;
class strman {
public static void main(String args[]) {
String a,b;int i,j=0,flag=0,p=0;
Scanner in=new Scanner(System.in);
a=in.nextLine();
b=in.nextLine();
char[] k=a.toCharArray();
char[] m=b.toCharArray();
for(i=0;i<=k.length-1;i++) {
if((k[i])==m[j]) {
flag++;
j++;
}
else {
flag=0;
j=0;
}
if(flag==1) {
p=i;
flag=0;
}
else{
p=0;
}
if(j>m.length-1) {
break;
}
} 
if(j==m.length)
System.out.print(""+(p-(b.length()-1)));
else 
System.out.print("-1"); 
}}                              