import java.util.Scanner;

/**
 * Exercicio1
 */
public class Exercicio1 {

  public static void main(String[] args) {
    Scanner readDateUser = new Scanner(System.in);

    int A = readDateUser.nextInt();
    double B = readDateUser.nextDouble();

    System.out.println(A + B);

    readDateUser.close();
  }
}