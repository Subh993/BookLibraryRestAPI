package com.library.exception;

import javax.persistence.EntityNotFoundException;

public class DataNotFound extends EntityNotFoundException {
    public DataNotFound(String message) {
        super(message);
    }
}