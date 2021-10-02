import java.util.Scanner ; 
public class RightTrianglePattern   
{   
public static void main(String args[])   
{   
Scanner sc= new Scanner(System.in); 
 
int row, column;   
int line = sc.nextInt();
  
for(row=0; row<line; row++)   // outer loop for rows
{   
 
for(column=0; column<=row; column++)   //inner loop for columns 
{   
System.out.print("* ");   //prints stars   
}   

System.out.println();   //throws the cursor in a new line after printing each line  

}   
}   
}  
