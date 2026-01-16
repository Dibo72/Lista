import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class Lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        List<Integer> lista = new ArrayList<>();
        int j=0;
        int i=0;
        String buscar;
        int cont=0;

        for (int l=0;l<100;l++){
            lista.add(rand.nextInt(49)+1);
            System.out.print(lista.get(l) + " ");
        }
        System.out.println();
        System.out.println("Numero mayor: "+buscarMayor(lista));
        System.out.println("Numero menor: " + buscarMenor(lista));
        System.out.println("Suma de numeros: " + sumaNumeros(lista));
        System.out.println("Numeros mayores que 30: " + mayores30(lista));
        System.out.println("Numeros mayores a 45: " + mayores45(lista));
        System.out.println("Numeros menores que 15: " + menores15(lista));
    }

    public static int buscarMayor(List<Integer> lista){
        int mayor=0;
        for(Integer i : lista){
            if(i>mayor){
                mayor=i;
            }
        }
        return mayor;
    }

    public static int sumaNumeros(List<Integer> lista){
        int suma=0;
        for(Integer i : lista){
            suma+=i;
        }
        return suma;
    }

    public static int buscarMenor(List<Integer> lista){
        int menor=50;
        for(Integer i : lista){
            if(i<menor){
                menor=i;
            }
        }
        return menor;
    }

    public static int mayores30(List<Integer> lista){
        int mayor=30;
        int contador=0;
        for(Integer i : lista){
            if(i>mayor){
                contador++;
            }
        }
        return contador;
    }

    public static int mayores45(List<Integer> lista){
        int mayor=45;
        int contador=0;
        for(Integer i : lista){
            if(i>mayor){
                contador++;
            }
        }
        return contador;
    }

    public static int menores15(List<Integer> lista) {
        int menor = 15;
        int contador = 0;
        for (Integer i : lista) {
            if (i < menor) {
                contador++;
            }
        }
        return contador;
    }
}