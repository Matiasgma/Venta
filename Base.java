package venta;

public class Base {

	private int costo;
        
        public Base(int bm){
            this.costo = (15000 * bm);
        }

	public int getCosto() {
		return this.costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

}