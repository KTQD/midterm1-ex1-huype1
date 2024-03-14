public class Book extends Item{
    public String author;
    public int numberOfPages;
    public String genre;

    Book(String name, String description, String ID, float price, String author, int numberOfPages, String genre) {
        super(name, description, ID, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }


    @Override
    void showInfo() {
        System.out.println("name " + name + " author " + author + " genre " + genre);
    }
}
