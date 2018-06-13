
/**
 * Write a description of class NoEuropeo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NoEuropeo extends Persona
{
    // instance variables - replace the example below with your own
    private int x;
    
    private String nacionalidad;
    private ColorPiel color;
    
    /**
     * Constructor for objects of class NoEuropeo
     */
    public NoEuropeo(String id ,String nombreApellido, String fechaNacimiento,  String nacionalidad , ColorPiel color)
    {
        super(id ,nombreApellido, fechaNacimiento);
        this.nacionalidad = nacionalidad;
        this.color = color;
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
