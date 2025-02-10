package task_0208;
//영어 단어의 뜻 맞추기 게임을 만들어 보자. 영어 단어와 한글 단어로 구성되는 Word 클래스를 작성
//하고 프로그램 내에서 미리 여러 개의 Word 객체를 Vector<Word> 컬렉션에 삽입해둔다. 그리고 다음
//결과와 같이 랜덤하게 사용자에게 문제를 던진다. 벡터 내에 정답이 아닌 단어를 랜덤하게 3개 선택하고
//정답과 함께 4개의 보기를 출력한다.
//----------------------------------------------------
//********** 영어 단어 테스트 프로그램 ************
//영어단어의 테스트를 시작합니다. -1을 입력하면 종료합니다.
//단어 테스트 :1, 단어 삽입 :2, 종료 :3 >> 1
//현재 17개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다
//painting?
// (1) 그림 (2) 감정 (3) 아기 (4) 오류 :>1
// Excellent !!
// bear?
// (1) 사회 (2) 인형 (3) 감정 (4) 곰 :>4
// Excellent !!
// eye?
// (1)아기 (2)보기 (3)사진 (4)눈 :>2
// No !!
// socienty?
// (1) 조각상 (2) 눈  (3) 사회 (4) 거래 :> 가나
//숫자를 입력하세요 !!
// animal?
// (1) 사회 (2) 그림 (3) 동물 (4) 눈 :>-1
//영어단어 테스트를 종료합니다.
//단어 테스트 : 1, 단어 삽입 : 2,  종료 : 3>>2
//영어 단어에 그만을 입력하면 입력을 종료합니다.
//영어 한글 입력>> flag 깃발
//영어 한글 입력>> friend 친구
//영어 한글 입력>> computer 컴퓨터
//영어 한글 입력>> imagine 상상
//영어 한글 입력>> simle 웃음
//영어 한글 입력>> 그만
//단어 테스트 : 1, 단어 삽입 : 2,  종료 : 3>>1
//현재 22개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.
// painting?
// (1) 그림 (2) 감정 (3) 아기 (4) 오류 :>1
// Excellent !!
// flag?
// (1) 사회 (2) 인형 (3) 감정 (4) 깃발 :>4
// Excellent !!
// eye?
// (1)아기 (2)보기 (3)사진 (4)눈 :>-1
// Excellent !!
//단어 테스트 : 1, 단어 삽입 : 2,  종료 : 3>>3
//영어단어 게임 종료합니다

import java.util.*;

class Word{
    private String englishWord;
    private String koreanWord;

    //생성자
    public Word(String englishWord, String koreanWord) {
        this.englishWord = englishWord;
        this.koreanWord = koreanWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }
    public String getKoreanWord() {
        return koreanWord;
    }
}

public class WordTestGame {
    private static Vector<Word> wordList = new Vector<>(); //단어 목록을 저장할 백터
    private static Scanner sc = new Scanner(System.in);

    //단어 목록을 미리 초기화
    static{
        wordList.add(new Word("painting","그림"));
        wordList.add(new Word("bear","곰"));
        wordList.add(new Word("english","영어"));
        wordList.add(new Word("korean","한글"));
        wordList.add(new Word("game","게임"));
        wordList.add(new Word("eye","눈"));
        wordList.add(new Word("apple","사과"));
        wordList.add(new Word("icecream","아이스크림"));
        wordList.add(new Word("baby","아기"));
        wordList.add(new Word("setting","설정"));
    }
    public static void main(String[] args) {
        System.out.println("********** 영어 단어 테스트 프로그램 ************");
        while (true) {
            System.out.print("단어 테스트 :1, 단어 삽입 :2, 종료 :3 >> ");
            int choice = sc.nextInt();
            sc.nextLine(); // 개행 문자 처리

            switch (choice) {
                case 1:
                    startWordTest();
                    break;
                case 2:
                    insertNewWords();
                    break;
                case 3:
                    System.out.println("영어단어 게임 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 숫자를 입력하세요!");
            }
        }
    }

    private static void startWordTest() {
        System.out.println("현재 " + wordList.size() + "개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.");
        Random rand = new Random();
        
        while (true) {
            Word word = wordList.get(rand.nextInt(wordList.size()));
            System.out.println(word.getEnglishWord() + "?");
            
            List<String> choices = new ArrayList<>();
            choices.add(word.getKoreanWord());
            
            while (choices.size() < 4) {
                Word randomWord = wordList.get(rand.nextInt(wordList.size()));
                if (!choices.contains(randomWord.getKoreanWord())) {
                    choices.add(randomWord.getKoreanWord());
                }
            }
            
            Collections.shuffle(choices);
            
            for (int i = 0; i < choices.size(); i++) {
                System.out.println("(" + (i + 1) + ") " + choices.get(i));
            }
            
            System.out.print(":> ");
            if (!sc.hasNextInt()) {
                System.out.println("숫자를 입력하세요 !!");
                sc.next(); // 잘못된 입력 스킵
                continue;
            }
            int answer = sc.nextInt();
            sc.nextLine();
            
            if (answer == -1) {
                System.out.println("영어단어 테스트를 종료합니다.");
                break;
            }
            
            if (answer >= 1 && answer <= 4) {
                if (choices.get(answer - 1).equals(word.getKoreanWord())) {
                    System.out.println("Excellent !!");
                } else {
                    System.out.println("No !!");
                }
            } else {
                System.out.println("잘못된 번호입니다.");
            }
        }
    }

    private static void insertNewWords() {
        System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
        
        while (true) {
            System.out.print("영어 한글 입력>> ");
            String english = sc.next();
            
            if (english.equals("그만")) break;
            
            String korean = sc.next();
            wordList.add(new Word(english, korean));
        }
    }
}