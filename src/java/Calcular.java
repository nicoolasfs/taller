
public class Calcular {
    private double valor;
    
    public double getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public double calcularValor(int valor,double moneda){
        this.valor=valor*moneda;
        return this.valor;
    }
    
}
