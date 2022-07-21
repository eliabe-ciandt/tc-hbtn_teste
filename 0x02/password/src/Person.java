import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

    private String nome;
    private String senha;

    public Person(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public boolean checkUser() {

        Pattern pattern = Pattern.compile(
                "[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher match = pattern.matcher(getNome());
        boolean contemCaractereEspecial = match.find();

        if(nome.length() < 8) return false;
        return (!contemCaractereEspecial);

    }

    public boolean checkPassword() {

        Pattern pattern = Pattern.compile(
                "[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher match = pattern.matcher(getSenha());
        boolean contemCaractereEspecial = match.find();

        Pattern patternCaractere = Pattern.compile(
                "[A-Z]");
        Matcher matchCaractere = patternCaractere.matcher(getSenha());
        boolean contemCaractereMaiusculo = matchCaractere.find();

        Pattern patternNumero = Pattern.compile(
                "([0-9])");
        Matcher matchNumero = patternNumero.matcher(getSenha());
        boolean contemNumero = matchNumero.find();

        if(senha.length() < 8) return false;
        if(!contemCaractereMaiusculo) return false;
        if(!contemCaractereEspecial) return false;

        return contemNumero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}