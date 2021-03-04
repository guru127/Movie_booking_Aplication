package com.upgrad.mba.validators;

import com.upgrad.mba.dto.CustomerDTO;
import com.upgrad.mba.exceptions.APIException;

public interface CustomerValidator {
    public void validateCustomer(CustomerDTO customerDTO) throws APIException;
}
