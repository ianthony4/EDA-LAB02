package LAB02.Ejercicio4;
import java.util.*;

public class Ejercicio4{
    public static void main(String[] args){
        System.out.println("--- Primera Parte---");
        List<Integer> numbers = new ArrayList<Integer>();
        //Probaremos metodos de 'List'
        numbers.add(1);
        numbers.add(2);
        System.out.println(numbers);
        //Añadimos varios elementos en una sola linea
        numbers.addAll(Arrays.asList(3,4,5));
        System.out.println(numbers);
        //Eliminamos elementos de nuestra lista
        //Eliminamos el ultimo elemento "5"
        numbers.remove(numbers.size());
        System.out.println(numbers);
        //Comprobando si existen ciertos elementos en la lista
        boolean flag = numbers.containsAll(Arrays.asList(2,1,3));
        System.out.println(flag);
        //Seteando elementos de la lista
        //Cambiando en el index 0, colocando el numero 6
        numbers.set(0,6);
        System.out.println(numbers);
        //Limpiando la lista
        numbers.clear();
        System.out.println(numbers+"\n");
        

    }
}