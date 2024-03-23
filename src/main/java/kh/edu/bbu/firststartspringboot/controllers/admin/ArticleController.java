package kh.edu.bbu.firststartspringboot.controllers.admin;

import kh.edu.bbu.firststartspringboot.constants.Constants;
import kh.edu.bbu.firststartspringboot.models.Article;
import kh.edu.bbu.firststartspringboot.models.Category;
import kh.edu.bbu.firststartspringboot.services.ArticleService;
import kh.edu.bbu.firststartspringboot.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;
    private final CategoryService categoryService;

    @GetMapping("/admin/articles")
    public String index(Model model){
        model.addAttribute("objects", articleService.getAllArticles());
        return "/admin/article/index";
    }

    @GetMapping("/admin/articles/create")
    public String create(Model model){
        var object = new Article();
        object.setCategoryList(categoryService.getAllCategoriesByStatus(Constants.ACTIVE));
        object.setStatusList(Constants.getAllStatus());
        model.addAttribute("object", object);
        return "/admin/article/form";
    }

    @PostMapping("/admin/articles/create")
    public String create(Model model, @ModelAttribute("object") Article req){
        articleService.create(req);
        return "redirect:/admin/articles";
    }


    @GetMapping("/admin/articles/edit/{id}")
    public String edit(Model model, @PathVariable("id") Integer id){
        var object = articleService.getArticleById(id);
        object.setCategoryList(categoryService.getAllCategoriesByStatus(Constants.ACTIVE));
        object.setStatusList(Constants.getAllStatus());
        model.addAttribute("object", object);
        return "/admin/article/form";
    }

    @GetMapping("/admin/articles/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        var object = articleService.getArticleById(id);
        object.setStatus(Constants.DELETE);
        articleService.create(object);
        return "redirect:/admin/articles";
    }

}
