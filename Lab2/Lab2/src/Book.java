public class Book {
  private String ISBN;
  private String name;
  private Author author;
  private String publisher;
  private double price;

  public Book(String ISBN, String name, Author author, String publisher, double price) {
    this.ISBN = ISBN;
    this.name = name;
    this.author = author;
    this.publisher = publisher;
    this.price = price;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public Author getAuthor() {
    return author;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Book{" +
        "ISBN='" + ISBN + '\'' +
        ", name='" + name + '\'' +
        ", author=" + author.getName() +
        ", publisher='" + publisher + '\'' +
        ", price=" + price +
        '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Book book = (Book) obj;
    return ISBN.equals(book.ISBN);
  }
}