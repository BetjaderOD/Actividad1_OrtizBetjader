package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfig;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        Scanner scanner = new Scanner(System.in);
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        int opc;

        do {
            do {
                System.out.println("Ingresa La Oprecaion que deseas Realizar");
                System.out.println("1 - El Primer Ejercicio");
                System.out.println("2 - IMC");
                System.out.println("3 - Calculadora");
                System.out.println("4 - Suma los numeros del limite inferior y superior");
                System.out.println("5 - Ordenar 5 numeros");
                System.out.println("6 - Salir");
                opc = scanner.nextInt();
            } while (opc > 6 || opc < 1);


            switch (opc) {
                case 1:
                    Object[] numbers = {5.0, 5D};
                    Double response = (Double)
                            client.execute("Methods.addition", numbers);
                    System.out.println("Result -> " + response);
                    break;
                case 2:
                    System.out.println("Ingresa tu Nombre");
                    String name = scanner.next();

                    System.out.println("Ingresa tu Peso");
                    double peso = scanner.nextDouble();

                    System.out.println("Ingresa tu Altura");
                    double altura = scanner.nextDouble();

                    Object[] imc = {peso, altura, name};
                    String responseI = (String)
                            client.execute("Methods.imc", imc);
                    System.out.println("Result -> " + responseI);
                    break;
                case 3:
                    System.out.println("Betjader Ortiz Delgado");
                    System.out.println("Ingresa el primer numero");
                    double num1 = scanner.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    double num2 = scanner.nextDouble();
                    System.out.println("Ingresa el tercer numero");
                    double num3 = scanner.nextDouble();
                    System.out.println("Ingresa el cuarto numero");
                    double num4 = scanner.nextDouble();

                    Object[] cal = {num1, num2, num3, num4};
                    String result = (String)
                            client.execute("Methods.cal", cal);
                    System.out.println("Result -> " + result);
                    break;
                case 4:
                    System.out.println("Ingresa el Primer Numero");
                    int num5 = scanner.nextInt();
                    System.out.println("Ingresa el Segudo Numero");
                    int num6 = scanner.nextInt();

                    Object[] suma = {num5, num6};
                    int result1 = (int)
                            client.execute("Methods.suma", suma);
                    System.out.println("Result -> " + result1);

                    break;
                case 5:
                    System.out.println("Ingresa El numero 1");
                    int num7 = scanner.nextInt();

                    System.out.println("Ingresa El numero 2");
                    int num8 = scanner.nextInt();

                    System.out.println("Ingresa El numero 3");
                    int num9 = scanner.nextInt();

                    System.out.println("Ingresa El numero 4");
                    int num10 = scanner.nextInt();


                    System.out.println("Ingresa El numero 5");
                    int num11 = scanner.nextInt();

                    Object[] cinco = {num7, num8, num9, num10, num11};
                    String result2 = (String)
                            client.execute("Methods.cinco", cinco);
                    System.out.println("Result -> " + result2);
                    break;
            }
        }while(opc!=6);

    }
}
