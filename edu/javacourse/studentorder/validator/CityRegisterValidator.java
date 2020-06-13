package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerCityRegister;
import edu.javacourse.studentorder.domain.CityRegisterCheckerResponce;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.exception.CityRegisterException;

public class CityRegisterValidator {

    public String hostName;
    protected int port;
    private String login;
    private String password;

    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        try {
            CityRegisterCheckerResponce hans = personChecker.checkPerson(so.getHusband());
            CityRegisterCheckerResponce wans = personChecker.checkPerson(so.getWife());
            CityRegisterCheckerResponce cans = personChecker.checkPerson(so.getChild());
        } catch (CityRegisterException ex) {
            ex.printStackTrace();
        }

        AnswerCityRegister ans = new AnswerCityRegister();
        //ans.success = false;  // проверка в CityRegister не прошла
        return ans;
    }
}
