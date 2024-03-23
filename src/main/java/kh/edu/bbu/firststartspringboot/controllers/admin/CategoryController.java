package kh.edu.bbu.firststartspringboot.controllers.admin;

import kh.edu.bbu.firststartspringboot.constants.Constants;
import kh.edu.bbu.firststartspringboot.models.Category;
import kh.edu.bbu.firststartspringboot.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public String index(Model model){
        model.addAttribute("categories", categoryService.getAllCategories());
        return "/admin/category/index";
    }

    @GetMapping("/create")
    public String create(Model model){
        var object = new Category();
        object.setStatusList(Constants.getAllStatus());
        model.addAttribute("object", object);
        return "/admin/category/form";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("object") Category req){
        categoryService.create(req);
        return "redirect:/admin/categories";
    }

    @GetMapping("/edit/{id}")
    public String create(Model model, @PathVariable("id") Integer id){
        var object = categoryService.getCategoryById(id);
        object.setStatusList(Constants.getAllStatus());
        model.addAttribute("object", object);
        return "/admin/category/form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        var object = categoryService.getCategoryById(id);
        if(object !=null){
            object.setStatus(Constants.DELETE);
            categoryService.create(object);
        }
        return "redirect:/admin/categories";
    }


}
