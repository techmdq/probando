package garguirfinal;

/**
 *
 * @author TechMDQ
 */
public class Y extends A {

    public Y(String cadena, int numero) {
        super(cadena, numero);
    }

    @Override
    public int compareTo(Object obj) {
        if (this.equals(obj)) {
            return 1;
        }
        return 0;
    }
}
