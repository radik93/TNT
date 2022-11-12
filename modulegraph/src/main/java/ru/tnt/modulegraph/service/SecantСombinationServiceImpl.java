package ru.tnt.modulegraph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tnt.modulegraph.interfaces.grud.SecantCombinationRepositoris;
import ru.tnt.modulegraph.interfaces.service.SecantСombinationService;
import ru.tnt.modulegraph.models.SecantСombination;

import java.util.List;

@Service
public class SecantСombinationServiceImpl implements SecantСombinationService {

    @Autowired
    SecantCombinationRepositoris secantCombinationRepositoris;

    List<SecantСombination> secantСombinationList;

    @Override
    public SecantСombination getSecantCombination(long secantСombinationNum) {
        secantСombinationList = secantCombinationRepositoris.findFirstById(secantСombinationNum);

        if(secantСombinationList.size()==0)
           return addNewSecantСombination(secantСombinationNum);
        return secantСombinationList.get(0);
    }

    private SecantСombination addNewSecantСombination(long secantСombinationNum){
        SecantСombination secantСombination = new SecantСombination();
        secantСombination.setId(secantСombinationNum);
        saveSecantСombination(secantСombination);
        return secantСombination;
    }

    private void saveSecantСombination(SecantСombination secantСombination) {
        secantCombinationRepositoris.save(secantСombination);
    }
}
