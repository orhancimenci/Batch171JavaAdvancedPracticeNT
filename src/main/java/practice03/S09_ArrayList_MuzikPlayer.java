package practice03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class S09_ArrayList_MuzikPlayer {
    private final ArrayList<String> playlist;

    public S09_ArrayList_MuzikPlayer() {
        playlist = new ArrayList<>();
    }

    public void addSong(String song) {
        playlist.add(song);
        System.out.println(song + " çalma listesine eklendi.");
    }

    public void removeSong(String song) {
        if (playlist.contains(song)) {
            playlist.remove(song);
            System.out.println(song + " çalma listesinden silindi.");
        } else {
            System.out.println(song + " çalma listesinde bulunamadı.");
        }
    }

    public void clearPlaylist() {
        playlist.clear();
        System.out.println("Çalma listesi sıfırlandı.");
    }

    public void sortPlaylist() {
        Collections.sort(playlist);
        System.out.println("Çalma listesi sıralandı.");
    }

    public void printPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Çalma listesi boş.");
        } else {
            System.out.println("Çalma Listesi:");
            for (String song : playlist) {
                System.out.println(song);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        S09_ArrayList_MuzikPlayer musicPlayer = new S09_ArrayList_MuzikPlayer();

        while (true) {
            System.out.println("\nMüzik Çalma Listesi Uygulaması");
            System.out.println("1. Şarkı Ekle");
            System.out.println("2. Şarkı Sil");
            System.out.println("3. Çalma Listesini Sıfırla");
            System.out.println("4. Çalma Listesini Sırala");
            System.out.println("5. Çalma Listesini Göster");
            System.out.println("6. Çıkış");

            System.out.print("Seçiminizi yapın: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Eklemek istediğiniz şarkının adını girin: ");
                    String songToAdd = scanner.nextLine();
                    musicPlayer.addSong(songToAdd);
                    break;
                case 2:
                    System.out.print("Silmek istediğiniz şarkının adını girin: ");
                    String songToRemove = scanner.nextLine();
                    musicPlayer.removeSong(songToRemove);
                    break;
                case 3:
                    musicPlayer.clearPlaylist();
                    break;
                case 4:
                    musicPlayer.sortPlaylist();
                    break;
                case 5:
                    musicPlayer.printPlaylist();
                    break;
                case 6:
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Geçersiz bir seçim yaptınız, tekrar deneyin.");
            }
        }
    }
}