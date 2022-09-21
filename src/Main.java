public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        int param1= 12;
        int param2=8;
        int param3=9;
        var valor= suma(param1,param2,param3);

        System.out.println(valor);
        System.out.println(miCoche.puerta);

    }
    public static int suma(int a, int b, int c){
        return a+b+c;
    }
    static class Coche{
        public int puerta = 0;

        public void AgregarPuerta(){
            this.puerta++;
        }
    }
}
