package co.edu.cesde;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        int numberOfPeople, i, plate, answer, count1, count2, count3,count4;
        double bill, totalBill;
        bill = 0;
        i = 0;
        count1=0;
        count2=0;
        count3=0;
        count4=0;

        Scanner inputData = new Scanner(System.in);

        System.out.println("El menu es:");
        System.out.println("Plato        valor");
        System.out.println("Hamburguesa   10000");
        System.out.println("Perro          8000");
        System.out.println("Salchipapa     6000");
        System.out.println("Chorizos       7000");

        System.out.println("Ingrese el numero de personas que van a comer: ");
        numberOfPeople = inputData.nextInt();

        while (i < numberOfPeople) {
            System.out.println("Ingrese el numero del plato que desea comer:");
            plate = inputData.nextInt();


                switch (plate) {
                    case 1:
                        bill = bill + 10000;
                        count1= count1 + 1;
                        break;
                    case 2:
                        bill = bill + 8000;
                        count2= count2 + 1;
                        break;
                    case 3:
                        bill = bill + 6000;
                        count3= count3 + 1;
                        break;
                    case 4:
                        bill = bill + 7000;
                        count4= count4 + 1;
                        break;
                }

                i++;


        }
        if(bill>20000){
            totalBill =  bill - (bill * 0.1);
            System.out.println("Se le realizo un descuento por compras superiores a 20000$");
        }
        else{
            totalBill = bill;
        }
        if(count1>=2){
            totalBill = totalBill - (totalBill * 0.05);
        }
        if(count2>=2){
            totalBill = totalBill - (totalBill * 0.05);
        }
        if(count3>=2){
            totalBill = totalBill - (totalBill * 0.05);
        }
        if(count4>=2){
            totalBill = totalBill - (totalBill * 0.05);
        }

        System.out.println("¿Desea incluir propina?");
        System.out.println("ingrese 1 para SI, ingrese 2 para no: ");
        answer=inputData.nextInt();

        if(answer==1){
            totalBill= totalBill + (totalBill * 0.1);
        }

        System.out.println("El valor de la cuenta es: " + totalBill);

    }
}
