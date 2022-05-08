package com.arch.clients.notification;

import lombok.Data;

import java.util.Objects;

public class NotificationRequest {
    private Integer toCustomerId;
    private String toCustomerName;
    private String message;

    public NotificationRequest(
            Integer toCustomerId,
            String toCustomerName,
            String message
    ) {
        this.toCustomerId = toCustomerId;
        this.toCustomerName = toCustomerName;
        this.message = message;
    }

    public Integer toCustomerId() {
        return toCustomerId;
    }

    public String toCustomerName() {
        return toCustomerName;
    }

    public String message() {
        return message;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (NotificationRequest) obj;
        return Objects.equals(this.toCustomerId, that.toCustomerId) &&
                Objects.equals(this.toCustomerName, that.toCustomerName) &&
                Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toCustomerId, toCustomerName, message);
    }

    @Override
    public String toString() {
        return "NotificationRequest[" +
                "toCustomerId=" + toCustomerId + ", " +
                "toCustomerName=" + toCustomerName + ", " +
                "message=" + message + ']';
    }

}
