package ru.tnt.modulegraph.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.tnt.modulegraph.interfaces.service.GetStatusTU;
import ru.tnt.modulegraph.models.TU;
import ru.tnt.modulegraph.utilities.StatusMaker;


/*
 * Интерфейс для конвертации XML в JSON
 * @author radik
 * @version 1.0
 */
@Controller
@RequestMapping(path = "/mtg")
public class UserController {


    @Autowired
    GetStatusTU getStatusTU;

    TU tu;

    int statusTU;

    @GetMapping("/index")
    public String indexPage(Model model) {


            tu = getStatusTU.getStatusTU();

            statusTU = tu.getStatusTU();


            model.addAttribute("statusTU", StatusMaker.getВescription(statusTU));


        return "index";
    }
}
