package herencia;

/**
 *
 * @author ドディス
 */
public class POOP8 {

   public static void main(String[] args) {
        /* Las clases base pueden comportarse como sus sub-clases */
        System.out.println("------ Actividad 1 ------");
        Poligono poligono = new Poligono();
        System.out.println("Polígono: "+poligono);
        
        Object objeto = new Object();
        System.out.println("Object: "+objeto);
        
        objeto = poligono;
        System.out.println("Object como Polígono: "+objeto);
        
        Object objeto2 = poligono;
        System.out.println("Object2: "+objeto2);
        Object objeto3 = new Poligono();
        System.out.println("Object3: "+objeto3);
        
        /*------ Actividad 2 ------*/
        System.out.println("\n------ Actividad 2 ------");
        poligono = new Triangulo();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        
        poligono= new Poligono();
        System.out.println(poligono);
        selectorPoligonos(poligono);
    }
    
    public static void selectorPoligonos(Poligono poligono){
        if(poligono instanceof Triangulo)
        {
            System.out.println("El objeto es un triángulo.");
        }
        else if(poligono instanceof Cuadrilatero)
        {
            System.out.println("El objeto es un Cuadrilátero.");
        }
        else if(poligono instanceof Poligono)
        {
            System.out.println("El objeto es un Polígono.");
        }
        else
        {
            System.out.println("El objeto es otra figura.");
        }
    }
}
