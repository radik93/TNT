package ru.tnt.modulegraph.service;

import org.springframework.stereotype.Service;
import ru.tnt.modulegraph.interfaces.service.CalcStatusZDV;
import ru.tnt.modulegraph.models.ZDV;

@Service
public class CalcStatusZDVImpl implements CalcStatusZDV {

    private boolean open;

    private boolean close;

    private boolean toOpen;

    private boolean toClose;

    private boolean middle;

    @Override
    public ZDV setStatusZDV(ZDV zdv) {
        getSignal(zdv);

        zdv.setStatus(calcStatus());

        return zdv;

    }

    private void getSignal(ZDV zdv)
    {
        open    = zdv.isOpen();

        close   = zdv.isClose();

        toClose = zdv.isToClose();

        toOpen  = zdv.isToOpen();

        middle  = zdv.isMiddle();
    }

    private int calcStatus()
    {
      if(isOpen())
       return 1;
      if(isClose())
       return 3;
      if(isMiddle())
       return 5;
      if(isToClose())
       return 2;
      if(isToOpen())
       return 4;

      return -1;
    }

    private boolean isOpen()
    {
        if(open)
        {
            if(!(close||toClose||toOpen||middle))
                return true;
        }
        return false;
    }

    private boolean isClose()
    {
        if(close)
        {
            if(!(open||toClose||toOpen||middle))
                return true;
        }
        return false;
    }

    private boolean isToOpen()
    {
        if(toOpen)
        {
            if(!(open||toClose||close||middle))
                return true;
        }
        return false;
    }

    private boolean isToClose()
    {
        if(toClose)
        {
            if(!(open||toOpen||close||middle))
                return true;
        }
        return false;
    }

    private boolean isMiddle()
    {
        if(middle)
        {
            if(!(open||toOpen||close||toClose))
                return true;
        }
        return false;
    }
}
