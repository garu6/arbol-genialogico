
/**
 * Write a description of class Espanol here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Espanol extends Persona
{
    // instance variables - replace the example below with your own
    private int x;
    private ZonaEspana zona;
    /**
     * Constructor for objects of class Espanol
     */
    public Espanol(String id, String nombreApellido, String fechaNacimiento, ZonaEspana zona)
    {
        super(id ,nombreApellido, fechaNacimiento);
        this.zona = zona;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    
    public int getHijos(){
        return super.getHijos();
        
    }
}
