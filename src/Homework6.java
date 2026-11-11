// 부모 클래스 Course
class Course {
    private String code;
    private String name;

    // 생성자
    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    // Getter
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}

// Course를 상속받는 OnlineCourse 클래스
class OnlineCourse extends Course {

    public OnlineCourse(String code, String name) {
        super(code, name);
    }

    // toString() 메서드 오버라이딩
    @Override
    public String toString() {
        return "Code: " + getCode() + ", Name: " + getName() + ", Type: Online";
    }
}

// Course를 상속받는 OfflineCourse 클래스
class OfflineCourse extends Course {

    public OfflineCourse(String code, String name) {
        super(code, name);
    }

    // toString() 메서드 오버라이딩
    @Override
    public String toString() {
        return "Code: " + getCode() + ", Name: " + getName() + ", Type: Offline";
    }
}

public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");

        System.out.println(course1);
        System.out.println(course2);
    }
}
