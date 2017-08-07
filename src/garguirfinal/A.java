package garguirfinal;

/**
 *
 * @author TechMDQ
 */
public abstract class A implements Comparable {

    protected String cadena;
    protected int numero;

    public A(String cadena, int numero) {
        this.cadena = cadena;
        this.numero = numero;
    }

    public String getCadena() {
        return cadena;
    }

    public int getNumero() {
        return numero;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
