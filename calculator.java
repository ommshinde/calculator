import java.util.Scanner; 
public class calculator { 
  public static void main(String args[]) { 
    float a, b, res; 
    int choice; 
    Scanner sc = new Scanner(System.in); 
    
    System.out.print("\nSIMPLE CALCULATOR\n"); 
    
    do { 
      System.out.print("\nEnter first number : "); 
      a = sc.nextFloat(); 
      
      System.out.print("\nEnter second number : "); 
      b = sc.nextFloat(); 
      
      System.out.println("\n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Exit\n"); 
     
      System.out.print("Enter your choice : "); 
      choice = sc.nextInt(); 
      
      switch (choice) { 
        case 1: res = a + b; 
          System.out.print("Addition of above nos is : " + res + "\n"); 
          break; 
        case 2: res = a - b; 
          System.out.print("Substraction of above nos is : " + res + "\n"); 
          break; 
        case 3: res = a / b; 
          System.out.print("Multiplication of above nos is : " + res + "\n"); 
          break; 
        case 4: res = a * b; 
          System.out.print("Divsion of above nos is : " + res + "\n"); 
          break; 
        case 5: 
          System.exit(0); 
          break; 
        default: 
          System.out.print("Wrong Choice.....\n");
          break; 
      } 
    } while (choice != 5); 
    
    sc.close(); 
  } 
}