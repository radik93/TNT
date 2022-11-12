package ru.tnt.modulegraph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tnt.modulegraph.interfaces.grud.SecantCombinationRepositoris;
import ru.tnt.modulegraph.interfaces.service.CalCStatusTU;
import ru.tnt.modulegraph.interfaces.service.CalcStatusSecantСombination;
import ru.tnt.modulegraph.interfaces.service.GetStatusTU;
import ru.tnt.modulegraph.models.SecantСombination;
import ru.tnt.modulegraph.models.TU;

import java.util.List;

@Service
public class GetStatusTUImpl implements GetStatusTU {

    @Autowired
    CalcStatusSecantСombination calcStatusSecantСombination;

    @Autowired
    SecantCombinationRepositoris secantCombinationRepositoris;

    @Autowired
    CalCStatusTU calCStatusTU;

    List<SecantСombination> secantСombinationList;

    @Override
    public TU getStatusTU() {
        calcAllsecantCombination(getSecantСombinationList());
        return calCStatusTU.calcStatusTU();
    }

    private void calcAllsecantCombination(List<SecantСombination> secantСombinationList){
        for (SecantСombination secantСombination : secantСombinationList)
        calcStatusSecantСombination.setStatusSecantСombination(secantСombination);
    }

    private List<SecantСombination> getSecantСombinationList()
    {
        return (List<SecantСombination>) secantCombinationRepositoris.findAll();
    }
}
