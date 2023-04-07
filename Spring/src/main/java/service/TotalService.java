package service;

import dao.VisitDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.VisitVO;

import java.util.List;

@Service("service")
public class TotalService {
    VisitDAO visit_dao;

    @Autowired
    public TotalService(VisitDAO visit_dao) {
        this.visit_dao = visit_dao;
    } // end of constructor

    public List<VisitVO> selectList(){
        List<VisitVO> list = visit_dao.selectList();
        return list;
    } // end of selectList()

} // end of class
