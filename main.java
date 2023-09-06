package Tarea1Arraylist;

public class main {
    public static int elegirVahiculo(int pOpcion){
        switch(pOpcion){
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            default:
                System.out.println("Opcion no valida de 1 a 5");
                return -1;
        }
    }
    public static void main(String[] args) {        
        Parqueo p = new Parqueo();
        Vehiculo v1;
        v1 = new Vehiculo("514513", elegirVahiculo(1), 1, 10);
        System.out.println(v1);
    }
}
