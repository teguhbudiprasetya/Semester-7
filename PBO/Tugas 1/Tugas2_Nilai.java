class Nilai{
    // Deklarasi variable quis jenis data double dengan akses private
    private double quis;
    // Deklarasi variable uts jenis data double dengan akses private
    private double uts;
    // Deklarasi variable uas jenis data double dengan akses private
    private double uas;

    // Membuat method dengan parameter x jenis data double
    void setQuis(double x){
        // Inisiasi atau edit value dari variable quis yang terdapat dalam class.
        this.quis = x;
    }
    // Membuat method dengan parameter x jenis data double
    void setUts(double x){
        // Inisiasi atau edit value dari variable uts yang terdapat dalam class.
        this.uts = x;
    }
    // Membuat method dengan parameter x jenis data double
    void setUas(double x){
        // Inisiasi atau edit value dari variable uas yang terdapat dalam class.
        this.uas = x;
    }

    double getQuis(){
        // Method mengembalikan value dari variable quis
        return this.quis;
    }
    double getUts(){
        // Method mengembalikan value dari variable uts
        return this.uts;
    }
    double getUas(){
        // Method mengembalikan value dari variable uas
        return this.uas;
    }
    double getINA(){
        // Deklarasi nilaiQuis memiliki nilai dari penjumlahan this.quis*(0.20)
        double nilaiQuis = this.quis*(0.20);
        // Deklarasi nilaiUts memiliki nilai dari penjumlahan this.uts*(0.30)
        double nilaiUts = this.uts*(0.30);
        // Deklarasi nilaiUas memiliki nilai dari penjumlahan this.uas*(0.50)
        double nilaiUas = this.uas*(0.50);

        // Method mengembalikan nilai dari penjumalahan tambah dari ketiga variable di atas.
        return (nilaiUas+nilaiUts+nilaiQuis);
    }

    char getIndex(){
        // Deklarasi nilaiAkhir memiliki return value dari method getINA yang terdapat pada class yang sama.
        double nilaiAkhir = this.getINA();

        // Membuat statement condition dengan kriteria yang sudah ditentukan.
        if(nilaiAkhir >= 80) {
            return 'A';
        } else if (nilaiAkhir >= 68){
            return 'B';
        } else if (nilaiAkhir >= 56){
            return 'C';
        } else if (nilaiAkhir >= 45){
            return 'D';
        }
        else {
            return 'E';
        }
    }

    String getKeterangan(){
        // Deklarasi index memiliki return value dari method getIndex yang terdapat pada class yang sama.
        char index = this.getIndex();
        // Deklarasi variable keterangan
        String keterangan;
        // Membuat statement condition dengan kriteria yang sudah ditentukan.
        switch (index){
            case 'A' -> keterangan = "Sangat baik";
            case 'B' -> keterangan = "Baik";
            case 'C' -> keterangan = "Cukup";
            case 'D' -> keterangan = "Kurang";
            default -> keterangan = "Sangat Kurang";
        }

        // Method mengembalikan nilai dari variable keterangan yang sudah diisi berdasarkan condition yang bernilai True
        return  keterangan;
    }

}

class NilaiTester{
    // Deklarasi varibale nilaiTest sebagai sebuah objek dari class Nilai
    Nilai nilaiTest = new Nilai();

    // Membuat constructor dengan 3 parameter yaitu quiz, uts dan uas berjenis data double
    NilaiTester(double quiz, double uts, double uas){
        // Memanggil method-method dalam class Nilai untuk mengisi masing-masing variabel dengan value tergantung parameter
        nilaiTest.setQuis(quiz);
        nilaiTest.setUts(uts);
        nilaiTest.setUas(uas);

        // Print hasil formula penilai dengan terstruktur dan rapi
        System.out.println("========Nilai=======");
        System.out.println("Quis: "+nilaiTest.getQuis());
        System.out.println("UTS : "+nilaiTest.getUts());
        System.out.println("UAS : "+nilaiTest.getUas());
        System.out.println("==Perhitugan Nilai==");
        System.out.println("NA      : "+nilaiTest.getINA());
        System.out.println("Index   : "+nilaiTest.getIndex());
        System.out.println("Predikat: "+nilaiTest.getKeterangan());
    }
}


public class Tugas2_Nilai {

    public static void main(String[] args) {
        // // Deklarasi varibale nil sebagai sebuah objek dari class NilaiTester dengan parameter(quiz: 100, uts: 80, uas: 80)
        var nil = new NilaiTester(100,80,80);

    }

}
