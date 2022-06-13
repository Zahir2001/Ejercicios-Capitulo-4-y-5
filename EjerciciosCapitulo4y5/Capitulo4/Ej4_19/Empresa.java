import java.util.Scanner;

public class Empresa {
    
    Vendedor vendedor = new Vendedor();

    public void setVendedor(Vendedor vendedor){
        this.vendedor = vendedor;
    }

    public Vendedor getVendedor(){
        return vendedor;
    }

    public void solicitarDatosArticulosVendidos(){
        int maxArticulos = 0;
        vendedor.setIdVendedor(1);

        System.out.println("Cuantos articulos va a ingresar: ");
        Scanner sc = new Scanner(System.in);
        maxArticulos = sc.nextInt();

        for (int i=0;i<maxArticulos;i++){
            ArticulosVendidos art = new ArticulosVendidos();
            System.out.println("Ingrese el ID del articulo: ");
            art.setIdArticulos(sc.nextInt());
            System.out.println("Valor del articulo: ");
            art.setValor(sc.nextDouble());
            vendedor.getListaArticulosVendidos().add(art);
        }
    }

    public double calcularIngresoVendedor(){
        double resultado = 0;
        for(ArticulosVendidos art:vendedor.getListaArticulosVendidos()){
            resultado = resultado+art.getValor();
        }
        resultado = ((resultado*0.09)+resultado)+vendedor.getPagoEstandar();
        return resultado;
    }

    public void ejecutarPrograma(){
        solicitarDatosArticulosVendidos();
        double resultado = this.calcularIngresoVendedor();
        System.out.println("Ingresos del Vendedor: " +resultado);
    }

}
