package service;

import dao.VisitDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.VisitVO;

import java.util.List;

@Service
public class TotalService {
    VisitDAO visitDAO;

    @Autowired
    public TotalService(VisitDAO visitDAO) {
        this.visitDAO = visitDAO;
    } // end of constructor

    public List<VisitVO> selectList(){
        List<VisitVO> list = visitDAO.selectList();
        return list;
    } // end of selectList()

} // end of class
