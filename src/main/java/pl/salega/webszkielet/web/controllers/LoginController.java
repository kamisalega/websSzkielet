package pl.salega.webszkielet.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kamilsalega on 10.08.2017.
 */
@Controller
public class LoginController {

    private static final String LOGIN_VIEW_NAME = "user/login";

    @RequestMapping("/login")
    public String login() {

        return LOGIN_VIEW_NAME;
    }


}
