package org.doctorapp.util;

public class Queries {
    public static final String INSERTQUERY ="insert into doctor(doctorName,speciality,fees,ratings,experience) values(?,?,?,?,?)";
    public static final String UPDATEQUERY ="update doctor set fees=? where doctorId=?";
    public static final String DELETEQUERY ="delete from doctor where doctorId=?";
    public static final String FINDALLQUERY ="select * from doctor";
    public static final String FINDBYSPECIALITY ="select * from doctor where speciality>=?";
    public static final String FINDBYSPECIALITYANDRATINGS ="select * from doctor where speciality=? and ratings>=?";
    public static final String FINDBYSPECIALITYANDEXPERIENCE ="select * from doctor where speciality=? and experience>=?";
    public static final String FINDBYSPECIALITYANDFEES ="select * from doctor where speciality=? and fees<=?";
    public static final String FINDBYSPECIALITYANDNAME ="select * from doctor where speciality=? and doctorName=?";
    public static final String FINDBYID ="select * from doctor where doctorId=?";
}
