package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.domain.register.AnswerCityRegister;
import edu.javacourse.studentorder.domain.register.CityRegisterCheckerResponce;
import edu.javacourse.studentorder.exception.CityRegisterException;
import edu.javacourse.studentorder.validator.register.CityRegisterChecker;
import edu.javacourse.studentorder.validator.register.FakeCityRegisterChecker;

public class CityRegisterValidator {

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
            ex.printStackTrace(System.out);
        }

        AnswerCityRegister ans = new AnswerCityRegister();
        //ans.success = false;  // проверка в CityRegister не прошла
        return ans;
    }
}
