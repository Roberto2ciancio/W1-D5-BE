import java.util.Scanner;

public class LettoreMultimediale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        // Creazione dei 5 elementi
        for (int i = 0; i < 5; i++) {
            System.out.println("Elemento " + (i + 1) + ": scegliere tipo (1=Immagine, 2=Audio, 3=Video):");
            int tipo = scanner.nextInt();
            scanner.nextLine(); // Consuma newline

            System.out.print("Titolo: ");
            String titolo = scanner.nextLine();

            switch (tipo) {
                case 1:
                    System.out.print("Luminosità: ");
                    int lum = scanner.nextInt();
                    elementi[i] = new Immagine(titolo, lum);
                    break;
                case 2:
                    System.out.print("Durata: ");
                    int durataA = scanner.nextInt();
                    System.out.print("Volume: ");
                    int volumeA = scanner.nextInt();
                    elementi[i] = new RegistrazioneAudio(titolo, durataA, volumeA);
                    break;
                case 3:
                    System.out.print("Durata: ");
                    int durataV = scanner.nextInt();
                    System.out.print("Volume: ");
                    int volumeV = scanner.nextInt();
                    System.out.print("Luminosità: ");
                    int lumV = scanner.nextInt();
                    elementi[i] = new Video(titolo, durataV, volumeV, lumV);
                    break;
                default:
                    System.out.println("Tipo non valido. Riprova.");
                    i--;
            }
        }

        // Esecuzione ciclica
        int scelta;
        do {
            System.out.println("Scegli un elemento da eseguire (1-5) o 0 per uscire:");
            scelta = scanner.nextInt();
            if (scelta >= 1 && scelta <= 5) {
                elementi[scelta - 1].esegui();
            } else if (scelta != 0) {
                System.out.println("Scelta non valida.");
            }
        } while (scelta != 0);

        scanner.close();
        System.out.println("Uscita dal lettore multimediale.");
    }
}
