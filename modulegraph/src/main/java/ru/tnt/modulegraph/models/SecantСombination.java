package ru.tnt.modulegraph.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Table(name="secantcombinations")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SecantСombination {

    @Id
    private Long id;

    private int statusSecantСombination;


    @OneToMany(targetEntity=ZDV.class,
            fetch = FetchType.EAGER)
    @JoinColumn(name="secantcomdination_id")
    private List<ZDV> zdvs = new ArrayList<>();

}
