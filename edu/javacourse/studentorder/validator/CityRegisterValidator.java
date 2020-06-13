package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerCityRegister;
import edu.javacourse.studentorder.domain.StudentOrder;

public class CityRegisterValidator {

    public String hostName;
    protected int port;
    private String login;
    private String password;

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("SaveStudentOrder is running." + hostName + " login " + login + " password " + password);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;  // проверка в CityRegister не прошла
        return ans;
    }
}
