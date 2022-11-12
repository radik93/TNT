package ru.tnt.modulegraph.utilities;

import java.util.HashMap;
import java.util.List;

public class StatusMaker {

    public static String getВescription(int id){
        switch (id){
            case (-1):
                return "Авария определения положения";
            case (1):
                return "Открыта";
            case (2):
                return "Закрывается";
            case (3):
                return "Закрыта";
            case (4):
                return "Открывается";
            case (5):
                return "В промежутке";
            default:
                return "Неопределенное состояние";
        }
    }
    public static <T> int getStatusZDV(List<T> status) {

        if(status.contains(-1))
            return -1;
        if(status.contains(2))
            return 2;
        if(status.contains(1))
            return 1;
        if(status.contains(4))
            return 4;
        if(status.contains(5))
            return 5;
        if(status.contains(3))
            return 3;

        return 0;
    }

    public static <T> int getStatusSC(List<T> status) {

        if(status.contains(3))
            return 3;
        if(status.contains(-1))
            return -1;
        if(status.contains(2))
            return 2;
        if(status.contains(1))
            return 1;
        if(status.contains(4))
            return 4;
        if(status.contains(5))
            return 5;

        return 0;
    }
}
