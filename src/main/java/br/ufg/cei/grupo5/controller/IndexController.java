package br.ufg.cei.grupo5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Iago Bruno
 * @since 1.0
 */
@Controller
public class IndexController {

  @RequestMapping({"/", "", "/index"})
  public String index(){
    return "/index";
  }

}
