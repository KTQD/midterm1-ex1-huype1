
public class Main {
    public static void main(String[] args) {
        Item mp3 = new MP3("CarSound", "ASMR", "1CRS", (float) 3.5, (float) 2.1);
        Item book = new Book("Can't Hurt Me: Master Your Mind and Defy the Odds", "", "BSMT321", (float) 10.5, "David Goggin", 364, "Motivation" );
        mp3.showInfo();
        book.showInfo();

        System.out.println("Change the description on book");
        book.setDescription("Best selling book 2 years in a row");
    }
}
