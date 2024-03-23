package kh.edu.bbu.firststartspringboot.controllers;

/*
 * /users
 * /users/1
 * /users/create
 *
 * */

import kh.edu.bbu.firststartspringboot.models.Teacher;
import kh.edu.bbu.firststartspringboot.services.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/teachers")
public class TeacherController {
    // call service
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("teachers", teacherService.getAllTeachers("ACT"));
        return "teacher/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("teacher", new Teacher());
        return "teacher/create";
    }

    @PostMapping("/create")
    public String create(Model model, @ModelAttribute("teacher") Teacher teacher){
        teacherService.create(teacher);
        return "redirect:/teachers";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model){
        model.addAttribute("teacher",teacherService.getTeacherById(id));
        return "teacher/edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("teacher") Teacher teacher, Model model){
        teacherService.create(teacher);
        return "redirect:/teachers";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        teacherService.delete(id);
        return "redirect:/teachers";
    }

}
