import java.util.Scanner;

public class CountSingleDigits {
  public static void main(String[] args){
    int[] randoms = new int[100];
    for (int i = 0; i < 100; i++){
      randoms[i] = (int)(Math.random() * 10);
    } // for i
    
    int[] counts = new int[10];
    for (int i = 0; i < 100; i++){
      switch (randoms[i]){
          case 0: counts[0]++; break;
          case 1: counts[1]++; break;
          case 2: counts[2]++; break;
          case 3: counts[3]++; break;
          case 4: counts[4]++; break;
          case 5: counts[5]++; break;
          case 6: counts[6]++; break;
          case 7: counts[7]++; break;
          case 8: counts[8]++; break;
          case 9: counts[9]++; break;
      }  // switch 
    } // for i
    
    System.out.print("The counts for 0 through 9 are: ");
    for (int i = 0; i < 10; i++)
      System.out.print(counts[i] + " ");
    
    System.out.println();
  } // main 
} // CountSingleDigits
