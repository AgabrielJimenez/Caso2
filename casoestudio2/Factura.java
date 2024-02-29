/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio2;

/**
 *
 * @author Aulas Heredia
 */
public class Factura {
    private String nombreCliente;
    int cedulaCliente;
    private int codigoFactura;
    private int mesFactura;
    private int anoFactura;
    private double montoFcatura;
    private boolean estadoFactura;
    
    public Factura(String nombreCliente, int cedulaCliente, int codigoFactura, int mesFactura, int anoFactura, double montoFactura, boolean estadoFactura){
     this.nombreCliente = nombreCliente;
     this.cedulaCliente = cedulaCliente;
     this.codigoFactura = codigoFactura;
     this.mesFactura =  mesFactura;
     this. anoFactura = anoFactura;
     this.montoFcatura = montoFactura;
     this.estadoFactura = estadoFactura;
     
 }

    public double getMontoFactura() {
        return montoFcatura;
    }

   public boolean isEstadoFactura(){
       return estadoFactura;
    }
    
} 