package com.example.demo.controller;

import com.example.demo.model.AnQsModel;
import com.example.demo.repository.AnQsRepo;
import com.example.demo.service.AnQsIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AnQsController {
    @Autowired
    private AnQsIService anQsIService;
    @Autowired
    private AnQsRepo anQsRepo;
    @RequestMapping(value = "/showAnQ", method = RequestMethod.GET)
    public String viewAnQ(Model model) {
        List<AnQsModel> anlist=anQsIService.listall();
        model.addAttribute("anlist",anlist);
        return "showAnQ";
    }
    @RequestMapping("/addAnQ")
    public String insert(Model model) {
        model.addAttribute("anqs",new AnQsModel());
        return "addAnQ";
    }

    @RequestMapping(value = "/savea",method = RequestMethod.POST)
    public String save(AnQsModel anQsModel,Model model) {
        anQsIService.saveanq(anQsModel);
        return viewAnQ(model);
    }

    @RequestMapping(value = "/deleteAnQbyid/{id}", method = RequestMethod.GET)
    public String deleteAnqByid(@PathVariable("id") int id , Model model) {
        this.anQsIService.deleteAnQ(id);
        return viewAnQ(model);
    }

    @RequestMapping(value = "/updateAnQbyid/{id}",method = RequestMethod.GET)
    public String updateAnqByid(@PathVariable(value = "id")int id,AnQsModel anQsModel,Model model) {
        AnQsModel af=anQsIService.get(id);
        model.addAttribute("af",af);
        return "updateAnQbyid";
    }
}
