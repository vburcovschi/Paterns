package AbstractFactory;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        UIFactory lightFactory = new LightUIFactory();
        Button lightButton = lightFactory.createButton();
        TextField lightTextField = lightFactory.createTextField();

        lightButton.display(); // Вывод: отображение светлой кнопки
        lightTextField.display(); // Вывод: отображение светлого текстового поля

        // Выбор темной темы
        UIFactory darkFactory = new DarkUIFactory();
        Button darkButton = darkFactory.createButton();
        TextField darkTextField = darkFactory.createTextField();

        darkButton.display(); // Вывод: отображение темной кнопки
        darkTextField.display(); // Вывод: отображение темного текстового поля
    }
}
