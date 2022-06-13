public class RegistroConsumo {
    
    private double contador;
    private double kilometros;
    private double litros;

    public RegistroConsumo(){
    }
    
    public void setContador(double contador){
        this.contador = contador;
    }

    public double getContador(){
        return contador;
    }
    
    public void setKilometros(double kilometros){
        this.kilometros = kilometros;
    }

    public double getKilometros(){
        return kilometros;
    }

    public void setLitros(double litros){
        this.litros = litros;
    }

    public double getLitros(){
        return litros;
    }

    public void mostrarInformacion(){
        System.out.println("Contador: " +contador);
        System.out.println("Kilometros recorridos: " +kilometros);
        System.out.println("Litros consumido: " +litros);
        System.out.println("Kilometros por litro: " +(kilometros/litros));
    }
    
}
