package javaee.mybatis.DAO;

import javaee.mybatis.model.StudentHomework;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: FAuditore
 * Date: 2020/5/27
 * Time: 20:20
 */
public interface SubmitHomeworkDAO {
    public void submitHomework(StudentHomework studentHomework);

    public List<StudentHomework> showSubmit();

}
