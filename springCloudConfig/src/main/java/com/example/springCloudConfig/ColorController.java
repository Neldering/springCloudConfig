package com.example.springCloudConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ColorController {

  @Value("${color}")
  private String color;

  @GetMapping("/")
  public String home(Model model) {
    model.addAttribute("color", color);
    return "home";
  }

}