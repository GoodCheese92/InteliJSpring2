package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.TotalService;
import vo.VisitVO;

import java.util.List;

@Controller
public class VisitController {
    TotalService service;

    @Autowired
    public VisitController(TotalService service) {
        this.service = service;
    } // end of constructor

    @RequestMapping(value = {"/", "/visit_list.do"})
    public String visit_list(Model model){
        List<VisitVO> visit_list = service.selectList();
        model.addAttribute("visit_list", visit_list);

        return "visit_list";
    } // end of class

    /*@RequestMapping("/")
    public String HomeController(Model model){
        model.addAttribute("data", "Hello world!");
        return "index";
    } // end of HomeController()*/


} // end of class
