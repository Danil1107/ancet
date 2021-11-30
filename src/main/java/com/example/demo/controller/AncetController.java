package com.example.demo.controller;

import com.example.demo.model.AncetsModel;
import com.example.demo.model.UsersModel;
import com.example.demo.repository.AncetRepo;
import com.example.demo.service.AncetIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AncetController {
    @Autowired
    private AncetRepo ancetRepo;
    @Autowired
    private AncetIService ancetIService;
    @RequestMapping(value = "/showAncets", method = RequestMethod.GET)
    public String viewAncets(Model model) {
        List<AncetsModel> anlist=ancetIService.listall();
        model.addAttribute("anlist",anlist);
        return "showAncets";
    }
    @RequestMapping("/addAncet")
    public String insert(Model model) {
        model.addAttribute("ancets",new AncetsModel());
        return "addAncet";
    }

    @RequestMapping(value = "/saveanc",method = RequestMethod.POST)
    public String save(AncetsModel ancetsModel,Model model) {
        ancetIService.saveanc(ancetsModel);
        return viewAncets(model);
    }

    @RequestMapping(value = "/deleteAnbyid/{id}", method = RequestMethod.GET)
    public String deleteAncetByid(@PathVariable("id") int id , Model model) {
        this.ancetIService.deleteAncet(id);
        return viewAncets(model);
    }

    @RequestMapping(value = "/updateAnbyid/{id}",method = RequestMethod.GET)
    public String updateAncetByid(@PathVariable(value = "id")int id,AncetsModel ancetsModel,Model model) {
        AncetsModel an=ancetIService.get(id);
        model.addAttribute("an",an);
        return "updateAnbyid";
    }
}
