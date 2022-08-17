import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
  
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    System.out.println("Insira o raio: ");

    try (Scanner readDateUser = new Scanner(System.in)) {
      double pi = 3.14159;
      double radius = readDateUser.nextDouble();
      double area = pi * radius* radius;

      System.out.printf("A área é: %.4f%n %.2f%n", area, area);
    }
  }
}
