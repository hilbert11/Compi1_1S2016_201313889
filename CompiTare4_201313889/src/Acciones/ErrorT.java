package Acciones;

/**
 *
 * @author Hilbert
 */
public class ErrorT 
{
    
    public String lexema = "";
    public String tipo = "";
    public String linea="-";
    public String columna="-";
    public String descripcion="";
    public String archivo="";
    
    public ErrorT(String ptoken, int plinea, int pcolumna, String ptipo, String desc)
    {
        this.lexema = ptoken;
        this.linea= String.valueOf(plinea+1);
        this.columna= String.valueOf(pcolumna+1);
        this.tipo=ptipo;
        this.descripcion=desc;
    }
    
    public ErrorT(String ptoken, String tipo, String desc)
    {
        this.lexema=ptoken;
        this.tipo=tipo;
        this.descripcion=desc;
    }
    
    public ErrorT(){}
    
}
