package com.example.GoogleInterview;

import java.util.HashSet;
import java.util.Set;

public class Unique_Email_Addresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> set1 = new HashSet();
        for (int i = 0; i < emails.length; i++) {
            String email = emails[i];
            String firstName = email.substring(0, email.indexOf('@'));
            String lastName = email.substring(email.indexOf('@') + 1, email.length());
            StringBuffer strbur = new StringBuffer();
            for (int j = 0; j < firstName.length(); j++) {
                if (firstName.charAt(i) == '.')
                    continue;
                if (firstName.charAt(i) == '+')
                    break;
                strbur.append(firstName.charAt(i));

            }
            if (!set1.contains(strbur.toString() + "@" + lastName))
            set1.add(strbur.toString() + "@" + lastName);
        }
        return set1.size();
    }
}
