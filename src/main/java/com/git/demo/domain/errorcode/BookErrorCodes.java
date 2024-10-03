package com.git.demo.domain.errorcode;

public enum BookErrorCodes implements BaseErrorCode {
    BOOK_ID_NULL_OR_EMPTY(Prefix.LIBRARY_BOOK_ERRORS + "01");
    private final String errorCode;

    BookErrorCodes(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String getCode() {
        return errorCode;
    }

    public static class Prefix {
        static final String LIBRARY_BOOK_ERRORS = "library.book.error";
    }
}
