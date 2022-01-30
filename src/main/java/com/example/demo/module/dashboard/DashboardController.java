package com.example.demo.module.dashboard;

import com.example.demo.module.dashboard.dto.ArticleDto;
import com.example.demo.module.dashboard.dto.CommentDto;
import com.example.demo.module.dashboard.dto.MenuDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DashboardController {
    @GetMapping("/dashboard")
    public String getDashboard(Model model){

        List<MenuDto> menu = List.of(
                new MenuDto("Home", "/"),
                new MenuDto("Dashboard", "/dashboard"),
                new MenuDto("about Us", "/ablut us")
        );
        List<CommentDto> comments = List.of(
                new CommentDto("admin", "lorem 1"),
                new CommentDto("mariusz", "lorem 2"),
                new CommentDto("ola", "lorem 3")
        );


        ArticleDto articleDto = new ArticleDto()
                .setTitle("first")
                .setText("lorem ipsum")
                .setComments(comments);

        model.addAttribute("menu", menu);
        model.addAttribute("article", articleDto);

        return "dashboard/index.html";
    }


}
