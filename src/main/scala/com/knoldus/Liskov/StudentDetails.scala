package com.knoldus.Liskov

case class StudentDetails(student: Student) {
  def getStudentName:String= student.name
  def getStudentAge:Int= student.age
  def getStudentCourse:String= student.course
  def details() : String = "Name of Student is : " + student.name + "\nAge of the Student is " + student.age + "\nCourse " + student.course

}
