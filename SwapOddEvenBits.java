import java.util.*;

public class SwapOddEvenBits {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   String b  =Integer.toBinaryString(a);
   int c = b.length();
   
    if(c < 4) {
     for(int i = c; i < 4; i++){
          b = "0"+b;
          c--;
    }
 }
   System.out.println(b);
   char[] s = b.toCharArray();
   char temp;
   for(int i = 0; i < b.length() -1 ;i+=2){
       temp = s[i];
       s[i] = s[i+1];
       s[i+1] = temp;
   }
   String f = "";
   for(char d : s){
      f += d;
   } 
   System.out.println("New"+f);
   int h = Integer.parseInt(f,2);
   System.out.println(h);
}


}