import java.util.ArrayList;
/**
 * Write a description of class HappyTree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HappyTree
{
    // instance variables - replace the example below with your own
    private int x;
    private ArrayList <Persona> personas;
    /**
     * Constructor for objects of class HappyTree
     */
    public HappyTree()
    {
        personas = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

    public void indicarRaiz(Persona persona){
        personas.add(persona);

    }

    public void agregarPareja(String id , Persona persona){
        for (int i =0; i < personas.size(); i++){
            if (personas.get(i).getID().equals(id)){
                personas.add(persona);

            }
        }
    }

    public void agregarHijo(String id ,Persona persona){
        for (int i =0; i < personas.size(); i++){
            if (personas.get(i).getID().equals(id)){
                persona.setHijos();

            }
        
        }

    }
    
    
    public int getNumeroHijos(String id){
        int hola =0;
        for (int i =0; i < personas.size(); i++){
            if (personas.get(i).getID().equals(id)){
                

            }
        
        }
        return hola;
    }
    
    
    public int getNumeroNietos(String id){
        int hola =0;
        
        
        return hola;
    }
    
    
    public int getFelicidad(String id){
        int hola =0;
        
        return hola;
    }
    
    
    public int getNumeroDescendientesDeNacidosDespuesDe(String id, int fecha){
        int hola =0;
        
        return hola;
        
    }
    
}
