import java.util.*;

public class Latihan{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Huruf : ");
        char huruf = input.next().charAt(0);
        System.out.println("Masukan Angka : ");
        int angka = input.nextInt();
        input.nextLine();
        System.out.println("Masukan Tujuan Kota : ");
        String kota = input.nextLine();
        SoalSatu(huruf);
        SoalDua(angka);
        SoalTiga(kota);

        input.close();
    }

    public static void SoalSatu(char huruf){
        switch(huruf){
            case 'A' :
                System.out.println("Excellent");
                break;
            case 'B' : 
                System.out.println("Good");
                break;
            case 'C' :
                System.out.println("Average");
                break;
            case 'D' :
                System.out.println("Fail");
                break;
            default : 
                break;
        }
    }

    public static void SoalDua(int angka){
        switch(angka){
            case 1:
                System.out.println("Satu");
                break;
            case 2:
                System.out.println("Dua");
                break;
            case 3:
                System.out.println("Tiga");
                break;
            case 4:
                System.out.println("Empat");
                break;
            case 5:
                System.out.println("Lima");
                break;
            case 6:
                System.out.println("Enam");
                break;
            case 7:
                System.out.println("Tujuh");
                break;
            case 8:
                System.out.println("Delapan");
                break;
            case 9:
                System.out.println("Sembilan");
                break;
            case 10:
                System.out.println("Sepuluh");
                break;
            default :
                System.out.println("ini berapa ya?");
                break;

        }
    }

    public static void SoalTiga(String kota){
        System.out.println("Masukan Jumlah Penumpang : ");
        Scanner input = new Scanner(System.in);
        switch(kota){
            case "Jakarta":
                double penumpangJakarta = input.nextInt() * 145.000;
                System.out.printf("Total Rp. %.3f", penumpangJakarta);
                break;
            case "Bogor":
                double penumpangBogay = (input.nextInt() * 200.000);
                if(penumpangBogay > 250.000){
                    double diskon = 0.10 * penumpangBogay;
                    double hasil = penumpangBogay - diskon;
                    System.out.printf("Selamat anda mendapatkan diskon sebesar 10 persen dengan total Rp. %.3f", hasil);
                }else{
                    System.out.printf("Total Rp. %.3f", penumpangBogay);
                }
                break;
            case "Garut":
                double penumpangGarut = input.nextInt() * 75.000;
                System.out.printf("Total Rp. %.3f", penumpangGarut);
                break;
            case "Purwakarta":
                double penumpangPurwakarta = input.nextInt() * 75.000;
                System.out.printf("Total Rp. %.3f", penumpangPurwakarta);
                break;
            default : 
                break;
        }
        input.close();
    }
}