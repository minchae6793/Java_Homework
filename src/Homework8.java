import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        // 1. ID와 비밀번호를 저장할 해시맵 생성 및 데이터 저장
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("myId", "myPass");
        map.put("myId2", "myPass2");
        map.put("myId3", "myPass3");

        Scanner sc = new Scanner(System.in);

        // 2. 로그인에 성공할 때까지 계속 반복
        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = sc.nextLine().trim(); // 한 줄 입력받고 앞뒤 공백 제거

            // 입력한 ID가 해시맵에 없는 경우
            if (!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                System.out.println(); // 출력 예시처럼 한 줄 띄우기
            }
            // 입력한 ID가 해시맵에 존재하는 경우
            else {
                System.out.print("password : ");
                String password = sc.nextLine().trim(); // 비밀번호도 앞뒤 공백 제거

                // 저장된 비밀번호와 입력한 비밀번호가 같은지 비교
                if (map.get(id).equals(password)) {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break; // 로그인 성공 시 반복문 종료
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                    System.out.println(); // 출력 예시처럼 한 줄 띄우기
                }
            }
        }

        sc.close();
    }
}