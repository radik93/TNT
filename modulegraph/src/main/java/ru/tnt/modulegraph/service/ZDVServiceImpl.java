package ru.tnt.modulegraph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tnt.modulegraph.interfaces.grud.SecantCombinationRepositoris;
import ru.tnt.modulegraph.interfaces.grud.ZDVRepositoris;
import ru.tnt.modulegraph.interfaces.service.CalcStatusZDV;
import ru.tnt.modulegraph.interfaces.service.ZDVService;
import ru.tnt.modulegraph.models.ZDV;

@Service
public class ZDVServiceImpl implements ZDVService {

    @Autowired
    ZDVRepositoris zdvRepositoris;

    @Autowired
    CalcStatusZDV calcStatusZDV;

    ZDV zdv;

    @Override
    public ZDV addZDV(String dpName) {

        zdv = new ZDV();

        zdv.setDpName(dpName);

        zdv = calcStatusZDV.setStatusZDV(zdv);

        return zdv;
    }

    @Override
    public ZDV saveZDV(ZDV zdv) {
        zdvRepositoris.save(zdv);
        return zdv;
    }
}
