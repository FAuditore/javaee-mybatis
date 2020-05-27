package javaee.mybatis.service;

import javaee.mybatis.DAO.HomeworkDAO;
import javaee.mybatis.model.Homework;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: FAuditore
 * Date: 2020/5/27
 * Time: 19:56
 */
@Service
public class HomeworkService {

    @Resource
    HomeworkDAO homeworkDAO;

    public void publishHomework(Homework homework){
        homeworkDAO.publishHomework(homework);
    }

    public List<Homework> showHomework(){
        return homeworkDAO.showHomework();
    }
}
