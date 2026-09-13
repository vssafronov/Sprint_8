package praktikum;

public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом praktikum.Account.
             Нужно создать экземпляр класса praktikum.Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        String name = "Тимоти Шаламе";
        Account acc = new Account(name);
        if (acc.checkNameToEmboss()) System.out.println("Имя корректное");
        else System.out.println("Имя некорректное");
    }

}