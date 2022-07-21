package org.example.src;

import junit.framework.TestCase;
import org.junit.Test;

import static org.example.src.Pessoa.emailValid;

public class TesteEmail extends TestCase {

    @Test
    public static void testar_email_com_arroba() {

        String emailTestado = "email_teste@dominio.com.br";

        assertTrue(emailValid(emailTestado));

    }

    @Test
    public static void testar_email_sem_arroba() {

        String emailTestado = "email_testedominio.com.br";

        assertFalse(emailValid(emailTestado));

    }

    @Test
    public static void testar_email_mais_50_caracteres() {

        String emailTestado = "email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br";

        assertEquals(false, emailValid(emailTestado));

    }
}
