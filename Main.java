package DZ;


import java.util.*;
public class Main {


//     1. Создать массив с набором слов (20-30 слов, должны встречаться повторяющиеся):
//            - Найти список слов, из которых состоит текст (дубликаты не считать);
//  - Посчитать сколько раз встречается каждое слово (использовать HashMap);
// 2. Написать простой класс PhoneBook(внутри использовать HashMap):
//            - В качестве ключа использовать фамилию
//  - В каждой записи всего два поля: phone, e-mail
//  - Отдельный метод для поиска номера телефона по фамилии (ввели фамилию, получили ArrayList телефонов),
//  и отдельный метод для поиска e-mail по фамилии.
//  Следует учесть, что под одной фамилией может быть несколько записей.
//  Итого должно получиться 3 класса Main, PhoneBook, Person.
//


    public static void main(String[] args) {
        String [] arrS = new String[]{"Winter", "Spring", "Plum","Summer", "Melon", "Autumn", "Apple", "Pear", "Fig", "Lion", "Plum", "Melon", "Fig", "Orange", "Autumn", "Mango", "Banana", "Plum", "Peach", "February", "May"};

        HashSet<String> hashS = new HashSet<>(Arrays.asList(arrS));
        System.out.println(hashS);

        HashMap<String, Integer> hashM = new HashMap<>();
        for (int i = 0; i < arrS.length ; i++) {
            if (hashM.containsKey(arrS[i])) {
                int k = hashM.get(arrS[i]);
                hashM.put(arrS[i], k+1);
            }else {
                hashM.put(arrS[i], 1);
            }
        }
        System.out.println(hashM); //значение будет указывать, сколько есть копий слова.

    }
}
class PhoneBook {
    public Integer getNumber(String name) {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.get(name);
    }


    HashMap <String, Integer> phoneB = new HashMap<>();

}
}
