package ru.netology;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте! Введите первое число - это будет размер списка");
        int listNumb = Integer.parseInt(scanner.nextLine());

        if (listNumb != 0) {
            System.out.println("Спасибо! Теперь введите второе число - это будет верхняя граница значений элементов в списке");
        }
        int maxValue = Integer.parseInt(scanner.nextLine());
        logger.log("Создаем и наполняем список");

        Random random = new Random();
        ArrayList list = new ArrayList<>();
        while (list.size() < listNumb) {
            int i = random.nextInt(maxValue);
            list.add(i);
        }
        System.out.println("Вот случайный список: " + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int filterNumb = Integer.parseInt(scanner.nextLine());
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(filterNumb);
        System.out.println("Отфильтрованный список: " + filter.filterOut(list));
        logger.log("Завершаем программу");
    }

}