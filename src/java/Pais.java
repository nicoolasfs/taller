
public class Pais {

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    String pais;
    String palabra;
    double cantidad;

    public Pais(String pais, double cantidad, String palabra) {
        this.pais = pais;
        this.palabra= palabra;
        this.cantidad=cantidad;
    }

     public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public double getCantidad() {
        return cantidad;
    }


    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
}
