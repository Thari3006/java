import com.raja.oopslanb.shapes.Rectangle;
import com.raja.oopslanb.shapes.Shape;
import com.raja.oopslanb.shapes.Triangle;
import java.util.Scanner;
import com.raja.oopslanb.shapes.Circle;
public class Main {
 public static void main(String[] args) {
  Scanner userInput = new Scanner(System.in);
  int choice = 0;
  do {
   System.out.println("Finding Area");
   System.out.println("************");
   System.out.println("\n1. Rectangle" + "\n2. Triangle" + "\n3. Circle" + "\n4. Exit"+ "\n\nEnter your choice: ");
   choice = userInput.nextInt();
   switch (choice) {
   case 1:
    Shape rt = new Rectangle();
    rt.printArea();
    break;
   case 2:
    Shape tr = new Triangle();
    tr.printArea();
    break;
   case 3:
    Shape cr = new Circle();
    cr.printArea();
    break;
   case 4:
    System.out.println("\n\nThank You !!!");
    userInput.close();
    break;
   default:
    System.out.println("Please enter valid input");
    break;
   }
  } while (choice != 4);
 }
}

