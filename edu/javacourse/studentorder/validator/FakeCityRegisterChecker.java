package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.CityRegisterCheckerResponce;
import edu.javacourse.studentorder.domain.Person;

public class FakeCityRegisterChecker implements CityRegisterChecker
{
    public CityRegisterCheckerResponce checkPerson(Person person) {
        return null;
    }
}