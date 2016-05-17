package venta;

public class Pata {

	private int valor;
        
        public Pata(int pm){
        this.valor = (5000 * pm);
        }
        

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}