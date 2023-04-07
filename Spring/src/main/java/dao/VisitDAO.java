package dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vo.VisitVO;

import java.util.List;

@Repository("visit_dao")
public class VisitDAO {
    SqlSession sqlSession;

    @Autowired
    public VisitDAO(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    } // end of constructor

    public List<VisitVO> selectList(){
        List<VisitVO> list = sqlSession.selectList("v.visit_list");
        return list;
    } // end of class

} // end of class
