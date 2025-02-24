public class Film {
    String judul; // Variabel untuk menyimpan judul film
    String genre; // Variabel untuk menyimpan genre film
    String jam; // Variabel untuk menyimpan jam tayang film
    double harga; // Variabel untuk menyimpan harga tiket film

    void setJudul(String myJudul) { // Method untuk mengatur judul film
        judul = myJudul;
    }

    void setGenre(String myGenre) { // Method untuk mengatur genre film
        genre = myGenre;
    }

    void setJam(String myJam) { // Method untuk mengatur jam tayang film
        jam = myJam;
    }

    void setHarga(double myHarga) { // Method untuk mengatur harga tiket film
        harga = myHarga;
    }

    void displayInfo() { // Method untuk menampilkan informasi film
        System.out.println("Judul Film: " + judul);
        System.out.println("Genre Film: " + genre);
        System.out.println("Jam Tayang: " + jam);
        System.out.println("Harga Tiket: " + "Rp. " + harga);
    }
}
