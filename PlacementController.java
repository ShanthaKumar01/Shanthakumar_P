package com.santhakumar.placementService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PlacementController {
	@Autowired
	private PlacementService service;
	
/*	@PostMapping("/placmentService")
	public void add(@RequestBody Placement pla)
	{
		service.insertRecord(cust);
	}*/
	
	
	@GetMapping("/customerservice")
	public List<Placement> list()
	{
		return service.listAll();
	}

	
/*	@GetMapping("/customerservice/{id}")
	public Customer getCustomerById(@PathVariable Integer id)
	{
		return service.getCustomerById(id);
	}
	
	@DeleteMapping("/customerservice/{id}")
	public void deleteCustomer(@PathVariable Integer id)
	{
		service.deleteCustomer(id);
	}
	
	@PutMapping("/customerservice/{id}")
	public ResponseEntity<String> updateCustomer(@PathVariable Integer id,@RequestBody Customer updatedCustomer)
	{
		service.updateCustomer(id,updatedCustomer);
		return ResponseEntity.ok("Customer updated Successfully");
	}*/


}
