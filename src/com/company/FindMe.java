package com.company;

public class FindMe {

    public static void foundStudents(String[] fullStudentList, String[] inputList) {
        for (String input : inputList) {
            String ans = null;
            int count = 0;

            for (String fromFull:fullStudentList) {
                if (fromFull.equals(input)) {
                    ans = "Found " + input + "at index: " + count;
                    break;
                }
                count++;
            }

            if (ans != null) {
                System.out.println(ans);
            } else {
                System.out.println("Not Found");
            }


        }
    }
}
