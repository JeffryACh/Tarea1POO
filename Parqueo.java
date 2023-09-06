package Tarea1Arraylist;

import java.util.ArrayList;

public class Parqueo {
    /*
     * clase Parqueo
     * 
     */
    private ArrayList<Vehiculo> parqueo; // Lista de vehiculos en el parqueo
    private int espacios; // Espacios ocupados en el parqueo

    public Parqueo() {
        parqueo = new ArrayList<Vehiculo>();
    }

    /*
        Carro 514513 [1, h:0.0]    1
        Carro 514ABC [1, h:0.0]    2
        Camion 514CXC [5, h:0.0]   7
        Carro 514TRY [1, h:0.0]    8
    
    */
    @Override
    public String toString() {
        int acum = 0;
        String str = "";
        for (int i = 0; i < parqueo.size(); i++) {
            acum += parqueo.get(i).getEspacios();
            str += parqueo.get(i) + "\t" + acum +"\n";
        }
        return str;
    }

    
    
    public boolean addVehiculo(Vehiculo vehiculo){
        if (getEspacios() + vehiculo.getEspacios()  <= MAXIMO){
            parqueo.add(vehiculo);
            this.espacios += vehiculo.getEspacios();
            return true;
        }
        return false;
    }
    
    public Vehiculo buscarPorPlaca(String placa){
        for (int i = 0; i < parqueo.size(); i++) {
            if (parqueo.get(i).getPlaca().equals(placa))
                return parqueo.get(i);
        }
        return null;
    }
    
    public Vehiculo removeVehiculo(String placa){
        Vehiculo buscado = buscarPorPlaca(placa);
        if(buscado != null){
            parqueo.remove(buscado);
            this.espacios -= buscado.getEspacios();
        }
        return buscado;
    }
    
    
    public double addHoras(String placa, double horas){
        Vehiculo buscado = buscarPorPlaca(placa);
        if(buscado != null){
            buscado.setHoras(buscado.getHoras() + horas);
            return buscado.getHoras();
        }
        return 0;
    }
    
    public double calcularMontoDiario(){
        return getEspaciosActivos() * MONTO_HORA;
    }
    
    private int getEspacios(){
        int res = 0;
        for (int i = 0; i < parqueo.size(); i++) {
            res += parqueo.get(i).getEspacios();
        }
        return res;
    }
    
    private double getEspaciosActivos(){
        double res = 0;
        for (int i = 0; i < parqueo.size(); i++) {
            res += parqueo.get(i).getHoras() * parqueo.get(i).getEspacios();
        }
        return res;
    }

    private double montoPorVehiculo(Vehiculo v){
        return v.getHoras() * v.getEspacios() * MONTO_HORA;
    }
    
    public void print(){
        Vehiculo v;
        for (int i = 0; i < parqueo.size(); i++) {
            v = parqueo.get(i);
            System.out.println(v.getTipo() + " " + v.getPlaca() + "\t" + "Horas: " + v.getHoras() + montoPorVehiculo(v));
        }
    }
}
