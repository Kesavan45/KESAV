import java.util.*;
class twicecounter {
public static void main(String args[]) { 
String a;int i,j,c=0,m=0;
Scanner t=new Scanner(System.in);
a=t.nextLine();
int r=0;
String b[]=a.split(" ");
for(i=0;i<b.length;i++) {
c=0;
for(j=0;j<b.length;j++) {
if(i!=j) {
if(b[i].compareTo(b[j])==0){
c++;  
}}}
if(c==1)
r +=1;
}
System.out.print(r/2);

}}