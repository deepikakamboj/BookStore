import model.Book;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookTest {

  @Test
  public void createBook(){
    Book book = new Book(1, "one");
    assertThat(book.getId(), is(1));
    assertThat(book.getName(), is("one"));
  }
}
