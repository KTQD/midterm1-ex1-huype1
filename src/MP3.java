public class MP3 extends Item{
    public float duration;

    public MP3(String name, String description, String ID, float price, float duration) {
        super(name, description, ID, price);
        this.duration = duration;
    }


    public void showInfo() {
        System.out.println("This is a sound data type name: " + name + " Description: " + getDescription() + " Duration: " + duration);
    }
}
