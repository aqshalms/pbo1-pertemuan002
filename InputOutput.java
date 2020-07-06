import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  Scanner scanner = new Scanner(System.in);
  String nama;
  String kelas;

  System.out.print("Masukkan nama anda: ");
  nama = scanner.nextLine();
  System.out.println("Hai, "+nama);

  System.out.print("Masukkan kelas anda: ");
  kelas = scanner.nextLine();
  System.out.println("Selamat datang di kelas "+kelas);
 }
}