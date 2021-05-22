import java.util.Scanner;
class PatternY{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of rows");
int n = sc.nextByte(); 
for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
if((j==i|| j==n-i+1) &&i<=n/2+1||(j==n/2+1&&i>n/2))
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}









 