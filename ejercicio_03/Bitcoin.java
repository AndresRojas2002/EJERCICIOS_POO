package ejercicio_03;

public class Bitcoin implements MetodoPago {

    private double monto;

    public Bitcoin(double monto) {
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
        return "pago por la plataforma **** BITCOIN ****  Monto = " + monto ;

    }

    @Override
    public boolean validarMonto(double monto) {
        if (monto > 0.001) {
            System.out.println("procesando el pago de " + monto + "   ........\n");

            return true;

        } else {
            System.out.println("El monto no es válido. No se puede procesar el pago.\n");
            return false;

        }

    }

}
