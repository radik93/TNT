package ru.tnt.modulegraph.interfaces.service;

/*
 * Интерфейс для реализациим методов по связыванию секущей комбинации и запорной арматуры
 * @author radik
 * @version 1.0
 */
public interface CombinationService {
    /*
     * Метод для связывания объектов типа класса SecantСombination и ZDV
     * принимает в качестве параметра номер секкущей комбинации и имя задвижки
     * @author radik
     * @version 1.0
     */
    void addCombination(Long secantСombinationNum, String dpName);
}
