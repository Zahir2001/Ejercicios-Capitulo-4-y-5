import java.util.Collection;
import java.util.Scanner;
import java.util.Vector;
import java.util.Scanner;

public class PrincipalRegistro {
    
    public PrincipalRegistro(){
    }
    
    
    Collection<RegistroConsumo> c_registro_viajes = new Vector<>();

    public void setC_registro_viajes(Collection<RegistroConsumo> c_registro_viajes){
        this.c_registro_viajes = c_registro_viajes;
    }

    public Collection<RegistroConsumo> getC_registro_viajes(){
        return c_registro_viajes;
    }

    public void realizarRegistro(){
        Scanner sc = new Scanner(System.in);
        RegistroConsumo registro = new RegistroConsumo();
        System.out.println("Digite el id del viaje: ");
        registro.setContador(sc.nextInt());
        System.out.println("Digite los kilometros recorridos: ");
        registro.setKilometros(sc.nextInt());
        System.out.println("Digite los litros consumidos: ");
        registro.setLitros(sc.nextInt());
        c_registro_viajes.add(registro);
    }

    public void mostrarInformacionG(){
        for (RegistroConsumo registro:c_registro_viajes){
            registro.mostrarInformacion();
        }
    }

    public double calcularPromedio(){
        double suma = 0;
        double promedio = 0;
        for (RegistroConsumo registro: c_registro_viajes){
            suma = suma + (registro.getKilometros()/registro.getLitros());
        }
        promedio = suma / c_registro_viajes.size();
        return promedio;
    }
}
