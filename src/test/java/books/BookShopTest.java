package books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import books.BookShop;

/**
 * TODO : Add your import here
 */

public class BookShopTest {

    @Test
    public void costTest(){
        int[] books= {1,2,1,3,1};
        double expectedCost=5*8*0.35 + 3*8;
        double cost= new BookShop("TestShop").cost(books);
        assertTrue(cost==expectedCost);
    }
}