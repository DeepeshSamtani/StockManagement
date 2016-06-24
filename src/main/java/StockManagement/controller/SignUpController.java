package StockManagement.controller;

import StockManagement.model.SignUp;
import StockManagement.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by Deepesh on 15/06/2016.
 */
@Controller
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @RequestMapping("/signUp")
    public String showSignUpForm(Map<String, Object> map) {
        map.put("signUp", new SignUp());
        return "signUp";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addSignUp(@ModelAttribute("signUp")
                             SignUp signUp, BindingResult result) {

        signUpService.addSignUp(signUp);
        return "redirect:/signUp";
    }

}
