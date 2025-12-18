import java.util.ArrayList;


public class Nodo {
    String nombre;

    ArrayList<Nodos> vecinos;

    Nodo(String nombre){
        this.nombre = nombre;
        this.vecinos = new ArrayList<>();
    }

    void agregarNodo(Nodo n){
        if(!vecinos.contains(n))
            vecinos.add(n);

    }

    void conectar(Nodo n){
        a.conectar(b);
        b.conectar(a);
        
    }

    void mostrar(){
        System.out.println("=== GRAFO ===");
        for (Nodo n : nodos){
            System.out.println(n + " -->" + )
        }
    }

    public String getNombre(){
        return nombre;
        
    }

    public String getVecinos(){
        String tmp;

        for (Nodo v : vecinos){
            tmp += "[" + v.getNombre() + "] - ";
        }
    }

    return tmp;
}