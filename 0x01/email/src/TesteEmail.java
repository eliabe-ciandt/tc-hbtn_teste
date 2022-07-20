import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteEmail {

    @Test
    public static void testar_email_com_arroba() {

        String emailTestado = "email_teste@dominio.com.br";

        assertEquals(src.Pessoa.emailValid(emailTestado), true);

    }

    @Test
    public static void testar_email_sem_arroba() {

        String emailTestado = "email_testedominio.com.br";

        assertEquals(src.Pessoa.emailValid(emailTestado), false);

    }

    @Test
    public static void testar_email_mais_50_caracteres() {

        String emailTestado = "email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br";

        assertEquals(false, src.Pessoa.emailValid(emailTestado));

    }
}
