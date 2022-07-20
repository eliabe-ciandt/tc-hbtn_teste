public class TesteEmail {

    public static boolean testar_email_com_arroba() {

        String emailTestado = "email_teste@dominio.com.br";

        return (Pessoa.emailValid(emailTestado) == true);

    }

    public static boolean testar_email_sem_arroba() {

        String emailTestado = "email_testedominio.com.br";

        return (Pessoa.emailValid(emailTestado) == false);

    }

    public static boolean testar_email_mais_50_caracteres() {

        String emailTestado = "email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br";

        return (Pessoa.emailValid(emailTestado) == false);

    }
}
