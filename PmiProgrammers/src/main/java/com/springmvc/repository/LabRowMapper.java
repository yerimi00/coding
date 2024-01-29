package com.springmvc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.springmvc.domain.Lab;

public class LabRowMapper implements RowMapper<Lab>{  
    public Lab mapRow(ResultSet rs, int rowNum) throws SQLException {
           Lab lab = new Lab();
           lab.setBookId(rs.getString(1));
           lab.setName(rs.getString(2));
           lab.setContent(rs.getString(3));
           return lab;
    }
}  