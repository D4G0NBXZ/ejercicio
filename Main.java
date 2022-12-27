public class Main {
    
        public static void main(String[] args) {

            Coche miCoche = new Coche();
            int resultado;
            int num1=1;
            int num2=2;
            int num3=3;
            
            resultado= suma(num1, num2, num3);
            System.out.println(resultado);

            
            miCoche.incrementoPuertas();
            miCoche.incrementoPuertas();
            System.out.println("El numero de puertas es: " + miCoche.numPuertas);

        }

        public static int suma(int a, int b, int c) {
            return a+b+c;
        }
    }

        class Coche{
            public int numPuertas = 4;

            public void incrementoPuertas() {
                this.numPuertas++;
            }
        }




