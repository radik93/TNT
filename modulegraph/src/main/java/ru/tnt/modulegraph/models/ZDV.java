package ru.tnt.modulegraph.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name="zdvs")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ZDV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String dpName;

    private boolean open;

    private boolean close;

    private boolean toOpen;

    private boolean toClose;

    private boolean middle;

    private int status;


    @ManyToOne(targetEntity=SecantСombination.class)
    @JoinColumn(name="secantcomdination_id")
    private SecantСombination secantСombination;
}
