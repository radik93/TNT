package ru.tnt.modulegraph.interfaces.service;

import ru.tnt.modulegraph.models.SecantСombination;

/*
 * Интерфейс для реализациим методов по созданию объектов типа SecantСombination
 * @author radik
 * @version 1.0
 */
public interface SecantСombinationService {
   /*
    * Метод для создания или получения объекта типа
    * SecantСombination по номеру id
    * @return Везвращает объект типа класса SecantСombination
    * @author radik
    * @version 1.0
    */
   SecantСombination getSecantCombination(long secantСombinationNum);
}
