package com.greenfoxacademy.usefulutilities.Controllers;

import com.greenfoxacademy.usefulutilities.Services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UtilityController {

    UtilityService util;

    @Autowired
    public UtilityController(UtilityService util) {
        this.util = util;
    }

    @GetMapping("/useful")
    public String renderHomePage() {
        return "index";
    }

    @GetMapping("/useful/colored")
    public String renderColoredPage(Model model) {
        model.addAttribute("color",util.randomColor());
        return "colored";
    }

    @GetMapping("/useful/email")
    public String renderEmailPage(Model model, @RequestParam String email) {
        model.addAttribute("email",util.validateEmail(email));
    return "email";
    }

    @PostMapping("/useful/email")
    public String returnEmailPage(Model model, @RequestParam String email) {
        model.addAttribute("email", util.validateEmail(email));
        return "email";
    }

    @GetMapping("/useful/encode")
    public String renderEncodedPage(Model model, @RequestParam String word, int number) {
        model.addAttribute("encoded",util.caesar(word,number));
        return "encode";
    }

    @PostMapping("/useful/encode")
    public String returnEncoded(Model model, @RequestParam String word, int number) {
        model.addAttribute("encoded",util.caesar(word,number));
        return "encode";
    }

    @GetMapping("/useful/decode")
    public String renderDecodedPage(Model model, @RequestParam String word, int number) {
        model.addAttribute("decoded",util.caesar(word,number));
        return "decode";
    }

    @PostMapping("/useful/decode")
    public String returnDecoded(Model model, @RequestParam String word, int number) {
        int numberD = number*(-1);
        model.addAttribute("decoded",util.caesar(word,numberD));
        return "decode";
    }

}
