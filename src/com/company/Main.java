//Задание на дом:
//        - Объявить переменную типа String, название которой состоит из нескольких слов
//        - Создать константу “num” типа int и задать ей любое значение
//        - Создать переменную “word” типа String с любым значением
//        - Задать значение переменной объявленной в самом начале, которое состояло бы
//        из результата конкатенации константы “num” и переменной “word”.
//        - Вывести на экран значение всех переменных в одну строку
//        - Добавить условную конструкцию которая бы выводила на экран следующее: если
//        значение константы “num” меньше нуля - “Вы сохранили отрицательное число”, если же значение больше нуля - “Вы сохранили положительное число”, иначе - “Вы сохранили нуль”
//        ДЗ на сообразительность:
//        - Сделать так, чтобы программа выводила в консоль строку “Введите ваше имя:”
//        - Затем считывала имя пользователя, введенное с клавиатур

package com.company;
public class Main {
        public static void main(String[] args)
        {

//        1.
                String oneTwoThree;
//        2.
                int num=-34455;
//        3.
                String word="ABCDE 12345";
//        4.
                String happy = num +" " + word;
//        5.
                System.out.println(happy);

//6.
        if (num < 0){
System.out.println("вы сохранили отрицательное число");
}
else if (num > 0){
System.out.println("Вы сохранили положительное число");
}
else {
System.out.println("Вы сохранили нуль");
}
//7.

String name = "Musaev Zhoomart";
System.out.println("Введите ваше имя: " + name);












}
}