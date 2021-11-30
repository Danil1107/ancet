package com.example.demo.controller;

import com.example.demo.model.UsersModel;
import com.example.demo.repository.UsRepo;
import com.example.demo.service.UsIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UsController {
    @Autowired
    private UsRepo usRepo;
    @Autowired
    private UsIService usIService;
    @RequestMapping(value = "/showUsers", method = RequestMethod.GET)
	public String viewUsers(Model model) {
	List<UsersModel> uslist=usIService.listall();
		model.addAttribute("uslist",uslist);
		return "showUsers";
	}
    @RequestMapping("/addUser")
    public String insert(Model model) {
        model.addAttribute("users",new UsersModel());
        return "addUser";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(UsersModel usersModel,Model model) {
        usIService.save(usersModel);
        return viewUsers(model);
    }

    @RequestMapping(value = "/deleteUsbyid/{id}", method = RequestMethod.GET)
    public String deleteUserByid(@PathVariable("id") int id , Model model) {
        this.usIService.deleteUser(id);
        return viewUsers(model);
    }

    @RequestMapping(value = "/updateUsbyid/{id}",method = RequestMethod.GET)
    public String updateUserByid(@PathVariable(value = "id")int id,UsersModel usersModel,Model model) {
        UsersModel um=usIService.get(id);
        model.addAttribute("um",um);
        return "updateUsbyid";
    }
}
