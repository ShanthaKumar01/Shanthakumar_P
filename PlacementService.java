package com.santhakumar.placementService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlacementService {
	@Autowired
	private PlacementRepository repo;
public List<Placement> listAll()
{
	return repo.findAll();
}
	
	//updating the existing record
/*	public void updateCustomer(Integer id,Customer updateCustomer)
	{
		Placement existingCustomer=repo.findById(id).orElse(null);
		if(existingCustomer!=null)
		{
			existingCustomer.setCid(updateCustomer.getCid());
			existingCustomer.setCname(updateCustomer.getCname());
			existingCustomer.setAddress(updateCustomer.getAddress());
			repo.save(existingCustomer);
		}
	*/}
	
	
	
	
	
	
	
	



