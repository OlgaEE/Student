package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.CityRegisterCheckerResponce;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.exception.CityRegisterException;

public interface CityRegisterChecker
{
    CityRegisterCheckerResponce checkPerson(Person person) throws CityRegisterException;
}
