
/**
 * Write a description of class ZonaEspana here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public enum ZonaEspana
{
    // instance variables - replace the example below with your own
    NORTE("Norte"),
    CENTRO("Centro"),
    SUR("Sur");

    
    private String zona;
    /**
     * Constructor for objects of class ZonaEspana
     */
    private ZonaEspana(String zona)
    {
        this.zona = zona;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getZona()
    {
        
        return zona;
    }
}
