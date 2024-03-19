package org.doctorapp.repository;

import org.doctorapp.model.Doctor;

import org.doctorapp.util.Queries;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class DoctorRepositoryImpl implements IDoctorRepository {
	
	private  JdbcTemplate jdbcTemplate;
	
    public DoctorRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addDoctor(Doctor doctor) {
		Object[] doctorArr =  {doctor.getDoctorName(),doctor.getSpeciality(),doctor.getFees(),doctor.getRatings(),doctor.getExperience()};
		jdbcTemplate.update(Queries.INSERTQUERY,doctorArr);
		
	}

	@Override
	public void updateDoctor(int doctorId, double fees) {
		jdbcTemplate.update(Queries.UPDATEQUERY,doctorId,fees);
		
	}

	@Override
	public void deleteDoctor(int doctorId) {
		jdbcTemplate.update(Queries.DELETEQUERY,doctorId);
		
	}

	@Override
	public Doctor findById(int doctorId) {
		Doctor doctor = jdbcTemplate.queryForObject(Queries.FINDBYID, new DoctorMapper(),doctorId);
		return doctor;
	}

	@Override
	public List<Doctor> findAll() {
		RowMapper<Doctor> mapper = new DoctorMapper();
		List<Doctor> doctor = jdbcTemplate.query(Queries.FINDALLQUERY, mapper);
		return doctor;
	}

	@Override
	public List<Doctor> findBySpeciality(String speciality) {
		return jdbcTemplate.query(Queries.FINDBYSPECIALITY, new DoctorMapper(),speciality);
	}

	@Override
	public List<Doctor> findBySpecialityAndExp(String speciality, int experience) {
		return jdbcTemplate.query(Queries.FINDBYSPECIALITYANDEXPERIENCE, new DoctorMapper(),speciality,experience);
	}

	@Override
	public List<Doctor> findBySpecialityAndLessFees(String speciality, double fees) {
		return jdbcTemplate.query(Queries.FINDBYSPECIALITYANDFEES, new DoctorMapper(),speciality,fees);
	}

	@Override
	public List<Doctor> findBySpecialityAndRatings(String speciality, int ratings) {
		return jdbcTemplate.query(Queries.FINDBYSPECIALITYANDRATINGS, new DoctorMapper(),speciality,ratings);
	}

	@Override
	public List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName) {
		return jdbcTemplate.query(Queries.FINDBYSPECIALITYANDNAME, new DoctorMapper(),speciality,doctorName);
	}

	
}
