package com.example.test;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PatientsController {

	@Autowired
	PatientsRepo repo;
	@RequestMapping("/")
	public String details()
	{
		return "patient";
	}

	@RequestMapping("/details")
	public String details(Patients patients)
	{
		repo.save(patients);
		return "patient";
	}
	@RequestMapping("/getdetails")
	public String getdetails()
	{
		return "retrieve";
	}
	@PostMapping("/getdetails")
	public ModelAndView getdetails(@RequestParam("pid") int pid) 
	{
		ModelAndView mv = new ModelAndView("retrieve");
		Patients patients = repo.findById(pid).orElse(null);
		mv.addObject(patients);
		return mv;
	}
	@RequestMapping("/patients")
	@ResponseBody
	public List<Patients> getPatients()
	{
		return repo.findAll();
		
	}
	@PostMapping("/patients")
	public Patients getPatients3(@RequestBody Patients patients)
	{
		
		repo.save(patients);
		return patients;
	}
	@DeleteMapping("/patients/{pid}")
	public Patients getPatieents4(@PathVariable("pid") int pid)
	{
		
		Patients patients = repo.getOne(pid);
		repo.delete(patients);
		return patients;
	}
	@PutMapping(path="/patients", consumes=("application/jason"))
	public Patients getPatients5(@RequestBody Patients patients)
	{
		

		repo.save(patients);
		return patients;
	}
	@RequestMapping("/patients/{pid}")
	@ResponseBody
	public Optional<Patients> getPatients2(@PathVariable("pid") int pid)
	{
		return repo.findById(pid);
		
	}

}
