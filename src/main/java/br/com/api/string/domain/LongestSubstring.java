package br.com.api.string.domain;

public class LongestSubstring {

    private String value;
    private int length;

    public LongestSubstring(String value, int length) {
        this.value = value;
        this.length = length;
    }

    public String getValue() {
        return value;
    }

    public int getLength() {
        return length;
    }

    public boolean hasValidLength() {
        return length > 0;
    }
}
