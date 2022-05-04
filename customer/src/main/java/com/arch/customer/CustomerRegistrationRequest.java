package com.arch.customer;

public record CustomerRegistrationRequest (
        String firstName,
        String lastName,
        String email) {
}
