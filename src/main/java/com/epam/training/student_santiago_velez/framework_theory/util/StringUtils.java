package com.epam.training.student_santiago_velez.framework_theory.util;

public class StringUtils {
    public static boolean equalsIgnoreLineBreaks(String str1, String str2) {
        return normalize(str1).equals(normalize(str2));
    }

    private static String normalize(String str) {
        return str == null ? null : str.replaceAll("[\\n\\r]", "").trim();
    }
}
