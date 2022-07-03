import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Feature("Авторизация")
@Owner("allure8")
public class AuthTest {

// проверить чтобы работало в аллюр и запускалось в ДЖ
    @Test
    @AllureId("10845")
    @DisplayName("Авторизация через яндекс для Автоматизации")
    @Tags({@Tag("blocker"), @Tag("web tests")})

    public void testGoogleAuth () {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через Яндекс");
        step("Авторизуемся как пользователь 'Mrs.Random'", () -> {
            step("Вводим логин 'random-user'");
            step("Вводим пароль 'random-123' ");
            step("Нажимаем кнопку Войти");
        });
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из Яндекс", () -> {
            step("Имя 'Mrs.Random'");
            step("Логин 'random-user'");
            step("Пароль '123'");
            step("аватар");
        });
        step("");
        step("Разлогиниваемся");
    }
}
