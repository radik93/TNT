package ru.tnt.modulegraph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tnt.modulegraph.interfaces.grud.SecantCombinationRepositoris;
import ru.tnt.modulegraph.interfaces.grud.ZDVRepositoris;
import ru.tnt.modulegraph.interfaces.service.CalcStatusSecantСombination;
import ru.tnt.modulegraph.interfaces.service.CalcStatusZDV;
import ru.tnt.modulegraph.models.SecantСombination;
import ru.tnt.modulegraph.models.ZDV;
import ru.tnt.modulegraph.utilities.StatusMaker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CalcStatusSecantСombinationImpl implements CalcStatusSecantСombination {

    @Autowired
    SecantCombinationRepositoris secantCombinationRepositoris;

    @Autowired
    CalcStatusZDV calcStatusZDV;

    @Autowired
    ZDVRepositoris zdvRepositoris;

    @Override
    public SecantСombination setStatusSecantСombination(SecantСombination secantСombination) {

        secantСombination.setStatusSecantСombination(calcStatus(secantСombination));

        secantCombinationRepositoris.save(secantСombination);

        return secantСombination;
    }

    private int calcStatus(SecantСombination secantСombination) {
        List<Integer> status = new ArrayList<>();

        Iterator<ZDV> iterable = secantСombination.getZdvs().iterator();

        ZDV zdv;
        while (iterable.hasNext()){
            zdv = iterable.next();
            zdv = calcStatusZDV.setStatusZDV(zdv);
            zdvRepositoris.save(zdv);
            status=fillInArrau(status,zdv.getStatus());
        }
        return getStatus(status);
    }

    private List<Integer> fillInArrau(List<Integer> status, int newStatus)
    {
      status.add(newStatus);

      return status;
    }

    private int getStatus(List<Integer> status) {

        return StatusMaker.getStatusSC(status);
    }
}
