public abstract class Item {
    public String name;

    public java.lang.String getDescription() {
        return description;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private String description;
    protected String ID;
    float price;

    public Item(java.lang.String name, java.lang.String description, java.lang.String ID, float price) {
        this.name = name;
        this.description = description;
        this.ID = ID;
        this.price = price;
    }

    abstract void showInfo();

}
