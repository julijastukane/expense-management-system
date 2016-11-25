package lv.company.api.persistence;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DBStudentRepository implements Repository<Student> {
    public enum StudentColumns {
        student_id,
        form_name,
        student_name,
        student_surname,
        date_of_birth,
        student_email,
        active,
        blocked,
        last_login_date
    }

    private final Connection connection;

    public DBStudentRepository(Connection conn) {
        this.connection = conn;
    }

    Savepoint savepoint = null;

    @Override
    public Long executeAdd(Student student) {

        PreparedStatement ps = null;

        final String INSERT_SQL = "INSERT INTO student " +
                " (form_name, " +
                "  student_name, " +
                "  student_surname, " +
                "  date_of_birth, " +
                "  student_email, " +
                "  active, " +
                "  blocked, " +
                "  last_login_date)" +
                " VALUES (?,?,?,?,?,?,?,?)";
        try {
            // Set auto commit transaction to false to able to perform rollback in case of error
            connection.setAutoCommit(false);

            // Saving point to perform rollback in case of exception
            savepoint = connection.setSavepoint();

            ps = connection.prepareStatement(INSERT_SQL);

            // Set parameters to prepared statement. Indexing begins with 1 !!!

            ps.setString(1, student.getFormName());
            ps.setString(2, student.getName());
            ps.setString(3, student.getSurname());
            ps.setDate(4, (Date) student.getDateOfBirth());
            ps.setString(5, student.getStudentEmail());
            ps.setBoolean(6, student.getActive());
            ps.setBoolean(7, student.getBlocked());
            ps.setDate(8, (Date) student.getLastLoginDate());
            // Executing query
            ps.executeUpdate();
            // Clear parameters only after statement is executed!!!
            ps.clearParameters();

            // Finish transaction with saving data in to data base.
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            // Perform rollback with save point received in the beginning of the transaction
            rollBackToSavePoint(savepoint);
        } finally {
            // Method to release statement resource
            releaseStatement(ps);
        }
        return 1L;
    }


    @Override
    public Student executeGet(Long id) {
        Student student = new Student();
        PreparedStatement ps = null;
        ResultSet resultSet;
        final String SELECT_SQL = "SELECT * FROM STUDENT " +
                "WHERE STUDENT_ID = ?";

        try {
            ps = connection.prepareStatement(SELECT_SQL);
            ps.setLong(1, id);
            resultSet = ps.executeQuery();
            resultSet.next();
            Student studentById = new Student();
            Long studentId = resultSet.getLong("student_id");
            studentById.setId(studentId);
            String studentName = resultSet.getString("student_name");
            studentById.setName(studentName);
            String formName = resultSet.getString(2);
            studentById.setFormName(formName);
            String studentSurname = resultSet.getString(4);
            studentById.setSurname(studentSurname);
            Date dateOfBirth = resultSet.getDate(5);
            studentById.setDateOfBirth(dateOfBirth);
            String studentsEmail = resultSet.getString(6);
            studentById.setStudentEmail(studentsEmail);
            Boolean active = resultSet.getBoolean(7);
            studentById.setActive(active);
            Boolean blocked = resultSet.getBoolean(8);
            studentById.setBlocked(blocked);
            Date studentLoginDate = resultSet.getDate(9);
            studentById.setLastLoginDate(studentLoginDate);

            ps.clearParameters();
            return studentById;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Method to release statement resource
            releaseStatement(ps);
        }
        return null;
    }


    @Override
    public void executeUpdate(Long studentId, Integer studentColumns, Object columnValue) {
        StudentColumns studentColumns1 = StudentColumns.values()[studentColumns];
        PreparedStatement ps = null;
        final String UPDATE_SQL = "UPDATE STUDENT SET " + studentColumns1 + " = ? " +
                " WHERE STUDENT_ID= ?";
        try {
            connection.setAutoCommit(false);
            savepoint = connection.setSavepoint();

            ps = connection.prepareStatement(UPDATE_SQL);

            System.out.println("Column name: " + studentColumns1 + " Value :" + columnValue);

            ps.setObject(1, columnValue);
            ps.setLong(2, studentId);
            // Executing query
            ps.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            System.out.println(UPDATE_SQL);
            e.printStackTrace();
        } finally {
            releaseStatement(ps);
        }
    }

    @Override
    public void executeDelete(Student student) {

    }

    @Override
    public List<Student> executeGetAll() {
        Statement ps = null;
        ResultSet resultSet;

        final String SELECT_ALL_SQL = "SELECT * FROM STUDENT";
        List<Student> studentsList = new ArrayList<>();
        try {
            ps = connection.createStatement();
            resultSet = ps.executeQuery(SELECT_ALL_SQL);
            while (resultSet.next()) {
                Student studentAll = new Student();
                Long studentId = resultSet.getLong("student_id");
                studentAll.setId(studentId);
                String studentName = resultSet.getString("student_name");
                studentAll.setName(studentName);
                String formName = resultSet.getString(2);
                studentAll.setFormName(formName);
                String studentSurname = resultSet.getString(4);
                studentAll.setSurname(studentSurname);
                Date dateOfBirth = resultSet.getDate(5);
                studentAll.setDateOfBirth(dateOfBirth);
                String studentsEmail = resultSet.getString(6);
                studentAll.setStudentEmail(studentsEmail);
                Boolean active = resultSet.getBoolean(7);
                studentAll.setActive(active);
                Boolean blocked = resultSet.getBoolean(8);
                studentAll.setBlocked(blocked);
                Date studentLoginDate = resultSet.getDate(9);
                studentAll.setLastLoginDate(studentLoginDate);
                studentsList.add(studentAll);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Method to release statement resource
            releaseStatement(ps);
        }

        return studentsList;
    }

    private void releaseStatement(Statement ps) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                System.out.println("Failed to release statement");
            }
        }
    }

    private void rollBackToSavePoint(Savepoint savepoint) {
        if (savepoint != null) {
            try {
                connection.rollback(savepoint);
            } catch (SQLException e1) {
                System.out.println("Failed to roll back transaction");
            }
        }
    }
}
