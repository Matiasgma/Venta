package venta;

public class Cajon {

	private int precio;
        
        public Cajon(int cm){
            this.precio = (10000 * cm);
        }

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}