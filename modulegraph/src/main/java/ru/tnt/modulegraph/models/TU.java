package ru.tnt.modulegraph.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.List;

@Getter
@Setter
public class TU {

    int statusTU;

    List<SecantСombination> secantСombinationList;

    public TU(int statusTU, List<SecantСombination> secantСombinationList){
        this.statusTU = statusTU;

        this.secantСombinationList = secantСombinationList;
    }
}
