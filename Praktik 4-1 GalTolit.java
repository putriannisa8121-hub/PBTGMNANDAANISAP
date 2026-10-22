import java.util.Scanner; 

public class GalTolit {
    public static void main(String[] args) {
        double gallons;
        double liters;

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah galon yang ingin dikonversi: ");
        gallons = in.nextDouble(); // Mengambil input angka desimal dari user

        liters = gallons * 3.7854;

        System.out.println(gallons + " gallons equals " + liters + " liters");
        
        in.close();
    }
}
