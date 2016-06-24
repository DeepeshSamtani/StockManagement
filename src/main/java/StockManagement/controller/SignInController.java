package StockManagement.controller;

import StockManagement.model.SignIn;
import StockManagement.model.SignUp;
import StockManagement.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Map;

/**
 * Created by Deepesh on 19/06/2016.
 */
@Controller
public class SignInController {

    @Autowired
    public SignInService signInService;

    @RequestMapping(value = "/signIn",method = RequestMethod.GET)
    public String showForm(Map model){
        model.put("signIn",new SignIn());
        return "signIn";
    }

    @RequestMapping(value="/valid",method = RequestMethod.POST)
    public String processForm(@ModelAttribute("userName") String userName, @Valid SignIn signIn, BindingResult result, Model model, Map map, HttpSession session){

        if (result.hasErrors()){
            return "signIn";
        }

        boolean userExists = signInService.checkLogin(signIn.getUserName(),signIn.getPassword());
        if (userExists){
            session.setAttribute("userName",signIn.getUserName());
            model.addAttribute("userName",userName);
            map.put("signIn",signIn);
            return "home";
        }
        else{
            result.rejectValue("userName","invalidUser");
            return "signIn";
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session){
        session.removeAttribute("userName");
        return "redirect:signIn";
    }


}
