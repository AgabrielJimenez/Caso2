/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoestudio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class CasoEstudio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidadFacturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de facturas que desea registrar:"));
        Factura[] facturas = new Factura[cantidadFacturas];
        ingresarFacturas(facturas);
        mostrarInfoFacturas(facturas);
        calcularDeudaTotalCliente(facturas);
    }

    private static void ingresarFacturas(Factura[] facturas) {
        for (int i = 0; i < facturas.length; i++) {
            String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
            int cedulaCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del cliente:"));
            int codigoFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la factura:"));
            int mesFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de la factura"));
            int anoFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ano de la factura:"));
            double montoFactura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura:"));
            boolean estadoFactura = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese el estado de la factura(true-Pagada, fase-No Pagada):"));
            facturas[i] = new Factura(nombreCliente, cedulaCliente, codigoFactura, mesFactura, anoFactura, montoFactura, estadoFactura);
        }
    }

    private static void mostrarInfoFacturas(Factura[] facturas) {
        StringBuilder facturaInfo = new StringBuilder();
        for (Factura factura : facturas) {
            facturaInfo.append("Monto de la factura: ").append(factura.getMontoFactura()).append("\n");
            facturaInfo.append("Estado de la factura: ").append(factura.isEstadoFactura() ? "Pagada" : "No pagada").append("\n\n");
        }
        JOptionPane.showMessageDialog(null, facturaInfo.toString());
    }

    private static void calcularDeudaTotalCliente(Factura[] facturas) {
        int cedulaClienteBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del cliente para calcular su deuda total:"));
        double totalDeuda = 0;
        for (Factura factura : facturas) {
            if (factura.cedulaCliente == cedulaClienteBuscar && !factura.isEstadoFactura()) {
                totalDeuda += factura.getMontoFactura();
            }
        }
        JOptionPane.showMessageDialog(null, "La deuda total del cliente con cedula " + cedulaClienteBuscar + " es: " + totalDeuda);
    }
}
