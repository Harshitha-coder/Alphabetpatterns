import java.util.Scanner;
class PatternM{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of rows");
int n = sc.nextByte();
int x=1; 
for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
if(j==1|| j== n ||((j==x||j==n-x+1)&&i<=n/2+1)) 
System.out.print("*");
else
System.out.print(" ");
}
x++;
System.out.println();
}
}
}









 