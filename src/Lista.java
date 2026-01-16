import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        int j = 3;
        String tarea;
        while(j==3){
            System.out.println("¿Que dsea hacer? (1=Introducir tarea final, 2=Insertar tarea en posicion, 3= Eliminar una tarea, 4=Mostrar 0=cerrar )");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                //si se eloige la opcion 0, el programa acaba
                case 0:
                    j = 0;
                    System.out.println("Programa cerrado");
                    break;
                //Como se introdyce siempre al final, no hace falta dar la posicion
                case 1:
                    System.out.println("Introduce la tarea que desea insertar:");
                    tarea = sc.nextLine();
                    lista.add(tarea);
                    break;
                //Se necesita dar una posicion que no sea la ultima ni mayor
                case 2:
                    System.out.println("Introduce la tarea que desea insertar:");
                    tarea = sc.nextLine();
                    System.out.println("Introduce la posicion donde la desea insertar:");
                    int posicion = sc.nextInt();
                    //en caso que se introduzca alguna de estas 2 se mostrara un mensaje y no se hara nada
                    if(posicion>lista.size()){
                        System.out.println("Posicion no valida");
                    }else {
                        lista.add((posicion-1), tarea);
                    }
                    break;
                //introduciendo la posicion se accede a la tarea y la elimina
                case 3:
                    System.out.println("Introduce la posicion de la tarea que desea eliminar:");
                    lista.remove((sc.nextInt()-1));
                    break;
                //recorre la lista y la muestra
                case 4:
                    for (String s : lista) {
                        System.out.println(s);
                    }
                    break;

            }
        }
    }
}