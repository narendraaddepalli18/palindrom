import java.util.Scanner;
class Palindrome{
    public static void main (String a[]){
Scanner s=new Scanner(System.in);
System.out.println("enter a number to check palindrome or not");
int number=s.nextInt();
int reverse=0;
int dup=number;
while(number>0){
int extract=number %10;
reverse=reverse*10+extract;
number=number/10;
}
if(dup==reverse){
    System.out.println("it is a palindrome");
}
else{
    System.out.println("not a palindrome");
}
    }
}