package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.*;

import java.time.LocalDate;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder s = buildStudentOrder(10);
//        StudentOrder so = new StudentOrder();
//        long ans = saveStudentOrder(so);
//        System.out.println(ans);
    }
    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder");
        return answer;
    }

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        so.setMarriageCertificateId("" + (123456000 + id));
        so.setMarriageDate(LocalDate.of(2016, 7, 4));
        so.setMarriageOffice("Отдел ЗАГС");

    Address address = new Address("195000", "Заневский пр.", "12", "", "142");

        // Муж
        Adult husband = new Adult("Петров", "Виктор", "Сергеевич", LocalDate.of(1997, 8, 24));
        husband.setPassportseria("" + (1000 + id));
        husband.setPassportNumber("" + (100000 + id));
        husband.setIssuedate(LocalDate.of(2017, 9, 15));
        husband.setIssuedepartment("Отдел милиции №" + id);
        husband.setStudentId("" + (100000 + id));
        husband.setAddress(address);
        // Жена
        Adult wife = new Adult("Петрова", "Вероника", "Алекссевна", LocalDate.of(1998, 3, 12));
        wife.setPassportseria("" + (2000 + id));
        wife.setPassportNumber("" + (200000 + id));
        wife.setIssuedate(LocalDate.of(2018, 4, 5));
        wife.setIssuedepartment("Отдел милиции №" + id);
        wife.setStudentId("" + (200000 + id));
        wife.setAddress(address);
        // Ребенок
        Child child = new Child("Петрова", "Ирина", "Викторовна", LocalDate.of(2018, 6, 29));
        child.setCertificateNumber("" + (300000 + id));
        child.setIssueDate(LocalDate.of(2018, 7, 19));
        child.setIssueDepartment("ОТдел ЗАГС №" + id);
        child.setAddress(address);

        so.setHusband(husband);
        so.setWife(wife);
        so.setChild(child);

        return so;
    }
}

