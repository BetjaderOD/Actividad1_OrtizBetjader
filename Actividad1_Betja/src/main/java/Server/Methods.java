package Server;

import java.util.Arrays;

public class Methods {
    public  double addition (double num1, double num2){

        return (num1+num2);

    }
    public String imc (double peso, double altura, String name){
        double result = peso / (altura*altura);
        String mensaje = "Hola " + name + " tu imc es " + result;

        return mensaje ;

    }
    public  String cal (double num1,double num2,double num3,double num4 ) {
        double producto = num1 * num2 * num3 * num4;
        double suma = num1 + num2 + num3 + num4;
        double prom = suma / 4;
        String mensaje =
                "El producto es " + producto +
                        " la suma es " + suma + ""
                        + " y el promedio es " + prom;
        return mensaje;


    }
    public int suma (int num5,int num6){
        int suma = 0;
        for(int i = num5+1 ; i < num6; i++){
            suma= suma + i;

        }
        return suma;

    }
    public  String cinco (int num7,int num8,int num9,int num10,int num11){
        int array [] = {num7,num8,num9,num10,num11};
        Arrays.sort(array);
        return Arrays.toString(array);

    }

}
