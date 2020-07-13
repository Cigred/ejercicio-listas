package ejerciciolista;

import java.util.Scanner;

public class Lista {
  private Nodo inicio;
    private int tamanio;
    int tope;
static Scanner teclado = new Scanner(System.in);
    public Lista() {
        inicio=null;
        tamanio=0;
        tope = 0;
    }
    public boolean esVacia(){
        return inicio==null;
    }
     public void agregar(String nombre){
        Nodo nuevo= new Nodo();
        nuevo.setNombre(nombre);
        if(esVacia()){//inicio==null
            inicio=nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio=nuevo;
        }
        tamanio++;
    }
    public void listar(){
        if(!esVacia()){
            Nodo aux = inicio;
            while(aux!=null){
                System.out.print("[ " +aux.getNombre()+ " ]"+" -> "+"\n");
               aux = aux.getSiguiente();
               
            }
        }else{
            System.out.println("La lista esta vacia....");
        }}
    public void Eliminarlista(){    
    inicio= null;
    System.out.println( "Eliminacion correcta");  
    }  
        
    }
