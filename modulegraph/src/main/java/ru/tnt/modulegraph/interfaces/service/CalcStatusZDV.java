package ru.tnt.modulegraph.interfaces.service;

import ru.tnt.modulegraph.models.ZDV;

/*
 * Интерфейс для реализациим методов по расчету статуса Запорной арматуры
 * @author radik
 * @version 1.0
 */
public interface CalcStatusZDV {
    /*
     * Метод для расчета статуса Запорной арматуры
     * принимает в качестве параметра объект типа класса ZDV
     * @return Везвращает объект типа класса ZDV
     * @author radik
     * @version 1.0
     */
    ZDV setStatusZDV(ZDV zdv);
}
