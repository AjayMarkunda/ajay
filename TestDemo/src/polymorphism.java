
class School {
  public void work() {
    System.out.println("The School is attened by teachers and students");
  }
}

class Teacher extends School {
  public void work() {
    System.out.println("teacher teaches lessions to students");
  }
}

class Student extends School {
  public void work() {
    System.out.println("the student studies lessions taught by teacher");
  }
}
class polymorphism {
	  public static void main(String[] args) {
	    School sch = new School();  
	    School teach = new Teacher();  
	    School stu = new Student();  
	    sch.work();
	    teach.work();
	    stu.work();
	  }
	}