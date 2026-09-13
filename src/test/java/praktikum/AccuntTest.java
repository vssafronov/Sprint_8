package praktikum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccuntTest {

    @ParameterizedTest(name = "Проверка корректности имени {0}")
    @ValueSource(strings = {"Тимоти Шаламе","Т Ш","Трпоадвгетаикцокш Т"})
    public void checkNameToEmbossPositiveTest(String name) {
        Account account = new Account(name);
        assertTrue(account.checkNameToEmboss(), "Имя некорректное");
    }

    @ParameterizedTest(name = "Проверка корректности имени {0}")
    @ValueSource(strings = {"ТимотиШаламе","ТШ","Трпоадвгетаикцокш Тj"," ТимотиШаламе", "ТимотиШаламе ", "Тимоти Шала ме"})
    public void checkNameToEmbossNegativeTest(String name) {
        Account account = new Account(name);
        assertFalse(account.checkNameToEmboss(), "Это имя не должно быть корректным");
    }
}
