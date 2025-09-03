package web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import domain.Student;

@Controller
public class StudentController {

    @GetMapping("/helloStudents") 
    public String studentGreeting(Model model){
    Student student1 = new Student("Leah", "Hathaway");
    Student student2 = new Student("John", "Levy");
    Student student3 = new Student("Harry", "Smith");

    List<Student> students = new ArrayList<Student>();
    students.add(student1);
    students.add(student2);
    students.add(student3);

    model.addAttribute("students", students);

    return "helloStudents";
    }

}
