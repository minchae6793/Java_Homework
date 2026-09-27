import java.util.Scanner;

class Student {
    int studentID;
    String name;
    String major;
    long phoneNumber;

    int getStudentID(){
        return studentID;
    }
    void setStudentID(int ID){
        studentID = ID;
    }
    String getName(){
        return name;
    }
    void setName(String NAME){
        name = NAME;
    }
    String getMajor() {
        return major;
    }
    void setMajor(String MAJOR){
        major = MAJOR;
    }
    Long getPhoneNumber() {
        return phoneNumber;
    }
    void setPhoneNumber(long NUM){
        phoneNumber = NUM;
    }
}

public class Homework2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for(int i=0; i<3; i++) {
            students[i] = new Student();

            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            students[i].setStudentID(sc.nextInt());
            students[i].setName(sc.next());
            students[i].setMajor(sc.next());
            students[i].setPhoneNumber(sc.nextLong());
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        for(int i=0;i<3;i++){
            String phone = Long.toString(students[i].getPhoneNumber());
            String phonePrint = "0" + phone.substring(0,2) + "-" + phone.substring(2,6) + "-" + phone.substring(6);
            System.out.printf("%d번째 학생: %d %s %s %s\n", i+1, students[i].getStudentID(), students[i].getName(), students[i].getMajor(), phonePrint);
        }
    }
}
