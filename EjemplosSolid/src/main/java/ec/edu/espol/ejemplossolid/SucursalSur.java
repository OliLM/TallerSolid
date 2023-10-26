
package ec.edu.espol.ejemplossolid;

import java.util.ArrayList;
public class SucursalSur {
    private ArrayList listaempleados= new ArrayList<>();
    private String ubicacion;
    private String numeroContacto;
    private Usuario gerente;
    private ArrayList inventario;
    
    public SucursalSur(String ubicacion, String numeroContacto, Usuario gerente, ArrayList listaempleados, ArrayList inventario){
        this.ubicacion= ubicacion;
        this.numeroContacto= numeroContacto;
        this.gerente=gerente;
        this.listaempleados = listaempleados;
        this.inventario= inventario;
    }
    public ArrayList getListaempleados() {
        return listaempleados;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public ArrayList getInventario(){
        return inventario;
    }
    public String getNumeroContacto() {
        return numeroContacto;
    }
    public Usuario getGerente() {
        return gerente;
    }
    public void eliminarEmpleado(){
        //Logica de quitar a un empleado del arraylist
    }
    
    // Puede extenderse añadiendo metodos de agregarEmpleados nuevos, agregarInventario sun necesidad de modificarlos o algunos de sus metodos
    
    
}
