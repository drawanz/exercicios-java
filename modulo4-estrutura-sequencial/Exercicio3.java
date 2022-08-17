import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
  
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    try (Scanner readDataUser = new Scanner(System.in)) {
      int A = readDataUser.nextInt();
      int B = readDataUser.nextInt();
      int C = readDataUser.nextInt();
      int D = readDataUser.nextInt();

      int result = ((A * B) - (C * D));

      System.out.println(result);
    }
  }
}
