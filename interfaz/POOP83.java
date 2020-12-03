package interfaz;
/**
 *
 * @author ドディス
 */
public class POOP83 {
    public static void main(String[] args) {
        /*------ Actividad 4 ------*/
        System.out.println("------ Actividad 4 ------");
        //InstrumentoMusical instrumento = new InstrumentoMusical(); No se puede instanciar.
        InstrumentoMusical instrumento;
        
        instrumento = new Flauta();
        instrumento.tocar();
        instrumento.afinar();
        System.out.println("Tipo de instrumento: "+instrumento.tipoInstrumento());
        System.out.println(instrumento);
    }
}
