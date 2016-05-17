package venta;

public class Mueble {
    private Cliente cte;
    private Cajon caj;
    private Base  bas;
    private Pata  pat;

	public Mueble(Cliente m ,Cajon m1,Base m2,Pata m3) {
         cte = m; 
         caj = m1;
         bas = m2;
         pat = m3;

	}
    
    public Cliente getCte(){
        return cte;
    }
    public void setcte(Cliente cte){
        this.cte = cte;
    }
    public Cajon getCaj (){
        return caj;
    }
    public void setCaj(Cajon caj) {
        this.caj = caj;

    }
    public Base getBas(){
        return bas;
    }
    public void setBas(Base bas){
        this.bas = bas;
    }
    public Pata getPat(){
        return pat;
    }
    public void setPat(Pata pat){
        this.pat = pat;
    }
}
