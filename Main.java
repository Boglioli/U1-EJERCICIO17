public class Main {
    public static void main(String[] args) {
        Factura factura = new Factura("0001", "Juan Perez", 100000);
        double iva = factura.getMontoNeto() * 0.21;
        double total = factura.getMontoNeto() + iva;
        System.out.println("numero de factura: " + factura.getNombreFactura());
        System.out.println("cliente: " + factura.getCliente());
        System.out.println("monto neto: $" + factura.getMontoNeto());
        System.out.println("IVA: $" + iva);
        System.out.println("total: $" + total);
    }
}