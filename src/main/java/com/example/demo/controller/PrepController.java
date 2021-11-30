package com.example.demo.controller;

import com.example.demo.model.KafedraModel;
import com.example.demo.model.PrepodModel;
import com.example.demo.repository.PrepodRepo;
import com.example.demo.service.PrepIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class PrepController {
    @Autowired
    private PrepIService prepIService;
    @Autowired
    private PrepodRepo prepodRepo;
    @RequestMapping(value = "/showPre", method = RequestMethod.GET)
    public String viewPre(Model model) {
        List<PrepodModel> plist=prepIService.listall();
        model.addAttribute("plist",plist);
        return "showPre";
    }
    @RequestMapping("/addPre")
    public String insert(Model model) {
        model.addAttribute("pres",new PrepodModel());
        return "addPre";
    }

    @RequestMapping(value = "/savepre",method = RequestMethod.POST)
    public String save(PrepodModel prepodModel,Model model) {
        prepIService.saveprep(prepodModel);
        return viewPre(model);
    }

    @RequestMapping(value = "/deletePbyid/{id}", method = RequestMethod.GET)
    public String deletePreByid(@PathVariable("id") int id , Model model) {
        this.prepIService.deletePrep(id);
        return viewPre(model);
    }

    @RequestMapping(value = "/updatePbyid/{id}",method = RequestMethod.GET)
    public String updatePreByid(@PathVariable(value = "id")int id,PrepodModel prepodModel,Model model) {
        PrepodModel pm=prepIService.get(id);
        model.addAttribute("pm",pm);
        return "updatePbyid";
    }
}
