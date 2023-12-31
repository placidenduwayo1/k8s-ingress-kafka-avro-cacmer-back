package fr.placide.cacmerbsmsmovement.domain.exceptions;

import lombok.Getter;

@Getter
public enum ExceptionMsg {
    REMOTE_ACCOUNT_API("Remote Account API Unreachable Exception"),
    REMOTE_ACCOUNT_API_TYPE("Remote Saving Account API Type Not Accepted Exception"),
    RISK_EVALUATION("Remote Account Balance Not Enough to undergo that operation Exception"),
    REMOTE_CUSTOMER_API("Remote Customer API Unreachable Exception"),
    REMOTE_CUSTOMER_NOT_FOUND("Remote Customer API Not Found Exception"),
    REMOTE_CUSTOMER_STATUS("Remote Customer Status Unauthorized Exception"),
    MVT_FIELDS_INVALID("Movement Fields Invalid Exception"),
    MVT_ASSIGNED_ACCOUNT("Movement Already Assigned Account Exception"),
    MVT_NOT_FOUND("Movement Not Found Exception"),
    MVT_SENS("Movement Sens Invalid Exception"),
    REMOTE_RISK_EVALUATOR("Remote Risk Evaluator Service API Unreachable Exception");
    private final String msg;

    ExceptionMsg(String msg) {
        this.msg = msg;
    }
}
