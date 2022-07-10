package Vehiculo;

public class Moto extends Vehiculo {
    
    private int cilindraje;

    public Moto(int cilindraje, String placa)
    {
        super(placa);
        this.cilindraje = cilindraje;
    }

    public int calcularImpuesto()
    {
        int impuesto = this.cilindraje > 150 ? 90000 : 45000;
        return impuesto;
    }
}
