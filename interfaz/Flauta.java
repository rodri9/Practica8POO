package interfaz;

/**
 *
 * @author ドディス
 */
public class Flauta extends InstrumentoViento{

    /**
     * Constructor vacío.
     */
    public Flauta() {
    }

    /**
     * Devuelve qué tipo de instrumento es.
     * @return 
     */
    @Override
    public String tipoInstrumento()
    {
        return "Flauta";
    }

    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
}
