import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    
    int idVendedor;
    List<ArticulosVendidos> listaArticulosVendidos;
    double pagoEstandar;
    double comision;

    public Vendedor(){
        idVendedor = 0;
        listaArticulosVendidos = new ArrayList<>();
        pagoEstandar = 200;
    }

    public void setIdVendedor(int idVendedor){
        this.idVendedor = idVendedor;
    }

    public int getIdVendedor(){
        return idVendedor;
    }

    public void setListaArticulosVendidos(List<ArticulosVendidos> listaArticulosVendidos){
        this.listaArticulosVendidos = listaArticulosVendidos;
    }

    public List<ArticulosVendidos> getListaArticulosVendidos(){
        return listaArticulosVendidos;
    }

    public void setPagoEstandar(double pagoEstandar){
        this.pagoEstandar = pagoEstandar;
    }

    public double getPagoEstandar(){
        return pagoEstandar;
    }

    public void setComision(double comision){
        this.comision = comision;
    }

    public double getComision(){
        return comision;
    }
}
