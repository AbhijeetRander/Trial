import java.util.Scanner;
public class Add
{
  public static void main(String args[])
  {
    int x = 0;
    int y = 0;
    int z = 0;
    Scanner scnAdd = new Scanner(System.in);
    System.out.println("Enter the first number X: ");
    x = scnAdd.nextInt();
    System.out.println("Enter the second number Y: ");
    y = scnAdd.nextInt();
    z = x + y;
    System.out.println(z);
  }
}
      
