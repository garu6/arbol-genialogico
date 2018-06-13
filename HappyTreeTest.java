import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Clase TreeHappyTest.
 */
public class HappyTreeTest
{
    HappyTree treeHapp1;

    /**
     * Default constructor for test class TreeHappyTest
     */
    public HappyTreeTest()
    {

    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        treeHapp1 = new HappyTree();

        Espanol espanol1 = new Espanol("001", "Juan Costas", "01/01/1901", ZonaEspana.NORTE);
        Europeo europeo1 = new Europeo("002", "Mary Smith", "03/03/1907", "Holanda", "Holandes");

        treeHapp1.indicarRaiz(espanol1);
        treeHapp1.agregarPareja("001", europeo1);

        Europeo europeo2 = new Europeo("003", "Peter Costas", "09/09/1925", "Alemania", "Aleman");
        treeHapp1.agregarHijo("001", europeo2);

        Europeo europeo3 = new Europeo("004", "Rose Costas", "10/10/1927", "Alemana", "Aleman");
        treeHapp1.agregarHijo("001", europeo3);

        NoEuropeo noEurope1 = new NoEuropeo("005", "Henry Costas", "20/02/1928", "Estados Unidos", ColorPiel.BLANCO);
        treeHapp1.agregarHijo("001", noEurope1);

        Espanol espanol2 = new Espanol("006", "Maria Alonso", "02/08/1926", ZonaEspana.SUR);
        treeHapp1.agregarPareja("003", espanol2);

        Espanol espanol3 = new Espanol("007", "Eva Costas", "12/12/1950", ZonaEspana.CENTRO);
        treeHapp1.agregarHijo("003", espanol3);

        Espanol espanol4 = new Espanol("008", "Marcos Costas", "22/11/1951", ZonaEspana.NORTE);       
        treeHapp1.agregarHijo("003", espanol4);

        NoEuropeo noEurope2 = new NoEuropeo("009", "Diana Brown", "21/03/1930", "Canada", ColorPiel.NEGRO);
        treeHapp1.agregarPareja("005", noEurope2);

        Europeo europeo4 = new Europeo("010", "Marc Costas", "12/05/1953", "Inglesa", "Ingles");
        treeHapp1.agregarHijo("005", europeo4);

        Europeo europeo5 = new Europeo("011", "Susan Jones", "12/05/1953", "Inglesa", "Ingles");
        treeHapp1.agregarPareja("010", europeo5);

        NoEuropeo noEurope3 = new NoEuropeo("012", "Fernanda Costas", "20/03/1984", "Mexicana", ColorPiel.BLANCO);
        treeHapp1.agregarHijo("010", noEurope3);    

        Espanol espanol5 = new Espanol("013", "Jose Costas", "22/09/1987", ZonaEspana.SUR);       
        treeHapp1.agregarHijo("010", espanol5);          
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test02()
    {
        assertEquals(3, treeHapp1.getNumeroHijos("001"));
        assertEquals(2, treeHapp1.getNumeroHijos("003"));
        assertEquals(0, treeHapp1.getNumeroHijos("008"));
        assertEquals(0, treeHapp1.getNumeroHijos("004"));
        assertEquals(1, treeHapp1.getNumeroHijos("005"));
        assertEquals(0, treeHapp1.getNumeroHijos("012"));
    }

    @Test
    public void test03()
    {
        assertEquals(3, treeHapp1.getNumeroNietos("001"));
        assertEquals(2, treeHapp1.getNumeroNietos("005"));
        assertEquals(0, treeHapp1.getNumeroNietos("008"));
        assertEquals(0, treeHapp1.getNumeroNietos("012"));        
    }

    @Test
    public void test04()
    {
        assertEquals(110, treeHapp1.getFelicidad("001"));
        assertEquals(37, treeHapp1.getFelicidad("003"));           
        assertEquals(6, treeHapp1.getFelicidad("004")); 
        assertEquals(46, treeHapp1.getFelicidad("005"));         
    }

    @Test
    public void test05()
    {
        assertEquals(4, treeHapp1.getNumeroDescendientesDeNacidosDespuesDe("001", 1950));
        assertEquals(8, treeHapp1.getNumeroDescendientesDeNacidosDespuesDe("001", 1900));           
        assertEquals(0, treeHapp1.getNumeroDescendientesDeNacidosDespuesDe("004", 1930)); 
        assertEquals(1, treeHapp1.getNumeroDescendientesDeNacidosDespuesDe("005", 1985));         
    }   
    
    @Test
    public void test06()
    {
        assertEquals(9, treeHapp1.escribirEnDiscoDuro());
        TreeHappy treeHapp2 = new HappyTree();
        assertEquals(9, treeHapp1.cargarDeDiscoDuro());
    }     

}

