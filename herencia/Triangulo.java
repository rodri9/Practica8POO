package herencia;

/**
 *
 * @author ドディス
 */
public class Triangulo extends Poligono{
    private float a, b, c, base, altura;
    private int alpha, beta, gamma;

    /**
     * Constructor vacío.
     */
    public Triangulo() 
    {
    }

    /**
     * Constructor que recibe todos los parámetros.
     * @param a
     * @param b
     * @param c
     * @param base
     * @param altura
     * @param alpha
     * @param beta
     * @param gamma 
     */
    public Triangulo(float a, float b, float c, float base, float altura, int alpha, int beta, int gamma) 
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
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
     * Devuelve el atributo c.
     * @return 
     */
    public float getC() {
        return c;
    }

    /**
     * Permite modificar el atributo c.
     * @param c 
     */
    public void setC(float c) {
        this.c = c;
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
     * Devuelve el atributo gamma.
     * @return 
     */
    public int getGamma() {
        return gamma;
    }

    /**
     * Permite modificar el atributo gamma.
     * @param gamma 
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + ", alpha=" + alpha + ", beta=" + beta + ", gamma=" + gamma + '}';
    }
}
