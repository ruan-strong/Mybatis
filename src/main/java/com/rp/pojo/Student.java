package com.rp.pojo;


public class Student {

  private long id;
  private long regNo;
  private String name;
  private String sex;
  private long age;
  private String grade;
  private String major;
  private String classno;
  private Classes classes;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getRegNo() {
    return regNo;
  }

  public void setRegNo(long regNo) {
    this.regNo = regNo;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }


  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }


  public String getClassno() {
    return classno;
  }

  public void setClassno(String classno) {
    this.classno = classno;
  }

  public Classes getClasses() {
    return classes;
  }

  public void setClasses(Classes classes) {
    this.classes = classes;
  }
}
