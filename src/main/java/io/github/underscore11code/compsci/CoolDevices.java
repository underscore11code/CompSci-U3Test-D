package io.github.underscore11code.compsci;

import java.text.NumberFormat;
import java.util.Scanner;

public class CoolDevices {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of cool devices you wish to purchase: ");
    final int quantity = scanner.nextInt();

    System.out.println("Which shipping method do you prefer? Priority (1), Express (2), or Standard (3)?");
    final int shippingNumber = scanner.nextInt();
    scanner.close();
    int shippingCost;

    switch (shippingNumber) {
      case 1:
        shippingCost = 15;
        break;
      case 2:
        shippingCost = 12;
        break;
      case 3:
        shippingCost = 5;
        break;
      default:
        System.out.println("Invalid shipping type entered.");
        return;
    }

    final int total = (quantity * 250) + shippingCost;
    System.out.println("Your total cost is " + NumberFormat.getCurrencyInstance().format(total));
  }
}
