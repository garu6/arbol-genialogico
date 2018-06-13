
/**
 * Write a description of class Persona here.
 * Clase que representa a una persona en el arbol genialogico
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Persona
{
    
    private String id;
    private String nombreApellido;
    private String fechaNacimiento;
    
    private int hijos;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String id ,String nombreApellido, String fechaNacimiento)
    {
        this.id = id;
        this.nombreApellido = nombreApellido;
        this.fechaNacimiento = fechaNacimiento;
        hijos =0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        int hola =0;
        return hola;
    }
    
    public String getID(){
        return id;
        
    }
    
    
    public void setHijos(){
        hijos++;
        
    }
    
    
    public int getHijos(){
        return hijos;
        
    }
}
