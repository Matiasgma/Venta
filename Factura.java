package venta;

import java.util.ArrayList;

public class Factura {
    private Cliente m;
    private Cajon m1;
    private Base m2;
    private Pata m3;

    private ArrayList<Mueble> arr;

    public Factura() {
        
        arr = new ArrayList<Mueble>();

    }

     public void Agregarcomp(String c1,String c2,int c3,String c4,int a1,int a2, int a3){
       m  = new Cliente(c1,c2,c3,c4);
       m1 = new Cajon(a1);  
       m2 = new Base(a2);
       m3 = new Pata(a3);
       arr.add(new Mueble(m,m1,m2,m3));
     }
    
      public void mostrarFactura(int i) {
          System.out.println("Nombre cliente: "+arr.get(i).getCte().getNombre());
          System.out.println("Apellido: "+arr.get(i).getCte().getApellido());
          System.out.println("Rut: "+arr.get(i).getCte().getRut());
          System.out.println("Dirección: "+arr.get(i).getCte().getDireccion());
          System.out.println("Valor total cajones: $"+arr.get(i).getCaj().getPrecio());
          System.out.println("Valor total Base: $"+arr.get(i).getBas().getCosto());
          System.out.println("Valor total Patas: $"+arr.get(i).getPat().getValor());
          
          

    }
}
