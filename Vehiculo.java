package Vehiculo;

public class Vehiculo {
    String placa;
    
    public static void main(String[] args)
    {
        Moto m = new Moto(150,"XTZ000");
        System.out.println(m.calcularImpuesto());
    }

    public Vehiculo(String placa)
    {
        this.placa = placa;
    }
}
