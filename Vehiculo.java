package Tarea1Arraylist;

public class Vehiculo {
    private String placa;
    private final String[] TIPO = {"Carro", "Moto", "Camion", "Bicicleta", "Otros"};
    private int espacios;
    private double horas;
    private String tipo;
    protected int numTipo;

    public Vehiculo(String placa, int pTipo, int espacios, double horas) {
        this.placa = placa;
        this.espacios = espacios;
        this.tipo = TIPO[pTipo];
        this.horas = horas;
        this.numTipo = pTipo;
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

    public int getNumTipo() {
        return numTipo;
    }
}