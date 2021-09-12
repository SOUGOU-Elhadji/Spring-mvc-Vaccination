package com.sarayamvc.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sarayamvc.model.Patient;


@Service
public class PatientService {
	public static List<Patient> patients = new ArrayList<Patient>();
	public static int count = 4;
	static {
		patients.add(new Patient(1, "Dieme", "Omar", "Fall", "Dakar / Medina", "775426352", "Fizer", new Date(), 1));
		patients.add(new Patient(2, "Dieme", "Amadou", "Seck", "Dakar / Toff", "778451229", "Fizer", new Date(), 1));
		patients.add(new Patient(3, "Dieme", "laye", "Sow", "Dakar / Fass", "785412563", "Fizer", new Date(), 1));
		patients.add(new Patient(4, "Dieme", "Ouzin", "Ka", "Dakar / Gueule Tappe", "768954123", "Fizer", new Date(), 1));
	}
	
	public List<Patient> getAllPatients(String user) {
		List<Patient> list = new ArrayList<Patient>();
		for (Patient patient : list) {
			if (patient.getUser().equalsIgnoreCase(user)) {
				list.add(patient);
			}
		}
		return patients;
	}
	
	public void addPatient(String user, String firstName, String lastName, String address, String number, String vaccineType, Date date, int numberDose) {
		patients.add(new Patient(++count, user, firstName, lastName, address, number, vaccineType, date, numberDose));
	}
	
	public Patient findById(int id) {
		for (Patient patient : patients) {
			if (patient.getId() == id) {
				return patient;
			}
		}
		return null;
	}
	
	public void updatePatient(Patient patient) {
		patients.remove(patient);
		patients.add(patient);
	}
	
	public void deletePatient(int id) {
		Iterator<Patient> iterator = patients.iterator();
		while (iterator.hasNext()) {
			Patient patient = iterator.next();
			if (patient.getId() == id) {
				iterator.remove();
			}	
		}
	}
}
