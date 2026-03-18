class Book
{
    String title;
    String author;
    int price;
    //Parameterized Constructor
    Book(String title, String author, int price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display()
    {
        System.out.println("Title :"+title);
        System.out.println("Author :"+author);
        System.out.println("Price :"+price);
    }
    public static void main(String[] args) {
        Book b1=new Book("1984", "George Orwell" ,15);
        b1.display();
    }
}