package garguirfinal;

import java.util.ArrayList;

/**
 *
 * @author TechMDQ
 */
public class Coleccion {

    protected ArrayList<A> coleccion = new ArrayList<>();

    public void agregarUno(A agregando) {
        coleccion.add(agregando);
    }

    public A quitarUno(A quitando) {
        System.out.printf("\n quitar uno %-10s - %3d\n", quitando.getCadena(), quitando.getNumero());
        System.out.printf("\n quitar uno %-10s - %3d\n", coleccion.get(4).getCadena(), coleccion.get(4).getNumero());

        if (coleccion.contains(quitando) == true) {
            System.out.println("esta");
        }
        if (coleccion.remove(quitando) == true) {
            return quitando;
        } else {
            return null;
        }
    }

    public A encontrar(String cadena) {
        for (int i = 0; i < coleccion.size(); i++) {
            if (coleccion.get(i).getCadena().equals(cadena)) {
                return coleccion.get(i);
            }
        }
        return null;
    }

    public A encontrar(int numero) {
        for (int i = 0; i < coleccion.size(); i++) {
            if (coleccion.get(i).getNumero() == numero) {
                return coleccion.get(i);
            }
        }
        return null;
    }

    public A encontrar(A a) {
        for (int i = 0; i < coleccion.size(); i++) {
            if (coleccion.get(i).getClass() == a.getClass()) {
                return (A) coleccion.get(i);
            }
        }
        return null;
    }

    public ArrayList<A> encontrarLosDelMismoTipo(A a) {
        ArrayList<A> mismoTipo = new ArrayList<>();
        for (int i = 0; i < coleccion.size(); i++) {
            if (coleccion.get(i).getClass() == a.getClass()) {
                mismoTipo.add(coleccion.get(i));
            }
        }
        return mismoTipo;
    }

    public ArrayList<A> encontrarLosMayores(A a) {
        ArrayList<A> mayores = new ArrayList<>();
        for (int i = 0; i < coleccion.size(); i++) {
            if (coleccion.get(i).numero > a.numero) {
                mayores.add(coleccion.get(i));
            }
        }
        return mayores;
    }
}
