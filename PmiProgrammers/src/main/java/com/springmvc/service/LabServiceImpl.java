package com.springmvc.service;

import java.util.List;
import com.springmvc.domain.Lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springmvc.repository.LabRepository;


@Service
public class LabServiceImpl implements LabService {
	@Autowired
	private LabRepository labRepository;

	public List<Lab> getAllLabList() {
		// TODO Auto-generated method stub
		return labRepository.getAllLabList();
	}

}
