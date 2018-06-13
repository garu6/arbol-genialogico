
/**
 * Write a description of class Europeo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Europeo extends Persona
{
    // instance variables - replace the example below with your own
    private String nacionalidad;
    private String lenguaMaterna;
    
    
    /**
     * Constructor for objects of class Europeo
     */
    public Europeo(String id, String nombreApellido, String fechaNacimiento,String nacionalidad, String lenguaMaterna)
    {
        super(id ,nombreApellido, fechaNacimiento);
        this.lenguaMaterna = lenguaMaterna;
        this.nacionalidad = nacionalidad;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    
    public int getHijos(){
        return super.getHijos();
        
    }
}
