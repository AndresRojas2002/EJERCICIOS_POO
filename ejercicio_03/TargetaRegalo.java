package ejercicio_03;

public class TargetaRegalo implements MetodoPago{

    private double monto;

    public  TargetaRegalo (double monto) {
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
        return "pago por  **** TARGETA DE REGALO ****  Monto = " + monto ;

    }

    @Override
    public boolean validarMonto(double monto) {
        if (monto > 0 && monto <= 500) {
            System.out.println("procesando el pago de " + monto + "   ........\n");

            return true;

        } else {
            System.out.println("El monto no es válido. No se puede procesar el pago.\n");
            return false;

        }

    }


}
