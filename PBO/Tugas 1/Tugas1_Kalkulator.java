class Kalkulator{
    // Deklarasi variable operan1 jenis data double dengan akses private
    private double operan1;
    // Deklarasi variable operan2 jenis data double dengan akses private
    private double operan2;

    // Membuat method dengan parameter x jenis data double
    void isiOperan1(double x){
        // Inisiasi atau edit value dari variable operan1 yang terdapat dalam class.
        this.operan1 = x;
    }
    // Membuat method dengan parameter x jenis data double
    void isiOperan2(double x){
        // Inisiasi atau edit value dari variable operan2 yang terdapat dalam class.
        this.operan2 = x;
    }
    double tambah(){
        // Method akan mengembalikan nilai dari penjumalahan tambah variable operan1 dan operan2.
        return this.operan1 + this.operan2;
    }
    double kurang(){
        // Method akan mengembalikan nilai dari penjumalahan kurang variable operan1 dan operan2.
        return this.operan1 - this.operan2;
    }
    double kali(){
        // Method akan mengembalikan nilai dari penjumalahan kali variable operan1 dan operan2.
        return this.operan1 * this.operan2;
    }
    double bagi(){
        // Method akan mengembalikan nilai dari penjumalahan bagi variable operan1 dan operan2.
        return this.operan1 / this.operan2;
    }
    double pangkat(){
        // Method akan mengembalikan nilai dari penjumalahan pangkat variable operan1 dan operan2.
        return Math.pow(this.operan1, this.operan2);
    }
}

class CalculatorTester{
    // Deklarasi varibale calcualator sebagai sebuah objek dari class Kalkulator
    Kalkulator calculator = new Kalkulator();

    // Membuat constructor dengan 2 parameter yaitu operan1 dan operan2 berjenis data double
    CalculatorTester(double operan1, double operan2){
        // Memanggil method isiOperan dalam class Kalkulator untuk mengisi value
        calculator.isiOperan1(operan1);
        calculator.isiOperan2(operan2);

        // Deklarasi variable hasilTambah yang berisi return value dari method tambah() pada class Kalkulator
        double hasilTambah = calculator.tambah();
        System.out.println("Hasil Tambah: " + hasilTambah);

        // Deklarasi variable hasilKurang yang berisi return value dari method kurang() pada class Kalkulator
        double hasilKurang = calculator.kurang();
        System.out.println("Hasil Kurang: " + hasilKurang);

        // Deklarasi variable hasilKali yang berisi return value dari method kali() pada class Kalkulator
        double hasilKali = calculator.kali();
        System.out.println("Hasil Kali: " + hasilKali);

        // Deklarasi variable hasilBagi yang berisi return value dari method bagi() pada class Kalkulator
        double hasilBagi = calculator.bagi();
        System.out.println("Hasil Bagi: " + hasilBagi);

        // Deklarasi variable hasilPangkat yang berisi return value dari method pangkat() pada class Kalkulator
        double hasilPangkat = calculator.pangkat();
        System.out.println("Hasil Pangkat: " + hasilPangkat);
    }
}



public class Tugas1_Kalkulator {

    public static void main(String[] args) {

        // // Deklarasi varibale kal sebagai sebuah objek dari class CalculatorTester dengan parameter(operan1: 10, operan2: 5)
        var kal = new CalculatorTester(10,5);
    }
}