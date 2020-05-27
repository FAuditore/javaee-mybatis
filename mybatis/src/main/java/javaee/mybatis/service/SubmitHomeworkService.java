package javaee.mybatis.service;

import javaee.mybatis.DAO.SubmitHomeworkDAO;
import javaee.mybatis.model.StudentHomework;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: FAuditore
 * Date: 2020/5/27
 * Time: 19:56
 */
public class SubmitHomeworkService {

    @Resource
    SubmitHomeworkDAO submitHomeworkDAO;

    public void submitHomework(StudentHomework studentHomework){
        submitHomeworkDAO.submitHomework(studentHomework);
    }

    public List<StudentHomework> showSubmit(){
        return submitHomeworkDAO.showSubmit();
    }

}
