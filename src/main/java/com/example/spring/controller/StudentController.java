package com.example.spring.controller;

import com.example.spring.model.Student;
import com.example.spring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository mapper;

    @GetMapping("/")
    private String st(){
        return "redirect:/st-list";
    }
    @PostMapping("/insert")
    private String insert(@ModelAttribute("students") Student student){
        mapper.insert(student);
        return "redirect:/st-list";
    }

    @GetMapping("/st-list")
    private String students(Model model){
        model.addAttribute("students", mapper.findAll());
        return "student";
    }

    @GetMapping("/delete")
    private String delete(@RequestParam("id") int id){
        mapper.deleteById(id);
        return "redirect:/st-list";
    }

    @GetMapping("/form")
    private String updateForm(@RequestParam("id") int id, Model model){
        Student st = mapper.findById(id);
        if(st != null){
            model.addAttribute("st", st);
        }
        return "form";
    }

    @PostMapping("/update")
    private String update(@ModelAttribute("students") Student student){
        mapper.update(student);
        return "redirect:/st-list";
    }

}
