package Acciones;

/**
 *
 * @author Hilbert
 */
public class ListaToken 
{
    public int linea;
    public int columna;
    public String descripcion, lexema;
    
    public ListaToken()
    {
        this.linea=0;
        this.columna=0;
        this.descripcion="";
        this.lexema="";
    }
    
    public ListaToken(String v, int l, int c, String d)
    {
        this.linea=l;
        this.columna=c;
        this.descripcion=d;
        this.lexema=v;
    }
    
}
