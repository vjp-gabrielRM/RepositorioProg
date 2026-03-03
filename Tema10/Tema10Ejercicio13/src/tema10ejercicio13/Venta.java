/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema10ejercicio13;

/**
 *
 * @author alumno
 */
public class Venta {
    private String nombreMes;
    private int ventasMes;

    public Venta() {
        this.nombreMes = "";
        this.ventasMes = 0;
    }
    
    public Venta(String nombreMes, int ventasMes) {
        this.nombreMes = nombreMes;
        this.ventasMes = ventasMes;
    }

    public String getNombreMes() {
        return nombreMes;
    }

    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
    }

    public int getVentasMes() {
        return ventasMes;
    }

    public void setVentasMes(int ventasMes) {
        this.ventasMes = ventasMes;
    }
    
    @Override
    public String toString(){
        return this.nombreMes + " con " + this.ventasMes + " ventas";
    }
}
