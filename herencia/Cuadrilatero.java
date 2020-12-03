package herencia;

/**
 *
 * @author ドディス
 */
public class Cuadrilatero extends Poligono{
    private int alpha, beta;
    private float a, b, base, altura;

    /**
     * Constructor vacío.
     */
    public Cuadrilatero() {
    }

    /**
     * Constructor que recibe todos los parámetros.
     * @param alpha
     * @param beta
     * @param a
     * @param b
     * @param base
     * @param altura 
     */
    public Cuadrilatero(int alpha, int beta, float a, float b, float base, float altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Devuelve el atributo alpha.
     * @return 
     */
    public int getAlpha() {
        return alpha;
    }

    /**
     * Permite modificar el atributo alpha.
     * @param alpha 
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    /**
     * Devuelve el atributo beta.
     * @return 
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Permite modificar el atributo beta.
     * @param beta 
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * Devuelve el atributo a.
     * @return 
     */
    public float getA() {
        return a;
    }

    /**
     * Permite modificar el atributo a.
     * @param a 
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Devuelve el atributo b.
     * @return 
     */
    public float getB() {
        return b;
    }

    /**
     * Permite modificar el atributo b.
     * @param b 
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Devuelve el atributo base.
     * @return 
     */
    public float getBase() {
        return base;
    }

    /**
     * Permite modificar al atributo base.
     * @param base 
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Devuelve el atributo altura.
     * @return 
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Permite modificar el atributo altura.
     * @param altura 
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
}
