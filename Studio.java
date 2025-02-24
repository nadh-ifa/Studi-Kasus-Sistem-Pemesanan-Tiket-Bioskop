public class Studio {
    int nomorStudio; // Variabel untuk nomor studio
    int kapasitas; // Variabel untuk kapasitas studio
    Film film; // Objek Film yang akan ditayangkan di studio

    void setNomorStudio(int myNomorStudio) { // Method untuk mengatur nomor studio
        nomorStudio = myNomorStudio;
    }

    void setKapasitas(int myKapasitas) { // Method untuk mengatur kapasitas studio
        kapasitas = myKapasitas;
    }

    void setFilm(Film myFilm) { // Method untuk mengatur film yang ditayangkan
        film = myFilm;
    }

    void displayInfo() { // Method untuk menampilkan informasi studio
        System.out.println("Nomor Studio: " + nomorStudio);
        System.out.println("Kapasitas Kursi: " + kapasitas);
        film.displayInfo();
    }
}
