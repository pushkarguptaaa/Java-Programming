package JavaFundamentals;

class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + "]";
    }

    
    
}

public class StringArray {
    public static void main(String[] args) {
        String s= new String("Pushkar");
        s=s+" Gupta";
        System.out.println(s);

        StringBuffer s1= new StringBuffer("Pushkar");
        s1.append(" Gupta");
        System.out.println(s1);

        int nums[] = {3,5,7,1};

        for(int i=0; i<nums.length;i++){
            System.out.println(nums[i]);
        }

        for(int i:nums){
            System.out.println(i);
        }

        Student students[]= new Student[2];
        students[0]= new Student(4, "Pushkar");
        students[1]= new Student(3, "Push");
        
        for(Student st:students){
            System.out.println(st);
        }
    }
}
