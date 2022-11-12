package ru.tnt.modulegraph.interfaces.service;
import ru.tnt.modulegraph.models.TU;

/*
 * Интерфейс для реализациим методов по расчету статуса ТУ
 * @author radik
 * @version 1.0
 */
public interface CalCStatusTU {
    /*
     * Метод для расчета статуса технологического участка
     * @return Везвращает объект типа класса TU
     * @author radik
     * @version 1.0
     */
    TU calcStatusTU();
}
