package ru.vitevskiy.tutorial.MavenDemo;

public class Casino {

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

    @Playble()
    private int poker() {
        int result = (int)(-Math.random()*10000) + (int) (Math.random()*10000);
        if (result > 0) {
            System.out.println("выигрыш " + result);
        } else {
            System.out.println("проигрыш " + result);
        }
        return result;
    }

    @Playble()
    private int roulette () {
        int result = (int)(-Math.random()*10000) + (int) (Math.random()*10000);
        if (result > 0) {
            System.out.println("выигрыш " + result);
        } else {
            System.out.println("проигрыш " + result);
        }
        return result;
    }

    @Playble()
    private int slotMachine () {
        int result = (int)(-Math.random()*10000) + (int) (Math.random()*10000);
        if (result > 0) {
            System.out.println("выигрыш " + result);
        } else {
            System.out.println("проигрыш " + result);
        }
        return result;
    }

    @Playble()
    private int blackJack() {
        int result = (int)(-Math.random()*10000) + (int) (Math.random()*10000);
        if (result > 0) {
            System.out.println("выигрыш " + result);
        } else {
            System.out.println("проигрыш " + result);
        }
        return result;
    }

    @Playble()
    private int wheelOfFortune() {
        int result = (int)(-Math.random()*10000) + (int) (Math.random()*10000);
        if (result > 0) {
            System.out.println("выигрыш " + result);
        } else {
            System.out.println("проигрыш " + result);
        }
        return result;
    }

    @Playble()
    private int baccarat() {
        int result = (int)(-Math.random()*10000) + (int) (Math.random()*10000);
        if (result > 0) {
            System.out.println("выигрыш " + result);
        } else {
            System.out.println("проигрыш " + result);
        }
        return result;
    }


}
