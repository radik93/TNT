package ru.tnt.modulegraph.interfaces.service;

import ru.tnt.modulegraph.models.ZDV;

/*
 * Интерфейс для реализациим методов по созданию и изменеию объектов типа ZDV
 * @author radik
 * @version 1.0
 */
public interface ZDVService {

   /*
    * Метод для добавления новой задвижки
    * принимает в качетве параметра имя задвижки DPE
    * @return Везвращает объект типа класса ZDV
    * @author radik
    * @version 1.0
    */
   ZDV addZDV(String dpName);

   /*
    * Метод для сохранения измененной задвижки
    * принимает в качетве параметра объект типа класса ZDV
    * @return Везвращает объект типа класса ZDV
    * @author radik
    * @version 1.0
    */
   ZDV saveZDV(ZDV zdv);
}
