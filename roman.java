import java.util.*;
class roman {
public static void main(String args[]) {
int n;
String a="";
Scanner t=new Scanner(System.in);
n=t.nextInt();
if(n<1 ||n>3999) {
System.out.println("Invaluid");
}
else {
while(n>=1000) {
a+="M";
n-=1000;
}
while(n>=900) {
a+="CM";
n-=900;
}
while(n>=500) {
a+="D";
n-=500;
}
while(n>=400) {
a+="CD";
n-=400;
}
while(n>=100) {
a+="C";
n-=100;
}
while(n>=90) {
a+="XC";
n-=90;
}
while(n>=50) {
a+="L";
n-=50;
}while(n>=40) {
a+="XL";
n-=40;
}
while(n>=10) {
a+="X";
n-=10;
}
while(n>=9) {
a+="IX";
n-=9;
}
while(n>=5) {
a+="V";
n-=5;
}
while(n>=4) {
a+="IV";
n-=4;
}
while(n>=1) {
a+="I";
n-=1;
}}
System.out.println(""+a);
}}