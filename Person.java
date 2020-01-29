public class Person {
    public String name;
    public Integer phone;
    public String mail;

    public Person(String name, Integer phone, String mail){
        this.name = name;
        this.phone = phone;
        this.mail = mail;
    }

    public Person(Integer phone, String mail){
        this.phone = phone;
        this.mail = mail;
    }

}
