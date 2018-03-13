package co.com.udistrital.teoria.logica;

public class ValidacionCadenaCircuitos {

    String circuito1, circuito2, circuito3;

    public void Circuito1(String c1) {
        circuito1 = c1;

        String[] componenteCircuito1 = circuito1.split("\\s");

        System.out.println("***************************");
        //prueba imprimir components
        for (String w : componenteCircuito1) {
            System.out.println(w);
        }

    }

    public void Circuito2(String c2) {
        circuito2 = c2;

        String[] componenteCircuito2 = circuito2.split("\\s");

        System.out.println("***************************");
        //prueba imprimir components
        for (String w : componenteCircuito2) {
            System.out.println(w);
        }

    }

    public void Circuito3(String c3) {
        circuito3 = c3;

        System.out.println("***************************");

        String[] componenteCircuito3 = circuito3.split("\\s");

        //prueba imprimir components
        for (String w : componenteCircuito3) {
            System.out.println(w);
        }

    }

}
