public class Tiket {
    int nomorTiket; // Variabel untuk menyimpan nomor tiket
    Film film; // Objek Film yang ditonton
    Studio studio; // Objek Studio tempat pemutaran film
    int nomorKursi; // Variabel untuk menyimpan nomor kursi
    Penonton penonton; // Objek Penonton yang memesan tiket

    void setNomorTiket(int myNomorTiket) { // Method untuk mengatur nomor tiket
        nomorTiket = myNomorTiket;
    }

    void setFilm(Film myFilm) { // Method untuk mengatur film yang ditonton
        film = myFilm;
    }

    void setStudio(Studio myStudio) { // Method untuk mengatur studio pemutaran film
        studio = myStudio;
    }

    void setNomorKursi(int myNomorKursi) { // Method untuk mengatur nomor kursi
        nomorKursi = myNomorKursi;
    }

    void setPenonton(Penonton myPenonton) { // Method untuk mengatur penonton
        penonton = myPenonton;
    }

    void displayInfo() { // Method untuk menampilkan informasi tiket
        System.out.println("Nomor Tiket: " + nomorTiket);
        System.out.println("Nomor Kursi: " + nomorKursi);
        System.out.println("Nama Penonton: " + penonton.nama);
        studio.displayInfo();
    }
}
