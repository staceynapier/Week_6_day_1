import static org.junit.Assert.assertEquals;
import org.junit.*;

public class LibraryTest{

  Library library;
  Book book;
  Person person;

  @Before
  public void before(){
    library = new Library("Castle St");
    book = new Book();
    person = new Person();
  }

  @Test
  public void libraryHasName(){
    assertEquals("Castle St", library.getName());
  }

  @Test
  public void thereIsNoStockInitially(){
    assertEquals( 0, library.stockCount() );
  }

  @Test
  public void canAddStock(){
    library.add(book);
    assertEquals(1, library.stockCount());
  }

  @Test
  public void isLibraryFull(){
    for (int stock = 0; stock < 10; stock++){
      library.add(book);
    }
    assertEquals(10, library.stockCount() );
  }

  @Test
  public void booksAllBorrowed(){
    library.add(book);
    library.borrowed();
    assertEquals(0, library.stockCount() );
  }

  @Test
  public void peopleStartsEmpty(){
    assertEquals(0, library.peopleCount() );
  }

  // @Test
  // public void personCanBorrowBook(){
  //   assertEquals("Book borrowed", library.borrowBook(person) );
  // }


}