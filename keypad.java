import java.util.*;
class keypad {
public static void main(String args[]) {
String a;int i;
Scanner in =new Scanner(System.in);
a=in.nextLine();
char[] m=a.toCharArray();
for(i=0;i<m.length;i++) {
if(m[i]== 'a' || m[i] == 'b' || m[i] == 'c'){
System.out.print(2);}
if(m[i]== 'd' || m[i] == 'e' || m[i] == 'f'){
System.out.print(3);}
if(m[i]== 'g' || m[i] == 'h' || m[i] == 'i'){
System.out.print(4);}
if(m[i]== 'j' || m[i] == 'k' || m[i] == 'l'){
System.out.print(5);}
if(m[i]== 'm' || m[i] == 'n' || m[i] == 'o'){
System.out.print(6);}
if(m[i]== 'p' || m[i] == 'q' || m[i] == 'r' || m[i]=='s'){
System.out.print(7);}
if(m[i]== 't' || m[i] == 'u' || m[i] == 'v'){
System.out.print(8);}
if(m[i]== 'w' || m[i] == 'x' || m[i] == 'y' || m[i] == 'z'){
System.out.print(9);}
}}}