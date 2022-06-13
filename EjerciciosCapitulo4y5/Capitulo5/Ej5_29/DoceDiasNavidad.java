public class DoceDiasNavidad {
    private static void cancion(){

        String textoCaso = "";
        
        String textoVerso = "";
        
        String mensaje = "", mensaje2 = "";
        
        for (int i = 1; i <= 12; i++) {
            switch(i){
                case 1:
                        textoCaso = "El primer";
                        textoVerso = "una perdiz picando peras del peral";
                break;

                case 2:
                        textoCaso = "El segundo";
                        textoVerso = "dos tortolitas y ";
                break;

                case 3:
                        textoCaso = "El tercer";
                        textoVerso = "tres gallinitas, ";
                break;

                case 4:
                        textoCaso = "El cuarto";
                        textoVerso = "cuatro pajaritos, ";
                break;

                case 5:
                        textoCaso = "El quinto";
                        textoVerso = "cinco anillos dorados, ";
                break;

                case 6:
                        textoCaso = "El sexto";
                        textoVerso = "seis mamás gansas, ";
                break;

                case 7:
                        textoCaso = "El septimo";
                        textoVerso = "siete cisnitos, ";
                break;

                case 8:
                        textoCaso = "El octavo";
                        textoVerso = "ocho lecheritas, ";
                break;

                case 9:
                        textoCaso = "El noveno";
                        textoVerso = "nueve bailarinas, ";
                break;

                case 10:
                        textoCaso = "El decimó";
                        textoVerso = "diez señores saltando, ";
                break;

                case 11:
                        textoCaso = "El undecimó";
                        textoVerso = "once gaiteritos, ";
                break;

                case 12:
                        textoCaso = "El duodecimó";
                        textoVerso = "doce tamborileros, ";
                break;

            }

            textoCaso += " día de Navidad, mi amor me mandó";

            mensaje2 = mensaje;
            mensaje = textoVerso;
            mensaje += mensaje2;

            System.out.println(textoCaso + "\n");
            System.out.println(mensaje + ".\n\n");
        }
    }
    public static void main(String[] args) {
        cancion();
    }
}
