package com.example.demo.controller;

import com.example.demo.model.FacultyModel;
import com.example.demo.model.KafedraModel;
import com.example.demo.repository.KafedrasRepo;
import com.example.demo.service.KafIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class KafedrasController {
    @Autowired
    private KafIService kafIService;
    @Autowired
    private KafedrasRepo kafedrasRepo;
    @RequestMapping(value = "/showKaf", method = RequestMethod.GET)
    public String viewKaf(Model model) {
        List<KafedraModel> klist=kafIService.listall();
        model.addAttribute("klist",klist);
        return "showKaf";
    }
    @RequestMapping("/addKaf")
    public String insert(Model model) {
        model.addAttribute("kafs",new KafedraModel());
        return "addKaf";
    }

    @RequestMapping(value = "/savekaf",method = RequestMethod.POST)
    public String save(KafedraModel kafedraModel,Model model) {
        kafIService.savekaf(kafedraModel);
        return viewKaf(model);
    }

    @RequestMapping(value = "/deleteKbyid/{id}", method = RequestMethod.GET)
    public String deleteKafByid(@PathVariable("id") int id , Model model) {
        this.kafIService.deleteKafedra(id);
        return viewKaf(model);
    }

    @RequestMapping(value = "/updateKbyid/{id}",method = RequestMethod.GET)
    public String updateKafByid(@PathVariable(value = "id")int id,KafedraModel kafedraModel,Model model) {
        KafedraModel kf=kafIService.get(id);
        model.addAttribute("kf",kf);
        return "updateKbyid";
    }
}
