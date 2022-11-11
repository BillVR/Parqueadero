package modelo;

public class Vehiculo {

    private String placa;
    private int modelo;
    private String fecha;
    private int tipo;

    private double pago;

    public Vehiculo() {
    }

    public Vehiculo(String placa, int modelo, String fecha, int tipo) {
        this.placa = placa;
        this.modelo = modelo;
        this.fecha = fecha;
        this.tipo = tipo;
    }
    //tipo 0 es un carro y tipo 1 es una moto

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    //tipo 0 es un carro y tipo 1 es una moto
    public Double calcularPrecio() {

        pago = 0;

        if ((tipo == 0) && (modelo == 2022)) {
            pago = 2500 + (2500 * 0.20);
        }
        if ((tipo == 1) && (modelo == 2022)) {
            pago = 1200 + (2500 * 0.10);
        }
        if ((tipo == 0) && (modelo < 2012)) {
            pago = 2000;
        }
        if ((tipo == 1) && (modelo < 2012)) {
            pago = 1000;
        }
        if ((tipo == 0) && (modelo >= 2012)) {
            pago = 2500;
        }
        if ((tipo == 1) && (modelo >= 2012)) {
            pago = 1200;
        } else {
            System.out.println("Error Tipo o modelo no encontrado");
        }

        return pago;
    }

    @Override
    public String toString() {
        return "vehiculo{" + "Placa=" + placa + ", modelo=" + modelo + ", fecha=" + fecha + ", Tipo=" + tipo + '}';
    }

}
