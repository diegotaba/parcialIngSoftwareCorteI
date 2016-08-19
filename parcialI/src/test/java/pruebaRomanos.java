
import junit.framework.Assert;
import org.testng.annotations.Test;


public class pruebaRomanos {
    
    @Test
    public void validarIngresoDedato(){}
    
    @Test
    public void validarSoloNumeros(){}
    
    @Test
    public void validarNoCero(){}
    
    @Test
    public void validarNoNegativo(){}
    
    @Test
    public void validarEquivalenteRomanoArabigo(){}
    
    
    @Test
    public void validarConcatenacion(){}
     
    @Test
    public void validarCasosEspeciales(){
    }
    
    @Test 
    public void validarSumaEnteros(){}
    
    @Test
    public void toDoRetornaXXXSiEs300(){
        int numero = 300;
        Assert.assertEquals("XXX", numero, 300);
    }
    
    @Test
    public void toDoRetornaCDSiEs400(){
        
    }
}
