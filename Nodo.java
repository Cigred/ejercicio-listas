package ejerciciolista;

public class Nodo {
    private String nombre;
   private Nodo siguiente;
public Nodo(Nodo siguiente,String nombre){
    this. siguiente = siguiente;
    this.nombre = nombre;
}

    public Nodo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //aqui te tiene que retornar un Nodo
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}