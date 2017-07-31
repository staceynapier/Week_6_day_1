public class Library{
  private String name;
  private Book[] stock;
  private Person[] people;

  public Library(String name){
    this.name = name;
    this.stock = new Book[10];
    this.people = new Person[10];
  }

  public String getName(){
    return this.name;
  }

  public void setName(String newName){
    this.name = newName;
  }

  public int stockCount(){
    int count = 0;
    for (Book books : this.stock){
      if (books != null) {
        count++;
      }
    }
    return count;
  }

  public void add(Book books){
    if (libraryIsFull()) {
      return;
    }
    int stockCount = stockCount();
    stock[stockCount] = books;
  }

  public boolean libraryIsFull() {
    return stockCount() == stock.length;
  }

  public void borrowed(){
    for(int bks = 0; bks < stock.length; bks++) {
      stock[bks] = null;
    }
  }

  public int peopleCount(){
    int count = 0;
    for (Person people : this.people) {
      if (people != null) {
        count++;
      }
    }
    return count;
  }

//   public String borrowBook(Person persons){
//     if (library.stockCount == 0){
//       return "No books left to borrow";
//     }
//     else {
//       int peopleCount = peopleCount();
//       people[peopleCount] = persons;
//       return "Book borrowed";
//     }
//   }
}