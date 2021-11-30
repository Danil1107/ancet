package com.example.demo.controller;

import com.example.demo.model.AncetsModel;
import com.example.demo.model.FacultyModel;
import com.example.demo.repository.FacultyRepo;
import com.example.demo.service.FacIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class FacultyController {
    @Autowired
    private FacultyRepo facultyRepo;
    @Autowired
    private FacIService facIService;
    @RequestMapping(value = "/showFac", method = RequestMethod.GET)
    public String viewFac(Model model) {
        List<FacultyModel> flist=facIService.listall();
        model.addAttribute("flist",flist);
        return "showFac";
    }
    @RequestMapping("/addFac")
    public String insert(Model model) {
        model.addAttribute("facs",new FacultyModel());
        return "addFac";
    }

    @RequestMapping(value = "/savefac",method = RequestMethod.POST)
    public String save(FacultyModel facultyModel,Model model) {
        facIService.savefac(facultyModel);
        return viewFac(model);
    }

    @RequestMapping(value = "/deleteFbyid/{id}", method = RequestMethod.GET)
    public String deleteFacByid(@PathVariable("id") int id , Model model) {
        this.facIService.deleteFaculty(id);
        return viewFac(model);
    }

    @RequestMapping(value = "/updateFbyid/{id}",method = RequestMethod.GET)
    public String updateFacByid(@PathVariable(value = "id")int id,FacultyModel facultyModel,Model model) {
        FacultyModel fc=facIService.get(id);
        model.addAttribute("fc",fc);
        return "updateFbyid";
    }
}
