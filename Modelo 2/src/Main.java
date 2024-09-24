public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Ignacio", "Sanchez", 46213730, "Cuenta a Sueldo", 420000, 2);
        cuenta.setSaldoCuenta(420000);
        cuenta.imprimirAtributos();
        cuenta.consultarSaldo();
        cuenta.saldo2interes();
        cuenta.retirarDinero(20000);

        CuentaBancaria cuenta2 = new CuentaBancaria("Sofia", "Besada", 46364313, "Caja de ahorro", 180000, 0);
        cuenta2.setSaldoCuenta(180000);
        System.out.println(cuenta2.comprararSaldos(cuenta));
        cuenta.transferirDinero(cuenta2, 25000);
        System.out.println(cuenta.cuentaActiva());
    }
}