package Domains;

import Interfaces.iDBRepository;
import Interfaces.Ientity;
import postgre.database;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddRemove implements Ientity<employee> {
    private iDBRepository db;

    public  AddRemove(){
        db = new database();
    }

    @Override
    public void add(employee entity) {
        try {
            String sql = "INSERT INTO users(name, surname,birthday,salary,position) VALUES(?,?,?,?,?)";
            PreparedStatement stmt = db.getConnection().prepareStatement(sql);
            stmt.setString(1, entity.getName());
            stmt.setString(2, entity.getSurname());
            stmt.setDate(3, entity.getBirthday());
            stmt.setDouble(4, entity.getSalary());
            stmt.setString(5, entity.getPosition());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public void delete(employee entity) {
        try {
            String sql = "DELETE FROM users WHERE id= ? ";
            PreparedStatement stmt = db.getConnection().prepareStatement(sql);
            stmt.setLong(1,entity.getId());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }


    }

}
