import java.util.*;

public class Phonebook {

    private HashMap<String, ArrayList<Person>> phonebook = new HashMap<>(); // создание коллекции из имени и коллекции данных.

    public void add(String name, Integer phone, String mail){ // метод заполнения основной коллекции
        if (phonebook.containsKey(name)) {                   // проверка совпадения имени
            ArrayList<Person> personData = phonebook.get(name);  // обращение к существующей коллекции для данного имени
            personData.add(new Person(phone, mail)); //добавление в коллекцию данных с использованием аннонимного объекта
        }else {
            ArrayList<Person> personsData = new ArrayList<>(); // создание коллекции типа класса Person
            personsData.add(new Person(phone, mail));  // добавление в коллекцию данных
            phonebook.put(name, personsData); // добавление в общую коллекцию имени и его данные
        }
    }
    public ArrayList<Integer> getPhones(String name){ //метод для получения телефонных номеров
        ArrayList<Person> personsData = phonebook.get(name); // обращение к существующей коллекции для данного имени
        ArrayList<Integer> phones = new ArrayList<>(); // создание коллекции телефонов под конкретное имя для вывода
        for (int i = 0; i < personsData.size(); i++) {  // заполнение коллекции телефонов номерами(переменными phone конструктора Person)
            phones.add(personsData.get(i).phone);
        }
        return phones;
    }

    public ArrayList<String> getMails(String name){ //метод для получения mail
        ArrayList<Person> personsData = phonebook.get(name); // обращение к существующей коллекции для данного имени
        ArrayList<String> mails = new ArrayList<>(); // создание коллекции mails под конкретное имя для вывода
        for (int i = 0; i < personsData.size(); i++) {  // заполнение коллекции mails(переменными mail конструктора Person)
            mails.add(personsData.get(i).mail);
        }
        return mails;
    }

}
