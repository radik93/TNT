package ru.tnt.modulegraph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.tnt.modulegraph.interfaces.service.CombinationService;

/*
 * @author radik
 * @version 1.0
 */
@Controller
@RequestMapping(path = "/mtg")
public class AdminController {

    @Autowired
    CombinationService combinationService;

    @GetMapping("/admin")
    public String adminPage() {
        return "admin";
    }

    @PostMapping("/upload")
    public String addZDV(@RequestParam("secantСombinationNum") Long secantСombinationNum,
                         @RequestParam("dpName") String dpName) {


        combinationService.addCombination(secantСombinationNum,dpName);
        return "admin";
    }
}
