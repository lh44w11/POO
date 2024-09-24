public class CuentaBancaria {
    private String nombreTitular;
    private String apellidoTitular;
    private int numeroCuenta;
    private String tipoCuenta;
    private int saldoCuenta;
    private int porcentajeInteres;

    public CuentaBancaria(String nombreTitular, String apellidoTitular, int numeroCuenta, String tipoCuenta, int saldoCuenta, int porcentajeInteres) {
        this.nombreTitular = nombreTitular;
        this.apellidoTitular = apellidoTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldoCuenta = 0;
        this.porcentajeInteres = porcentajeInteres;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public String getApellidoTitular() {
        return apellidoTitular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public int getSaldoCuenta() {
        return saldoCuenta;
    }

    public int getPorcentajeInteres() {
        return porcentajeInteres;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setApellidoTitular(String apellidoTitular) {
        this.apellidoTitular = apellidoTitular;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void setSaldoCuenta(int saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public void setPorcentajeInteres(int porcentajeInteres) {
        this.porcentajeInteres = porcentajeInteres;
    }

    public void imprimirAtributos() {
        System.out.println("Nombre: " + getNombreTitular());
        System.out.println("Apellido: " + getApellidoTitular());
        System.out.println("Numero de cuenta: " + getNumeroCuenta());
        System.out.println("Tipo de cuenta: " + getTipoCuenta());
        System.out.println("Saldo: " + getSaldoCuenta());
        System.out.println("Porcentaje de interes: " + getPorcentajeInteres());

    }

    public void consultarSaldo() {
        System.out.println("Saldo actual de la cuenta: " + getSaldoCuenta());
    }

    public void retirarDinero(int dineroAretirar) {
        if (dineroAretirar>getSaldoCuenta()) {
            System.out.println("No tiene ese dinero. Tiene: " + getSaldoCuenta());
        }
        else {
            setSaldoCuenta(saldoCuenta - dineroAretirar);
            System.out.println("Transaccion exitosa. Saldo actual: " + getSaldoCuenta());
        }
    }

    public void saldo2interes() {
        int saldo2interes = getSaldoCuenta() + ((getSaldoCuenta()/100) * getPorcentajeInteres());
        System.out.println("Saldo segun interes: " + saldo2interes);
    }

    public boolean comprararSaldos(CuentaBancaria cuenta) {
        if (getSaldoCuenta() >= cuenta.getSaldoCuenta()) {
            return true;
        }
        else {
            return false;
        }
    }

    public void transferirDinero(CuentaBancaria cuentaDestino, int dinero) {
        if (dinero<=getSaldoCuenta()) {
            cuentaDestino.setSaldoCuenta(cuentaDestino.getSaldoCuenta() + dinero);
            setSaldoCuenta(saldoCuenta - dinero);
            System.out.println("Transaccion exitosa. Saldo actual: " + getSaldoCuenta());
            System.out.println("Saldo de la cuenta destino: " + cuentaDestino.getSaldoCuenta());
        }
        else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public boolean cuentaActiva() {
        if (getSaldoCuenta()>0) {
            return true;
        }
        else {
            return false;
        }
    }
}
