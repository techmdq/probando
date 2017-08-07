package garguirfinal;

import java.util.ArrayList;

/**
 *
 * @author TechMDQ
 */
public class GarguirFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coleccion c = new Coleccion();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                c.agregarUno(new X("sergio", i));
            } else {
                c.agregarUno(new Y("pepe", i));
            }
        }

        for (int i = 0; i < c.coleccion.size(); i++) {
            System.out.printf("%10s - %3d\n", c.coleccion.get(i).getCadena(), c.coleccion.get(i).getNumero());
        }

        A x = new X("sergio", 4);
        System.out.printf("\n%10s - %3d\n", x.getCadena(), x.getNumero());

        if (c.quitarUno(x) == null) {
            System.out.println("El objeto no existe");
        }
        x.setNumero(2);
        ArrayList<A> mayores = new ArrayList<>();
        mayores = c.encontrarLosMayores(x);

        System.out.printf("\nMayores de: %d\n", x.getNumero());
        for (int i = 0; i < mayores.size(); i++) {
            System.out.printf("%10s - %3d\n", mayores.get(i).getCadena(), mayores.get(i).getNumero());
        }

        ArrayList<A> mismoTipo = new ArrayList<>();
        mismoTipo = c.encontrarLosDelMismoTipo(x);

        System.out.printf("\nMismo Tipo\n");
        for (int i = 0; i < mismoTipo.size(); i++) {
            System.out.printf("%10s - %3d\n", mismoTipo.get(i).getCadena(), mismoTipo.get(i).getNumero());
        }
    }

}
