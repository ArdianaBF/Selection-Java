import java.util.Scanner;

public class  Kasir{
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Welcome");
            System.out.println("Pilih produk");
            int produk = read.nextInt();
           
            switch (produk){
                case 1:
                    System.out.println("Keyboard\n49.99");
                    break;
                case 2:
                    System.out.println("Mouse\n19.99");
                    break;
                case 3:
                    System.out.println("Monitor\n99.99");
                    break;
                default:
                    System.out.println("No Product");

            }
            System.out.println("Masukkan jumlah yang akan dibeli ");
            int jumlah = read.nextInt();

            if(jumlah >= 20){
                System.out.println("Out of stock!\nThanks for using this app");
            }
            else{
                System.out.println("Success\nGo to the next step");

            }

            System.out.println("Total harga ");
            System.out.println("Masukkan kode barang");
            int total = read.nextInt();

            switch (total){
                case 1:
                    System.out.println(jumlah*49.99);
                    break;
                case 2:
                    System.out.println(jumlah*19.99);
                    break;
                case 3:
                    System.out.println(jumlah*99.99);
                    break;
                default:
                    System.out.println("Error\nNo Product");

            }

        

        }


    }
}
