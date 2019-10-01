import java.util.*;
class atm {
public static void main(String args[]) {
Scanner in=new Scanner(System.in);
int dkey=0,wkey=0,i,dl=0,wl=0,ex=0;
int balance=0;
String pin="0000";
int[] deposit=new int[100];
int[] withdraw=new int[100];
while(1==1) {
if(ex==3) {
System.out.println("Account has been  blocked");
break;
}
else {
System.out.println("Welcome to XXX Bank ATM Transaction");
System.out.println("Choice the transaction");
System.out.println("1. Deposit");
System.out.println("2. Withdraw");
System.out.println("3. Balance Enquiry");
System.out.println("4. Change pin");
System.out.println("5. Transaction History");
System.out.println("6. Exit");
int n=in.nextInt();
if(n==1) {
System.out.println("Enter deposit amount");
int x;
x=in.nextInt();
if(x==500 || x==1000 || x==2000) {
deposit[dkey]=x;
balance+=x;
System.out.println("You have successfully deposit the amount");
dkey++;
dl++;
}
else {
System.out.println("Please enter 500 1000 2000 notes");
}
}
if(n==2) {
System.out.println("Enter withdraw amount");
int x;
x=in.nextInt();
if(x==500 || x==1000 || x==2000) {
if(x<=balance) {
System.out.println("Enter the pin");
in.nextLine();
String y=in.nextLine();
if(y.equals(pin)) {
withdraw[wkey]=x;
balance-=x;
System.out.println("You have successfully withdraw the amount");
wkey++;
wl++;
}
else {
System.out.println("Incorrect pin");
ex++;
}}
else {
System.out.println("not sufficient balance");
}}
else {
System.out.println("Please enter 500 1000 2000 notes ");
}}
if(n==3) {
System.out.println("Available balance is "+balance);
}
if(n==4) {
System.out.println("Enter your old pin");
in.nextLine();
String h=in.nextLine();
if(h.equals(pin)) {
System.out.println("Enter your new pin");
String o=in.nextLine();
pin=pin.replaceAll(h,o);
System.out.println("Pin code has been successfully changed");
}
else {
System.out.println("Wrong pin");
}
}
if(n==5) {
for(i=0;i<=dl-1;i++) {
System.out.println("Deposit amount "+deposit[i]);
}
for(i=0;i<=wl-1;i++) {
System.out.println("Withdraw amount "+withdraw[i]);
}
}
if(n==6) {
System.out.println("Thank you for visiting XXX Bank ATM");
break;
}
}
}
}}
