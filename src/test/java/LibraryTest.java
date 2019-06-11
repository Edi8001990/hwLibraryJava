import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;


    @Before
    public void before(){
        library = new Library(5);

    }

    @Test
    public void checkIfLibraryHasCapacity(){
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void getCountedNumberOfBooks(){
        assertEquals(0, library.getCountedBooks());
    }

    @Test
    public void checkIfBookCanBeAdded(){
        library.addBook(book);
        assertEquals(1, library.getCountedBooks());
    }
}
