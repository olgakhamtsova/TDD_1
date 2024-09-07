import org.example.PhoneBook;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    private Map<String, String> map;

    @Test
    public void testAdd() {
        map = new HashMap<>();
        map.put("55555555555", "Катя");
        PhoneBook book = new PhoneBook(map);
        int exp = book.add();
        int act = 1;
        assertEquals(exp, act);
    }
    @Test
    public void testFindByNumber() {
        map = new HashMap<>();
        map.put("55555555555", "Катя");
        PhoneBook book = new PhoneBook(map);
        String exp = book.findByNumber();
        String act = "Катя";
        assertEquals(exp, act);
    }
}
