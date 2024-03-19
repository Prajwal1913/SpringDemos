package org.doctorapp;

import java.util.List;

import org.doctorapp.model.Doctor;
import org.doctorapp.model.Specialization;
import org.doctorapp.service.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDoctorappJdbcApplication implements CommandLineRunner{
	
	@Autowired
	private IDoctorService doctorService;

	public static void main(String[] args) {
		SpringApplication.run(SpringDoctorappJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//      Specialization specialization = Specialization.PEDIA;
//      String speciality = specialization.getSpeciality();
//      Doctor doctor = new Doctor("Anjali", speciality,500,10,5);
//      doctorService.addDoctor(doctor);
		
//      List<Doctor> doctorList = doctorService.getAll();
//      for(Doctor listOfDoctors :doctorList){
//          System.out.println(listOfDoctors);
//      }
		
//      System.out.println("----------------------");
//      List<Doctor> doctorBySpecility = doctorService.getBySpeciality("PULMONOLOGIST");
//      for(Doctor listOfDoctorsBySpecility :doctorBySpecility){
//          System.out.println(listOfDoctorsBySpecility);
//      }
		
//      System.out.println("----------------------");
//      List<Doctor> doctorBySpecilityAndName = doctorService.getBySpecialityAndNameContains("DERMATOLOGIST","Sheetal");
//      for(Doctor listOfDoctorsBySpecilityAndName :doctorBySpecilityAndName){
//          System.out.println(listOfDoctorsBySpecilityAndName);
//      }
		
//      System.out.println("----------------------");
//          System.out.println(doctorService.getById(13));

//      System.out.println("----------------------");
//      List<Doctor> doctorBySpecilityAndRatings = doctorService.getBySpecialityAndRatings("NEUROLOGIST",8);
//      for(Doctor listOfDoctorsBySpecilityAndRatings :doctorBySpecilityAndRatings){
//          System.out.println(listOfDoctorsBySpecilityAndRatings);
//      }
		
//      System.out.println("----------------------");
//      List<Doctor> doctorBySpecilityAndExperience = doctorService.getBySpecialityAndExp("DERMATOLOGIST",16);
//      for(Doctor listOfDoctorsBySpecilityAndExperience :doctorBySpecilityAndExperience){
//          System.out.println(listOfDoctorsBySpecilityAndExperience);
//      }
		
//      System.out.println("----------------------");
//      List<Doctor> doctorBySpecilityAndFees = doctorService.getBySpecialityAndLessFees("GENERAL PHYSICIAN",201);
//      for(Doctor listOfDoctorsBySpecilityAndFees :doctorBySpecilityAndFees){
//          System.out.println(listOfDoctorsBySpecilityAndFees);
//      }
		
	}

}
