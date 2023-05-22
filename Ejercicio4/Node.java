package LAB02.Ejercicio4;
import java.util.*;
public class Node<T> {
    List<T> data;
    int rootIndex = 0;
    int currentIndex = rootIndex;
    
    public Node(){
        data = new ArrayList<T>();
    }

    public Node(T data){
        this();
        this.add(data);
    }

    //Creacion del metodo ADD para que funcione el constructor de arriba

    public void add(T data){
        this.data.add(data);
    }

    public T getRoot(){
        return data.get(rootIndex);
    }
}
