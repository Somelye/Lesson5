
//Задача №1
//Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
//останавливаться, включать фары. У жигули есть особенность: она ломается. У Toyota особенность: включает музыку
//Необходимо:
// 1.Создать абстрактный класс, который будет описывать общие действия этих машин (методы будут не абстрактные)
// 2.Создать два класса, которые будут наследоваться от абстрактного класса, и реализовывать особенности этих машин
// Методы должны просто печатать на экран действия машин (начал движение, включил музыку и тд.)

public class HomeWork1_1 {
        
    public static void main(String[] args) {
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
    }
}
