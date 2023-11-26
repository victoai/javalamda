package ch12.enum_;

public class Enum사용안함 {
    // 상수 정의
    public static final int SUNDAY = 0;
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;

    public static void main(String[] args) {
        // 상수 사용
        int today = WEDNESDAY;

        // 값 출력
        System.out.println("오늘은" + getDayName(today));

        // 값에 따른 동작
        switch (today) {
            case MONDAY:
                System.out.println("월요일 스케쥴");
                break;
            case WEDNESDAY:
                System.out.println("수요일 스케쥴");
                break;
            case FRIDAY:
                System.out.println("금요일 스케쥴");
                break;
            default:
                System.out.println("잘못입력");
        }
    }
    
    

    // 숫자를 요일 이름으로 변환하는 메서드
    public static String getDayName(int day) {
        switch (day) {
            case SUNDAY:
                return "일";
            case MONDAY:
                return "월";
            case TUESDAY:
                return "화";
            case WEDNESDAY:
                return "수";
            case THURSDAY:
                return "목";
            case FRIDAY:
                return "금";
            case SATURDAY:
                return "토";
            default:
                return "잘못된 요일";
        }
    }
}

