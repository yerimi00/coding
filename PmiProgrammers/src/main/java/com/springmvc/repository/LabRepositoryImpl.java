package com.springmvc.repository;

import java.util.List;


import com.springmvc.domain.Lab;

import java.util.ArrayList;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;



@Repository
public class LabRepositoryImpl implements LabRepository {
	private JdbcTemplate template; 
	 
	 @Autowired  
	 public void setJdbctemplate(DataSource dataSource) {
	    this.template = new JdbcTemplate(dataSource);
	 }
	private List<Lab> listOfLabs = new ArrayList<Lab>();
	
	public LabRepositoryImpl() {
		Lab lab1 = new Lab("1번 프로젝트");
		lab1.setContent("11111이거는 어떻게 되고 저렇게 되고 어쩌고저쩌고 상세설명 적을 수 있는공간");
		
		Lab lab2 = new Lab("2번 프로젝트");
		lab2.setContent("222222이거는 어떻게 되고 저렇게 되고 어쩌고저쩌고 상세설명 적을 수 있는공간");

		Lab lab3 = new Lab("3번 프로젝트");
		lab3.setContent("3333이거는 어떻게 되고 저렇게 되고 어쩌고저쩌고 상세설명 적을 수 있는공간");

		Lab lab4 = new Lab("4번 프로젝트");
		lab4.setContent("4444444이거는 어떻게 되고 저렇게 되고 어쩌고저쩌고 상세설명 적을 수 있는공간");
		
		listOfLabs.add(lab1);
		listOfLabs.add(lab2);
		listOfLabs.add(lab3);
		listOfLabs.add(lab4);
	
	}

	@Override
	public List<Lab> getAllLabList() {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM lab";  
        List<Lab> listOfLabs = template.query(SQL, new LabRowMapper());  
		// TODO Auto-generated method stub
		return listOfLabs;
	}
	
	public Lab getBookById(String labId) {
		Lab labInfo = null;
		String SQL = "SELECT count(*) FROM lab where lab_id=?";  
        int rowCount = template.queryForObject(SQL, Integer.class, labId);  
        if (rowCount != 0) {
            SQL = "SELECT * FROM lab where lab_id=?";  
            labInfo = template.queryForObject(SQL, new Object[] { labId }, new LabRowMapper());  
        }
		if(labInfo == null) {
			throw new IllegalArgumentException("프로젝트 ID가 "+labId+"인 해당 자료를 찾을 수 없습니다.");
		}
		return labInfo;
	}

}
