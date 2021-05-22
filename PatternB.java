import java.util.Scanner;
class PatternB{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of rows");
int n = sc.nextByte(); 
for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
if(j==1|| i== n ||i==1||(i==n/2+1&&j>n/2)||j==n)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}









 