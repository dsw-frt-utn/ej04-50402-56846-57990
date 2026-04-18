package domain;

public class VehiculoElectrico extends Vehiculo {
    private double kwhBase;

<<<<<<< HEAD
    public VehiculoElectrico(String patente, Marca marca, String modelo, int anio, double capacidadCarga,
=======
    public VehiculoElectrico(String patente, String marca, String modelo, int anio, double capacidadCarga,
>>>>>>> eje3/feature/marcas
                             Sucursal sucursal, double kwhBase) {
        super(VehiculoTipo.ELECTRICO, patente, marca, modelo, anio, capacidadCarga, sucursal);
        this.kwhBase = kwhBase;
    }

<<<<<<< HEAD
    @Override
    public double calcularConsumo(double kilometros) {
        double total = (kilometros/100) * kwhBase;

        if (capacidadCarga > 1200) {
            total = total * 1.15;
=======
    public double calcularConsumo() {
        double total = kwhBase;

        if (capacidadCarga >= 1200) {
            total = total + 0.15;
>>>>>>> eje3/feature/marcas
        }

        return total;
    }
}
