package Tarea1Arraylist;

public class Vehiculo {
    private String placa;
    private String tipo;
    private int espacios;
    private double horas;

    public Vehiculo(String placa, String tipo, int espacios) {
        this.placa = placa;
        this.tipo = tipo;
        this.espacios = espacios;
    }

    @Override
    public String toString() {
        return tipo + ": " + placa + " [" + espacios +", h:"+ horas +']';
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEspacios() {
        return espacios;
    }

    public void setEspacios(int espacios) {
        this.espacios = espacios;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
}