import java.util.Arrays;
import java.util.Scanner;
public class TugasSuperindo{
public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.printf("======================================================\n\n\t     SELAMAT DATANG DI SUPERINDO\n\t   Belanja Hemat Hanya di Superindo\n\n======================================================\n");
  double berat;
  double total =0;
  String [][] Menu = {
    {"Pisang", "12000"},
    {"Apel", "22500"},
    {"Mangga", "17000"},
    {"Jeruk", "14000"}
  };
  System.out.println("\nMENU\n");
    for(int i=0; i<Menu.length; i++) {
        System.out.println((i+1)+". "+Menu[i][0]+"--> Rp."+Menu[i][1]+" /kg\n");
    }

  System.out.println("Note :\nPilih angka 1-4 sesuai nomor buah yang ingin Anda beli\nPilih angka 0 jika sudah selesai berbelanja\n");
  while (true) {
    System.out.print("Nomor buah : ");
    int menu = scan.nextInt();

    if(menu>=1 & menu<=(Menu.length +1)) {
      System.out.print("Berat buah : ");
      berat = scan.nextDouble();
      System.out.printf("\nList Belanja\n\n" +Menu[menu-1][0] +"\nRp." + Menu[menu-1][1] + "/kg" +"      (x %.2f)", berat);
      double harga = berat*Double.parseDouble(Menu[menu-1][1]);
      System.out.println("\nTotal harga --> Rp."+harga);
      System.out.println("");
      total += harga;
    }else {
        break;
    }
  }
  System.out.println("======================================================\n\nTOTAL BELANJA --> Rp. " + total +"\n\n======================================================");
}
}