package LAB02.Ejercicio4;
import java.util.*;
public class Node<T> {
    List<T> data;
    int rootIndex = 0;
    int currentIndex = rootIndex;
    
    public Node(){
        data = new ArrayList<T>();
    }
}
