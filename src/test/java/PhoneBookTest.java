import org.junit.Test;
import org.example.PhoneBook;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    private Map<String, String> map;

    @Test
    public void testAdd(){
        map = new HashMap<>();
        map.put("555", "Катя");
        PhoneBook book = new PhoneBook(map);
        int exp = book.add();
        int act = 1;
        assertEquals(exp, act);
    }
}
