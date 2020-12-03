package claseAbstracta;

/**
 *
 * @author ドディス
 */
public class POOP82 {
    public static void main(String[] args) {
        /*------ Actividad 3 ------*/
        System.out.println("------ Actividad 3 ------");
        
        //Poligono poligono = new Poligono(); las clases abstractas no se pueden instanciar.
        Poligono poligono;
        
        poligono = new Triangulo();
        System.out.println(poligono);
        
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        
    }
}
