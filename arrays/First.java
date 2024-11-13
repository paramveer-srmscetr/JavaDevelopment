
class Student {
    String name;
    int marks;
}

class First {

    public static void main(String[] args) {

        //create the new object student type
        Student s1 = new Student();
        s1.name = "rahul";
        s1.marks = 2;
        Student s2 = new Student();
        s2.name = "ishu";
        s2.marks = 21;
        Student s3 = new Student();
        s3.name = "rasoo";
        s3.marks = 23;
        //System.out.println(s1.name + " " + s1.marks);
        // create array to store the object
        Student s[] = new Student[3];
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        //standard loop
        //   for (Student elem : s) {
        //       System.out.println(elem.name+" "+elem.marks);
        //   }

// formal loop
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i].name + " " + s[i].marks);

        }

    }
}
