import java.util.Scanner;

public class Semana03_CondicionalMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra: ");
        double monto = scanner.nextDouble();
        double descuento;

        if (monto >= 1000) {
            descuento = 0.20; // 20% de descuento
        } else if (monto >= 500) {
            descuento = 0.10; // 10% de descuento
        } else if (monto >= 100) {
            descuento = 0.05; // 5% de descuento
        } else {
            descuento = 0.0; // Sin descuento
        }

        double montoFinal = monto - (monto * descuento);
        System.out.println("El monto final después del descuento es: " + montoFinal);
    }
}
