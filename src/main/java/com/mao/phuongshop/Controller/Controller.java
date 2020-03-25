package com.mao.phuongshop.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String homePage(Model model){

        List<String> images = new ArrayList<>();
        String randImg[] = {"lan.jpg","lan2.jpg","lan4.jpg","lan5.jpg","lan3.jpg","phuong.jpg"};
        for(int i = 0; i < 200;i++){
            int r = (int)(Math.random() * 6);
            images.add(randImg[r]);
        }


        model.addAttribute("images",images);

        return "home";

    }

}
