import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Person {
    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;

    public Person(String name, String surname, Date birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;
    }

    public String fullName(){
        return name + ' ' + surname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float calculateYearlySalary() {
        return getSalary() * 12;
    }

    private int calculaIdade() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY");
        Date agora = new Date();

        int anoNascimento = Integer.parseInt(simpleDateFormat.format(this.birthDate));
        int tempoAgora = Integer.parseInt(simpleDateFormat.format(agora));

        return tempoAgora - anoNascimento;
    }



    public boolean isMEI() {

        if(calculaIdade() < 18) return false;
        if(isPensioner()) return false;
        if(isAnotherCompanyOwner()) return false;
        if(isPublicServer()) return false;

        return (calculateYearlySalary() < 130000);
    }

    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public boolean isPensioner() {
        return pensioner;
    }

    public boolean isPublicServer() {
        return publicServer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }
}

