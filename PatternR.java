import java.util.Scanner;
class PatternR{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of rows");
int n = sc.nextByte(); 
for(int i=0;i<=n;i++){
for(int j=0;j<=n;j++){
if(j==1|| (j== 4&&(i!=0 &&i!=3)) || (i==0||i==3)&&(j>0&&j<4)) 
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}









 