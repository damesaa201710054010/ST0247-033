
/**
 * Esta clase contiene tres metodos recursivos que se encargan de calcular formulas
 * reconocidas como el algoritmo de euclides.
 * 
 * @author Kevin Parra, Daniel Mesa, Felipe Olaya.
 * @version 08/02/2018 Clase#2
 */
import java.util.ArrayList;
public class TallerCom
{
    
    private ArrayList<String> combinationsAux(String base, String s)
    {
	ArrayList<String> combination = new ArrayList<>();
        if(s.length() == 0)
	    {
		combination.add(base);
	    }else
	    {   
		combinationsAux(base+s.charAt(0), s.substring(1));
		combinationsAux(base, s.substring(1));
	    }
	return combination;
	
    }
    
    public ArrayList<String> combinations(String s)
    {
        return combinationsAux("", s);
    }

    
    public static void main(String[] args )
    {
	TallerCom primero = new TallerCom();
	ArrayList<String> p = primero.combinations("abc");
	for(int i = 0; i < p.size(); i++)
	    {
		System.out.println(p.get(i));
	    }
    }
}
