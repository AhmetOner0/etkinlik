package patikadev;
import java.util.Scanner;
public class etkinlik {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int heat;
        System.out.print("hava sıcaklığını giriniz:");
        heat = inp.nextInt();
        if(heat < 5){
            System.out.println("kayak yapmaya gidebilirsiniz.");
        }else if((heat >= 5) && (heat <= 25)){
            if (heat <= 15){
                System.out.println("sinemaya gidebilirsiniz.");

            if (heat >= 10){
                System.out.println("pikniğe gidebilirsiniz.");
            }

            }
        }else{
            System.out.println("yüzmeye gidebilirsiniz.");
        }
    }
}
