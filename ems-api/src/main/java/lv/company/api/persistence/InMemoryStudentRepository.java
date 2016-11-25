package lv.company.api.persistence;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@Service
public class InMemoryStudentRepository implements Repository<Student> {

    private HashMap<Long, Student> studentsMap = new HashMap<>();
    private Long counter = 1L;

    @Override
    public Long executeAdd(Student student) {
        Long key = counter++;
        studentsMap.put(key, student);
        student.setId(key);
        return key;
    }

    @Override
    public Student executeGet(Long id) {
        return studentsMap.get(id);
    }

    @Override
    public void executeUpdate(Long studentId, Integer columnOrd, Object columnValue) {
    }

    @Override
    public void executeDelete(Student student) {
    }

    @Override
    public List<Student> executeGetAll() {
        return Collections.emptyList();
    }
}
