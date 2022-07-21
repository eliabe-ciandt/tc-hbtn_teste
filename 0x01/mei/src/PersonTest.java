import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest{

    Person paul;


    @BeforeEach
    public void setup() {
        paul = new Person("Paul", "McCartney", new Date(2000), true, true, true);
    }

    @Test
    public void show_full_name() {
        assertEquals("Paul McCartney", paul.fullName());
    }

    @Test
    public void test_calculateYearlySalary() {
        paul.setSalary(1200);

        assertEquals(14400f, paul.calculateYearlySalary());
    }

    @Test
    public void person_is_MEI() {
        paul.setSalary(1200);
        paul.setPensioner(false);
        paul.setAnotherCompanyOwner(false);
        paul.setPublicServer(false);

        assertTrue(paul.isMEI());
    }

    @Test
    public void person_is_not_MEI() {
        assertFalse(paul.isMEI());
    }

}
