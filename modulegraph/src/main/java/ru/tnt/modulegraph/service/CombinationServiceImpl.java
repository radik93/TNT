package ru.tnt.modulegraph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tnt.modulegraph.interfaces.service.CombinationService;
import ru.tnt.modulegraph.interfaces.service.SecantСombinationService;
import ru.tnt.modulegraph.interfaces.service.ZDVService;
import ru.tnt.modulegraph.models.SecantСombination;
import ru.tnt.modulegraph.models.ZDV;

import java.util.List;

@Service
public class CombinationServiceImpl implements CombinationService {

    @Autowired
    SecantСombinationService secantСombinationService;

    @Autowired
    ZDVService zdvService;

    ZDV zdv;

    SecantСombination secantСombination;

    List<ZDV> zdvList;


    @Override
    public void addCombination(Long secantСombinationNum, String dpName) {

        secantСombination = secantСombinationService.getSecantCombination(secantСombinationNum);
        zdv               = zdvService.addZDV(dpName);

        zdv.setSecantСombination(secantСombination);

        zdv = zdvService.saveZDV(zdv);
    }
}
