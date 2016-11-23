package lv.company.api.controllers.students;

import lv.company.api.persistence.InMemoryStudentRepository;
import lv.company.api.persistence.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    private InMemoryStudentRepository repository;

    @GetMapping
    public ResponseEntity<?> getListOfStudents() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getStudentByID(@PathVariable Long id) {
        Student student = repository.executeGet(id);
        StudentDTO dto = new StudentDTO();
        dto.setName(student.getName());
        dto.setSurname(student.getSurname());
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public ResponseEntity<?> createNewStudent(@RequestBody StudentDTO dto) {
        Student student = new Student();
        student.setName(dto.getName());
        student.setSurname(dto.getSurname());
        Long id = repository.executeAdd(student);
        return ResponseEntity.created(URI.create("http://localhost:8080/students/" + id)).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateStudent() {
        return ResponseEntity.created(URI.create("")).build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteDeactivateStudentsRecord() {
        return ResponseEntity.ok().build();
    }
}
