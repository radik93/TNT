package ru.tnt.modulegraph.interfaces.service;

import ru.tnt.modulegraph.models.SecantСombination;

/*
 * Интерфейс для реализациим методов по расчету статуса секущей комбинации
 * @author radik
 * @version 1.0
 */
public interface CalcStatusSecantСombination {
    /*
     * Метод для расчета и установки статуса секущей комбинации
     * принимает в качестве входного параметра объект типа класса
     * SecantСombination без расчета статуса
     * @return Везвращает объект типа класса SecantСombination
     * @author radik
     * @version 1.0
     */
    SecantСombination setStatusSecantСombination(SecantСombination secantСombination);
}
