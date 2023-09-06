package Tarea1Arraylist;

public class main {
    public static void main(String[] args) {        
        Parqueo p = new Parqueo();
        p.addVehiculo(new Vehiculo("514513", "Carro", 1));
        p.addVehiculo(new Vehiculo("51451A", "Carro", 2));
        p.addVehiculo(new Vehiculo("51451B", "Carro", 5));
        p.addVehiculo(new Vehiculo("51451C", "Carro", 6));
        System.out.println(p.toString());
        
        Vehiculo b =  p.buscarPorPlaca("514513");
        if (b!=null)
            System.out.println("ENCOTRADO: " + b.toString());
        Vehiculo b2 = p.removeVehiculo("51451A");
        System.out.println("ELIMINADO el vehiculo "+ b2);
        
        p.addHoras("514513", 5);
        p.addHoras("51451B", 2.5);
        p.addHoras("51451C", 3);
        p.addHoras("514513", 4);
        System.out.println(p.toString());
        
        System.out.println(p.calcularMontoDiario());

        p.print();
    }
    
}
