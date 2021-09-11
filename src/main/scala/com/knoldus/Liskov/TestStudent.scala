package com.knoldus.Liskov

object TestStudent  {
  val getStudentDetails=(student:Student)=> {
    //StudentDetails(student).details()
    "Name of Student is : " + student.name + "\nAge of the Student is " + student.age + "\nCourse " + student.course

  }
  val printer=(message:String)=>{
    println(message)
  }
  def main(args: Array[String]): Unit = {
    val student = new Student("Gulshan", 23, "MCA")
    val student1 = new Student("Fabeha", 21, "MCA")

    printer(getStudentDetails(student))
    printer(getStudentDetails(student1))
  }

}