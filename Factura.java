public class Factura {
    private String nombreFactura;
    private String cliente;
    double montoNeto;

    public Factura(String nombreFactura, String cliente, double montoNeto) {
        this.nombreFactura = nombreFactura;
        this.cliente = cliente;
        if (montoNeto < 0) {
            this.montoNeto = 0;
        } else {
            this.montoNeto = montoNeto;
        }
    }

    public String getNombreFactura() {
        return nombreFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public double getMontoNeto() {
        return montoNeto;
    }

    public double calcularTotalConIVA() {
        return montoNeto * 1.21;
    }
}
