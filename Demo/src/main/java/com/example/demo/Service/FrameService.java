package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Details;
import com.example.demo.Repository.Repo;

@Service
public class FrameService { 
	@Autowired
	Repo repository;
	
	public String addCustomer(Details customer)
	{
		repository.save(customer);
		return "Added";
	}
	public List<Details> getCustomer()
	{
		return repository.findAll();
	}
	public Optional<Details> getCustomerById(int id)
	{
		return repository.findById(id);
	}
	public String updateCustomer(Details customer)
	{
		repository.save(customer);
		return "Updated";
	}
	public void deleteByRequestParam(int id)
	{
		repository.deleteById(id);
	}
}
