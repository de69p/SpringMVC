package homework;

import homework.config.ConfigApp;
import homework.domain.Phone;
import homework.domain.Student;
import homework.service.CrudService;
import homework.service.impl.PhoneServiceImpl;
import homework.service.impl.StudentServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);

        CrudService<Student> studentService = context.getBean(StudentServiceImpl.class);
        CrudService<Phone> phoneService = context.getBean(PhoneServiceImpl.class);

//        Phone phone = Phone.builder()
//                .number("+1-212-213-2122")
//                .build();
//        Phone phone1 = Phone.builder().number("+1-212-213-4441").build();

//        Student student = Student.builder()
//                .firstName("Keanu")
//                .lastName("Reaves")
//                .phones(List.of(phone1, phone)).build();

//        Student student = studentService.findById(1);
//        Student student1 = studentService.findById(6);

//        phone.setStudent(student);
//        phone1.setStudent(student);
//
//        studentService.update(student);

//        phoneService.update(phone);
//        phoneService.update(phone1);



    }
}
