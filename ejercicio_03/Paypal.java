package ejercicio_03;

public class Paypal implements MetodoPago {

    private double monto;

    public Paypal (double monto) {
        this.monto = monto;

    }

    @Override
    public void procesarPago() {
        if (validarMonto(monto)) {
            System.out.println("pago procesado exitosamente\n");

        } else {
            System.out.println("por favor ingresar un monto valido ");

        }

    }

    @Override
    public String odtenerDetalles() {
        return "pago por la plataforma **** PAYPAL ****  Monto = " + monto ;

    }

    @Override
    public boolean validarMonto(double monto) {
        if (monto > 0 && monto < 10.000) {
            System.out.println("procesando el pago de " + monto + "   ........\n");

            return true;

        } else {
            System.out.println("El monto no es válido. No se puede procesar el pago.\n");
            return false;

        }

    }



}
