import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[숫자 야구 게임에 오신걸 환영합니다.]");

        System.out.println("1.게임시작 2.결과조회 3.게임종료");
        String check = sc.next();

        switch (check) {
            case "1":
                System.out.println("!!!게임을 시작합니다!!!");
                BaseballGame baseballGame = new BaseballGame();
                baseballGame.play();
                break;

            case "2":
                System.out.println("게임 결과 입니다.");

                break;

            case "3":
                System.out.println("게임을 종료합니다.");
                break;

        }
    }
}

