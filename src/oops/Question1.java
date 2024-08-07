package oops;

public class Question1 {
    public static void main(String[] args) {
        //Create a class Book with the following attributes:
        // title, author, and price. Write a constructor to
        // initialize these attributes.
        // Also, write a method displayInfo() to print the details of the book.
        Book book = new Book("qwerty", "Mayur", 199.99);
        System.out.println(book.toString());

    }
}
    class Book{
        String title;
        String author;
        double price;

          Book(String title, String Author, double price){
            this.title = title;
            this.author = author;
            this.price = price;


        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", price=" + price +
                    '}';
        }
    }




