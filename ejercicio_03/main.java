package ejercicio_03;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        

            System.out.println("\n 1. TargetaCredito");
            System.out.println(" 2. Paypal");
            System.out.println(" 3. TransferenciaBancaria");
            System.out.println(" 4. Bitcoin");
            System.out.println(" 5. TargetaRegalo\n");
            
            System.out.print("por favor seleccionar el metodo de pago \n");
            opcion = sc.nextInt();

            System.out.print("por favor ingresa el monto a pagar \n");
            double monto = sc.nextDouble();

            switch (opcion) {
                case 1:
                    MetodoPago PagoTarjeta = new TargetaCredito(monto);
                    PagoTarjeta.odtenerDetalles();
                    PagoTarjeta.procesarPago();

                    break;
                case 2:
                    MetodoPago PagoPaypal = new Paypal(monto);
                    PagoPaypal.odtenerDetalles();
                    PagoPaypal.procesarPago();
                    break;
                case 3:
                    MetodoPago PagoTransferencia = new TransferenciaBancaria(monto);
                    PagoTransferencia.odtenerDetalles();
                    PagoTransferencia.procesarPago();
                    break;
                case 4:
                    MetodoPago PagoBitcoin = new Bitcoin(monto);
                    PagoBitcoin.odtenerDetalles();
                    PagoBitcoin.procesarPago();
                    break;
                case 5:
                    MetodoPago PagoRegalo = new TargetaRegalo(monto);
                    PagoRegalo.odtenerDetalles();
                    PagoRegalo.procesarPago();
                    break;

                   
                default:
                    System.out.println(" opcion no valida ");
                    break;
            }

        

    }

}
