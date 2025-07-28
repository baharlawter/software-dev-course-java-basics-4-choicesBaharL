package org.example;

import java.util.HashMap;
import java.util.HashSet;

// For these exercises, you need to declare a single variable
// in each function that uses the appropriate collection type
// (Array, ArrayList, HashSet, HashMap)
//
// You do not need to populate this array or add any additional code.
// If you get stuck, refer to the java basics 4 (arrays and collections) curriculum
public class CollectionChoiceExercises {
    public void MakeColorCollection() {
       String[] colors={"red","green","blue"};

    }

    public void MakeStudentCollection() {
        String[]students={"student1","student2","student3"};
    }

    public void MakeLoggedInUsersCollection() {
        // Create an appropriate collection variable for holding a set of
        // unique logged in usernames where adding a username that's already
        // present is ignored and checking if a user is in the collection can
        // be done very quickly.
        HashSet<String > userNames= new HashSet<>();
        userNames.add("userName1");
        userNames.add("userName2");
        userNames.add("userName3");
        System.out.println(userNames.contains("userName1"));
    }

    public void MakeEmployeeAccessCodesCollection() {
        // Create an appropriate collection variable for holding a set of
        // key-value pairs where they key is an employee name (String) and the
        // value is an employee access code (String.)
        HashMap<String ,String > employeeInfo = new HashMap<>();
        employeeInfo.put("John","23");
        employeeInfo.put("Mark","21");
        employeeInfo.put("Sam","20");

    }
}
