
//Задача №1
//Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
//останавливаться, включать фары. У жигули есть особенность: она ломается. У Toyota особенность: включает музыку
//Необходимо:
// 1.Создать абстрактный класс, который будет описывать общие действия этих машин (методы будут не абстрактные)
// 2.Создать два класса, которые будут наследоваться от абстрактного класса, и реализовывать особенности этих машин
// Методы должны просто печатать на экран действия машин (начал движение, включил музыку и тд.)

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HomeWork1_1 {

    public static void main(String[] args) throws IOException {
        Toyota toyota = new Toyota();
        Jiguli jiguli = new Jiguli();
        toyota.turnMusic();
        toyota.start();
        toyota.stop();
        toyota.turnLights();
        jiguli.crash();
        jiguli.start();
        jiguli.stop();
        jiguli.turnLights();

//Задача №2
// Необходимо:
// 1. Создать папку resource, пометить ее как папку Resourсe root.
// 2. Создать в ней файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
// 3. Прочитать файл, и вывести на экран все слова файла в одну строку
// Ожидаемый результат: "Моя бабушка читает газету жизнь"

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Study\\Java\\repos\\HomeWork3\\resource\\my_first_file.txt"));
        String result = "";
        while (reader.ready()) {
            result += reader.readLine() + " ";
        }
            System.out.println(result);
    }
}
