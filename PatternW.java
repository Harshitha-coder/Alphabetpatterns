import java.util.Scanner;
class PatternW{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of rows");
int n = sc.nextByte(); 
int x=n;
for(int i=1;i<=n;i++){
for(int j=1;j<2*n;j++){
if(j==1||j==n*2-1||j==x||j==2*n-x)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
x--;
}
}
}









 