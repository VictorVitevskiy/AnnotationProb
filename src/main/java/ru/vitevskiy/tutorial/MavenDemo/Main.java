package ru.vitevskiy.tutorial.MavenDemo;

import org.openqa.selenium.WebDriver;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    /**
     * Задача 1. Лас-вегас
     *
     * Разработать класс казино. В казино должна быть реализована возможность (в виде методов) сыграть в:
     * 1) покер
     * 2) рулетку
     * 3) игровой автомат (однорукий бандит)
     * 4) блекджек
     * 5) колесо фортуны
     * 6) баккара
     *
     * Каждый из методов выводит в консоль результат игры и возвращает значение типа int - выигрыш или проигрыш, генерируемый случайным образом.
     *
     * Задача - вызвать только те методы игр, которые будут помечены создаваемой нами аннотацией.
     */

    public static void main(String[] args) {

        Casino casino = new Casino();

        Method[] methods = casino.getClass().getDeclaredMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof Playble) {
                    try {
                        method.invoke(casino);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
