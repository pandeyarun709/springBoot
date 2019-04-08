package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class EmpService {
	
	private List<Emp> emp =new ArrayList<> ( Arrays.asList(
			new Emp("1" , "pandeyarun709@gmail.com", "arun"),
			new Emp("2" , "arun@quikr.com" , "xyz")
			));
	
	public List<Emp> getAllEmp() {
		return emp;
	}
	
	public Emp getEmp( String id) {
		
		return  emp.stream().filter(t ->t.getId().equals(id)).findFirst().get();
	}
	
	public void addEmployee(Emp e) {
		
		emp.add(e);
	}
	
	public void updateEmp(Emp e , String id) {
		System.out.println("################################");
		for(int i=0; i < emp.size() ;i++)
		{
			Emp t = emp.get(i);
			
			if(t.getId().equals(id)) {
				emp.set(i, e);
				return;
			}
		}
		
	}

	public void deleteEmp(String id) {
		// TODO Auto-generated method stub
		emp.removeIf(t -> t.getId().equals(id));
		
	}
}
