package javaee.mybatis.DAO;

import javaee.mybatis.model.Homework;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: FAuditore
 * Date: 2020/5/27
 * Time: 20:20
 */
public interface HomeworkDAO {
    public void publishHomework(Homework homework);

    public List<Homework> showHomework();

}
