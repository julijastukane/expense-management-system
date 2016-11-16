package lv.company.api.controllers.students;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping
    public ResponseEntity<?> getListOfStudents() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}/name/{name}")
    public ResponseEntity<?> getStudentByID(@PathVariable Long id, @PathVariable(name = "name") String studentName) {
        return ResponseEntity.ok(id + " " + studentName);
    }

    @PostMapping
    public ResponseEntity<?> createNewStudent() {
        return ResponseEntity.ok().build();
    }

    @PutMapping("{ID}")
    public ResponseEntity<?> updateStudent() {
        return ResponseEntity.created(URI.create("")).build();
    }

    @DeleteMapping("{ID}")
    public ResponseEntity<?> deleteDeactivateStudentsRecord() {
        return ResponseEntity.ok().build();
    }
}
