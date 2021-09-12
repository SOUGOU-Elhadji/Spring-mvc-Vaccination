package com.sarayamvc.controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sarayamvc.model.Patient;
import com.sarayamvc.service.PatientService;

@Controller
@SessionAttributes("username")
public class PatientController {
		@Autowired
		PatientService patientService;
		@Autowired
		WelcomeController welcomeController;
		
		@RequestMapping(value = "/list-patient", method=RequestMethod.GET)
		public String getAll(ModelMap model) {
			String username = (String) model.getAttribute("username"); 
			model.addAttribute("patients", patientService.getAllPatients(username));
			return "listPage";
		}
		
		@RequestMapping(value = "/add-patient", method=RequestMethod.GET)
		public String addPatient(ModelMap model) {
			model.addAttribute("patients", new Patient());
			return "formPage";
		}
		
		@RequestMapping(value = "/add-patient", method=RequestMethod.POST)
		public String add(@RequestParam String firstName, String lastName, String address, String number, String vaccineType, int numberDose) {
			patientService.addPatient("malick", firstName, lastName, address, number, vaccineType, new Date(), numberDose);
			return "redirect:/list-patient";
		}
		
		@RequestMapping(value = "/delete-patient", method=RequestMethod.GET)
		public String deletePatient(@RequestParam int id, ModelMap model) {
			patientService.deletePatient(id);
			model.clear();
			return "redirect:/list-patient";
		}
		
		@RequestMapping(value = "/update-patient", method=RequestMethod.GET)
		public String updatePatient(@RequestParam int id, ModelMap model) {
			model.addAttribute("patient", patientService.findById(id));
			return "editPage";
		}
		
		@RequestMapping(value = "/update-patient", method=RequestMethod.POST)
		public String updatePatient(@Validated Patient patient, ModelMap model, BindingResult result) {
			if (result.hasErrors())
				return "listPage";
				//todo.setUser();
				patient.setUser(welcomeController.getLoggedInUser());
				patientService.updatePatient(patient);
				model.clear();
				return "redirect:/list-patient";
		}
}
