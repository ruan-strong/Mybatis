package com.rp.pojo;


import java.util.List;

public class Classes {

  private long id;
  private String classno;
  private String name;
  private String major;
  private List<Student> studentList;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getClassno() {
    return classno;
  }

  public void setClassno(String classno) {
    this.classno = classno;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public List<Student> getStudentList() {
    return studentList;
  }

  public void setStudentList(List<Student> studentList) {
    this.studentList = studentList;
  }

}
