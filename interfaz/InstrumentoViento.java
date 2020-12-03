package interfaz;
/**
 *
 * @author ドディス
 */
public class InstrumentoViento extends Object implements InstrumentoMusical{

    /**
     * Constructor vacío.
     */
    public InstrumentoViento() {
    }
    
    /**
     * Método que simula el tocar un instrumento.
     */
    @Override
    public void tocar()
    {
        System.out.println("Estoy tocando un instrumento de viento.");
    }
    
    /**
     * Método que simula afinar un instrumento.
     */
    @Override
    public void afinar()
    {
        System.out.println("Estoy afinando un instrumento de viento.");
    }
    
    /**
     * Devuelve qué tipo de instrumento es.
     * @return 
     */
    @Override
    public String tipoInstrumento()
    {
        return "Instrumento de viento";
    }

    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
}