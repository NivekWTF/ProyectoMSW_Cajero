package Proyecto_Terminado;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
	static Scanner entrada = new Scanner(System.in);
    static int seleccion = -1; //opción elegida del usuario
    Cuenta cuenta;
    public static void main(String[] args) {
        String numero_cuenta;
        int transacciones, retiro, deposito,transferencia;
        int saldo;
        				
        System.out.println(" Buenas tardes esta en un cajero automatico de BBVA");
                System.out.println(" Hoy es " + LocalDate.now());

        System.out.println(" Porfavor ingrese su numero de cuenta:");
        numero_cuenta = entrada.nextLine();

        Cuenta cuenta = new Cuenta();
        cuenta.setNumeroCuenta(numero_cuenta);

        Menu();

    }

    private static void Menu(){

        //Mientras la opción elegida sea 0, preguntamos al usuario
		while(seleccion != 0){
			//Try catch para evitar que el programa termine si hay un error
			try{

                System.out.println(" Porfavor seleccione una opción:");
                System.out.println("    1. Consulta de saldo.");
                System.out.println("    2. Retiro de efectivo.");
                System.out.println("    3. Deposito de efectivo.");
                System.out.println("    4. Hacer una transferencia");
                System.out.println("    5. Salir.");
				//Recoger una variable por consola
				seleccion = entrada.nextInt();
	
				//Ejemplo de switch case en Java
				switch(seleccion){
				case 1: 
					Consulta();
                    break;
				case 2: 
					Retiro();
                    break;
				case 3: 
					Deposito();
                    break;
				case 4: 
					Transferencia();
                    break;
				case 0: 
                    System.out.println("==========================");
                    System.out.println("Gracias, vuelva pronto.");
                    System.out.println("==========================");
                    break;
				default:
					System.out.println("Número no reconocido");
                    break;
				}
				
				System.out.println("\n"); 
				
			}catch(Exception e){
				System.out.println("Uoop! Error!");
			}
		}
    }


    private static void Consulta() {
        Cuenta cuenta = new Cuenta();
        LocalDate fecha = LocalDate.now();
        System.out.println("====================================");
        System.out.println("=================BBVA===============");
        System.out.println("	Debito				");
        System.out.println("Se realizo una Consulta el " +  fecha);
        System.out.println("Tu saldo actual es: " + cuenta.getSaldo());
        System.out.println("====================================");
    }

    private static void Retiro() {
          
        Cuenta cuenta = new Cuenta();
        LocalDate fechaactual = LocalDate.now();

        int id = 1234;
        Date fecha = Date.from(fechaactual.atStartOfDay(ZoneId.systemDefault()).toInstant()); 
        int tipo =1 ; 

        System.out.println("Ingrese el monto a retirar: ");
        double monto = entrada.nextDouble();

        Retiro retiro = new Retiro( id, fecha,tipo, monto);
        System.out.println("====================================");
        System.out.println("=================BBVA===============");

        cuenta.setSaldo(cuenta.getSaldo() - monto);
        System.out.println("	Se retiro: " + retiro.getMonto());
        System.out.println("====================================");
    }

    private static void Deposito() {
        Cuenta cuenta = new Cuenta();
        LocalDate fecha = LocalDate.now();
        System.out.println("====================================");
        System.out.println("=================BBVA===============");
        System.out.println("	Debito				");
        System.out.println("Se realizo un deposito el " +  fecha);
        System.out.println("Tu saldo actual es: " + cuenta.getSaldo());
        System.out.println("====================================");
    }

    private static void Transferencia() {
        Cuenta cuenta = new Cuenta();
        LocalDate fecha = LocalDate.now();
        System.out.println("====================================");
        System.out.println("=================BBVA===============");
        System.out.println("	Debito				");
        System.out.println("Se realizo una transferencia el " +  fecha);
        System.out.println("Tu saldo actual es: " + cuenta.getSaldo());
        System.out.println("====================================");
    }

    
    
    


}

