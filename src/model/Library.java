package model;
public class Library {
    private  int id;
    private String name;
    private String author;
    private String genre;
    private int pageCount;
    private String language;
    private int price;
    private int count;
    private byte stockStatus;

    public Library(int id,String name, String author, String genre, int pageCount, String language, int price, int count, byte stockStatus) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.pageCount = pageCount;
        this.language = language;
        this.price = price;
        this.count = count;
        this.stockStatus = stockStatus;
    }

    public String getName() {
        return name;
    }

    public Library setName(String name) {
        this.name = name;
        return null;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public byte getStockStatus() {
        return stockStatus;
    }

    public int getId() {
        return id;
    }



    public void setStockStatus(byte stockStatus) {
        this.stockStatus = stockStatus;
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nAuthor: " + getAuthor() +
                "\nGenre: " + getGenre() +
                "\nPageCount: " + getPageCount() +
                "\nLanguage: " + getLanguage() +
                "\nPrice: " + getPrice() +
                "\nCount: " + getCount() + "\n";
    }

    public  String info(){
        return "name: " + name +
                "\nauthor: " + author +
                "\ngenre: " + genre +
                "\nlanguage: " +language + "\n";
    }

}
