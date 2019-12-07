package lk.kln.swst.springrest.controller;

import lk.kln.swst.springrest.model.Student;

public class StudentController {
    package lk.kln.swst.spring_rest.controller;

import lk.kln.swst.spring_rest.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/students")
    public class StudentController {

        @RequestMapping(method = RequestMethod.GET)
        public Student get() throws  IllegalArgumentException{
            Student student=new Student();
            student.setName("nawee");
            student.setAge(23);
            return  student;
        }

    }

}
