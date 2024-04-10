package com.itbd.application.constants.enums;

public enum BloodGroupsEnum {
    A_POSITIVE("A+"),
    A_NEGATIVE("A-"),
    B_POSITIVE("B+"),
    B_NEGATIVE("B-"),
    O_POSITIVE("O+"),
    O_NEGATIVE("O-"),
    AB_POSITIVE("AB+"),
    AB_NEGATIVE("AB-");

    private final String value;

    BloodGroupsEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
