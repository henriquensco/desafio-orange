package br.com.zup.OrangeTalents.handler;

public class ErrorDetails {

    private Integer statusCode;
    private String message;

    public ErrorDetails(Integer statusCode, String message) {
        super();
        this.statusCode = statusCode;
        this.message = message;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }
}