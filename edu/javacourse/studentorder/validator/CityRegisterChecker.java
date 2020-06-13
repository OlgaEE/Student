package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.CityRegisterCheckerResponce;
import edu.javacourse.studentorder.domain.Person;

public interface CityRegisterChecker
{
    CityRegisterCheckerResponce checkPerson(Person person);
}
