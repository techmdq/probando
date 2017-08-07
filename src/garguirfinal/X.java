package garguirfinal;

/**
 *
 * @author TechMDQ
 */
public class X extends A {

    public X(String cadena, int numero) {
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
