import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
 int[] numbers= new int[]{2,3,4,5,6};
 boolean isFind=false;
  int number=scanner.nextInt();
  for (int say:numbers) {
      if(say==number) {
          isFind=true;
          break;
      }
  }
  if(isFind==true) {
      System.out.println("Tapildi");
  }
  else {
      System.out.println("Bele bir reqem massivde yoxdur");
  }
    }
}