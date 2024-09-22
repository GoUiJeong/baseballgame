import java.util.ArrayList;
import java.util.Scanner;

public class BaseballGame {
    public int AnswerArr[] = new int[3];  //랜덤으로 생성된 정답
    public int inputArr[] = new int[3]; // 입력 받을 값
    public int playCount = 0;// 정답시도 횟수
    public int ball = 0;
    public int strike = 0;

    // 객체 생성시 정답을 만들도록 함
    public BaseballGame() {
        for (int i = 0; i < AnswerArr.length; i++) {         //랜덤 정답 숫자 생성
            AnswerArr[i] = (int) (Math.random() * 9 + 1);
            for (int j = 0; j < i; j++) {                    //중복 확인 제거
                if (AnswerArr[j] == AnswerArr[i]) {
                    i--;
                    break;
                }
            }
        }
        //랜덤 숫자 3개  확인하기
        for (int x : AnswerArr) {
            System.out.print(x);
        }
    }

    public void play() {    // 입력받아서 두 배열 비교하고 계산, 정답 비교
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("0~9 사이의 정수 3개를 입력하세요."); // 값을 입력 받음
            for (int i = 0; i < inputArr.length; i++) {
                inputArr[i] = sc.nextInt();
                for (int j = 0; j < i; j++) {
                    if (inputArr[j] == inputArr[i]) {
                        System.out.println("중복된 값을 입력 할 수 없습니다.");
                        i--;
                    }
                }
            }
            ball = 0;
            strike = 0;
            for (int i = 0; i < AnswerArr.length; i++) {
                for (int j = 0; j < inputArr.length; j++) {
                    if (AnswerArr[i] == inputArr[j] && i != j) {
                        ball ++;
                    } else if (AnswerArr[i] == inputArr[j] && i == j) {
                        strike ++;
                    }
                }
            }
            System.out.println("볼: " + ball + ", 스트라이크: " + strike); //힌트출력
            if(strike == 3) {
                System.out.println("정답입니다!");
                System.out.println("1.게임시작 2.결과조회 3.게임종료");
                String check = sc.next();
            }

            playCount += 1;  //시도 횟수 카운트
            System.out.println(playCount);
        }
    }
}

