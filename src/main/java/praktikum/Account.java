package praktikum;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if (name.length() < 3) return false;
        if (name.length() > 19) return false;
        if (spaceCounts(name) != 1) return false;
        if (isSpaceFirst(name)) return false;
        if (isSpaceLast(name)) return false;
        else return true;
    }

    private int spaceCounts(String name) {
        int count = 0;
        char[] chars = name.toCharArray();
        for (char aChar : chars) {
            if (aChar == ' ') count++;
        }
        return count;
    }

    private boolean isSpaceFirst(String name) {
        return name.toCharArray()[0] == ' ';
    }

    private boolean isSpaceLast(String name) {
        return name.toCharArray()[name.length() - 1] == ' ';
    }

}
