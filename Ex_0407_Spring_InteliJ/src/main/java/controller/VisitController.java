package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.TotalService;
import util.MyCommon;
import vo.VisitVO;

import java.util.List;

@Controller
public class VisitController {

    TotalService service;

    @Autowired
    public VisitController(TotalService service) {
        this.service = service;
    } // end of constructor

    @RequestMapping(value = {"/","visit_list.do"})
    public String selectList(Model model){
        List<VisitVO> visit_list = service.selectList();
        model.addAttribute("visit_list", visit_list);
        model.addAttribute("data", "Hello Spring Project");
        return MyCommon.Visit.VIEW_PATH + "visit_list.jsp";
    } // end of selectList()

} // end of class
