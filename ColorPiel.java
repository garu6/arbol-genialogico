
/**
 * Write a description of class ColorPiel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public enum ColorPiel
{
    // instance variables - replace the example below with your own
    BLANCO("Blanco"),
    NEGRO("Negro");

    
    private String color;
    /**
     * Constructor for objects of class ColorPiel
     */
    private ColorPiel(String color)
    {
        this.color = color;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getColorPiel()
    {
        return color;
    }
}
