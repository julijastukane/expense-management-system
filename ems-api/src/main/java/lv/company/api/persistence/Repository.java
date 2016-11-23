package lv.company.api.persistence;

import java.util.List;

public interface Repository<T> {
    Long executeAdd(Student student);

    T executeGet(Long id);

    void executeUpdate(Long studentId, Integer columnName, Object columnValue);

    void executeDelete(Student student);

    List<T> executeGetAll();
}
