package day3;

public class TeacherApp {
public static void main(String[] args) {
	Cteacher ct = new Cteacher();
	JavaTeacher jt = new JavaTeacher();
	PythonTeacher pt = new PythonTeacher();
	
	Institute i = new Institute();
	i.acceptTeacher(ct);
	i.acceptTeacher(jt);
	i.acceptTeacher(pt);
}
}
