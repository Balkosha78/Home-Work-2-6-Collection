package pro.sky.home_work_2_6_collection.Controller.validator;

import org.apache.commons.lang3.StringUtils;

public class EmployeeValidate {
    public static boolean validate(String firstName, String lastName){
        return StringUtils.isAlpha(firstName) && StringUtils.isAlpha(lastName);
    }
}
