package Tarea1Arraylist;

import java.util.ArrayList;

public class Parqueo {
    /*
     * clase Parqueo
     * 
     */
    private int[] precios = {1500, 800, 2500, 500, 2000};
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
        String str = "";
        for (int i = 0; i < parqueo.size(); i++) {
            str += parqueo.get(i) +"\n";
        }
        return str;
    }

    
    
    public boolean addVehiculo(Vehiculo vehiculo){
        parqueo.add(vehiculo);
        return true;
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

    private double montoPorVehiculo(Vehiculo v){
        return v.getHoras() * precios[v.getNumTipo()];
    }
    
    public void print(){
        Vehiculo v;
        for (int i = 0; i < parqueo.size(); i++) {
            v = parqueo.get(i);
            System.out.println(v.getTipo() + " " + v.getPlaca() + "\t" + "Horas: " + v.getHoras() + montoPorVehiculo(v));
        }
    }

    private int actualizarDescuentoBool(int pTipo, int pDescuento){
        for (int i = 0; i < parqueo.size(); i++) {
            if(parqueo.get(i).getTipo().equals(pTipo)){
                return true;
            }
        }
        return false;
    }

    public double sumarHoras(String pPlaca, double pHoras){
        Vehiculo v = buscarPorPlaca(pPlaca);
        if(v != null){
            v.setHoras(v.getHoras() + pHoras);
            return v.getHoras();
        }
        return 0;
    }
}
