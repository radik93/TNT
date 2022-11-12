package ru.tnt.modulegraph.interfaces.service;

import ru.tnt.modulegraph.models.TU;

/*
 * Интерфейс для реализациим методов по получению статуса технологического участка
 * @author radik
 * @version 1.0
 */
public interface GetStatusTU {
    /*
     * Метод для получения статуса ТУ
     * @return Везвращает объект типа класса TU
     * @author radik
     * @version 1.0
     */
    TU getStatusTU();
}
