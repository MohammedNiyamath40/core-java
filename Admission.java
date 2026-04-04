class Admission{
String studentName;
String dob;
long phNo;
int classNo;

public Admission(String studentName, String dob, long phNo, int classNo){
this.studentName = studentName;
this.dob = dob;
this.phNo = phNo;
this.classNo = classNo;
}
public void newAdmission(){
System.out.println(studentName);
System.out.println(dob);
System.out.println(phNo);
System.out.println(classNo);
}
}