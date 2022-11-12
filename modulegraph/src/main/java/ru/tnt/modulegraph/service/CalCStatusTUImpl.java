package ru.tnt.modulegraph.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tnt.modulegraph.interfaces.grud.SecantCombinationRepositoris;
import ru.tnt.modulegraph.interfaces.service.CalCStatusTU;
import ru.tnt.modulegraph.models.SecantСombination;
import ru.tnt.modulegraph.models.TU;
import ru.tnt.modulegraph.utilities.StatusMaker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CalCStatusTUImpl implements CalCStatusTU {

    @Autowired
    SecantCombinationRepositoris secantCombinationRepositoris;

    TU tu;

    List<SecantСombination> secantСombinationList;

    int status;

    @Override
    public TU calcStatusTU() {

        secantСombinationList = getSecantCombination();

        status =  calcStatus(secantСombinationList);

        tu = new TU(status,secantСombinationList);
        return tu;
    }

    private List<SecantСombination> getSecantCombination(){
        return (List<SecantСombination>) secantCombinationRepositoris.findAll();
    }

    private int calcStatus(List<SecantСombination> secantСombinationList) {
        List<Integer> status = new ArrayList<>();

        Iterator<SecantСombination> iterable = secantСombinationList.iterator();

        while (iterable.hasNext()){
            status=fillInArrau(status,iterable.next().getStatusSecantСombination());
        }
        return getStatus(status);
    }

    private List<Integer> fillInArrau(List<Integer> status, int newStatus)
    {
        status.add(newStatus);

        return status;
    }

    private int getStatus(List<Integer> status) {
        return StatusMaker.getStatusZDV(status);
    }
}
