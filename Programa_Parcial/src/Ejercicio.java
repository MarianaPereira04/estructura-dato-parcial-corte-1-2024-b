import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        String nomProducto;
        Double valorUnitario;
        Double cantCompra = 0.0;
        Double valorBruto = 0.0;
        Double valorNeto = 0.0;
        Double valorDescuento;
        Double descuento = 0.0;

        String mensaje = "Error, el valor debe ser mayor a 0";


        System.out.print("Digite su nombre: ");
        nombre = scanner.next();

        System.out.print("Digite el nombre del producto: ");
        nomProducto = scanner.next();

        System.out.print("Ingrese el valor unitario: ");
        valorUnitario = scanner.nextDouble();

        if (valorUnitario > 0) {
            System.out.printf("Ingrese la cantidad a comprar:");
            cantCompra = scanner.nextDouble();
            if (cantCompra > 0) {
                valorBruto = valorUnitario * cantCompra;

                if(!(cantCompra < 10)){
                    if(cantCompra >= 10 && cantCompra < 20){
                        descuento = (valorBruto*0.05);
                        valorNeto = valorBruto - descuento;
                    } else if (cantCompra >= 20) {
                        descuento = (valorBruto*0.07);
                        valorNeto = valorBruto - descuento;
                    }
                }else{
                    valorNeto = valorBruto;
                }

                System.out.printf("--------------------------------------\n");
                System.out.printf("Nombre cliente: " + nombre + "\n");
                System.out.printf("Nombre del producto: " + nomProducto + "\n");
                System.out.printf("Valor unitario: " + valorUnitario + "\n");
                System.out.printf("Cantidad: " + cantCompra + "\n");
                System.out.printf("Valor bruto: " + valorBruto + "\n");
                System.out.printf("Valor neto: " + valorNeto + "\n");
                System.out.printf("Valor descuento: " + descuento + "\n");

            } else {
                System.out.printf(mensaje);
            }
        } else {
            System.out.printf(mensaje);
        }

    }
}
