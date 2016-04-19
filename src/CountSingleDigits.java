import java.util.Scanner;

public class CountSingleDigits {
  public static void main(String[] args){
    int[] randoms = new int[10];
    for (int i = 0; i < 100; i++){
      randoms[(int)(Math.random() * 10)]++;
    } // for i
    
    System.out.print("The counts for 0 through 9 are: ");
    for (int i = 0; i < randoms.length; i++)
      System.out.print(randoms[i] + " ");
    
    System.out.println();
  } // main 
} // CountSingleDigits
