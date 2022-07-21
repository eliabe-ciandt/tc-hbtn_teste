import junit.framework.TestCase;
import org.junit.Test;


public class TesteEmail extends TestCase {

    @Test
    public static void testar_email_com_arroba() {

        String emailTestado = "email_teste@dominio.com.br";

        assertTrue(Pessoa.emailValid(emailTestado));

    }

    @Test
    public static void testar_email_sem_arroba() {

        String emailTestado = "email_testedominio.com.br";

        assertFalse(Pessoa.emailValid(emailTestado));

    }

    @Test
    public static void testar_email_mais_50_caracteres() {

        String emailTestado = "email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br";

        assertEquals(false, emailValid(emailTestado));

    }
}
