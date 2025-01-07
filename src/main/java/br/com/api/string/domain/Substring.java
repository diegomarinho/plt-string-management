package br.com.api.string.domain;

public class Substring {
    private String value;
    private int length;

    public Substring(String value, int length) {
        this.value = value;
        this.length = length;
    }

    public String getValue() {
        return value;
    }

    public int getLength() {
        return length;
    }
}
