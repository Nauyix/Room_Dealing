package com.dao;

import com.bean.Inform510;
import com.utils.C3p0Utils510;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;
public class InformDao510 {
    public List<Inform510> findAll() throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql="select * from pd_inform";
        List<Inform510> list=(List<Inform510>)runner.query(sql,new BeanListHandler<Inform510>(Inform510.class));
        return list;
    }
    public List<Inform510> findAll(String receiverId) throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql ="select * from pd_inform where receiver_id="+receiverId;
        List<Inform510> list=(List<Inform510>)runner.query(sql,new BeanListHandler<Inform510>(Inform510.class));
        return list;
    }
    public Inform510 find(int id) throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql = "select * from pd_inform where id=?";
        Inform510 Inform510 = (Inform510) runner.query(sql,new BeanHandler<Inform510>(Inform510.class),new Object[]{id});
        return Inform510;
    }
    public Boolean insert(Inform510 i) throws SQLException{
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql="insert into pd_inform values (?,?,?,?,?)";
        int num=runner.update(sql,new Object[] {i.getInform_id(),i.getSender_id(),i.getReceiver_id(),i.getInform_text(),i.getInform_time()});
        if (num > 0) {
            return true;
        }
        return false;
    }
    public Boolean update(Inform510 i) throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql="update pd_inform set user_name=?,user_pwd=?,user_tel=?,user_email=?,user_type=? where id=?";
        int num= runner.update(sql,new Object[]{});
        if(num>0) return true;
        return false;
    }
    public Boolean delete(int id) throws SQLException {
        QueryRunner runner = new QueryRunner(C3p0Utils510.getDataSource());
        String sql="delete from pd_inform where id=?";
        int num= runner.update(sql,id);
        if (num > 0) {
            return true;
        }
        else return false;
    }
}
