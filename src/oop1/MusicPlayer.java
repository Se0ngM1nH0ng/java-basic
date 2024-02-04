package oop1;

public class MusicPlayer {

    // 음악플레이어 안 내부를 만드는 개발자
    // 객체지향프로그래밍 에서는 속성과 기능을 잘 하나로 뭉쳐서 내부에서 어떻게 잘 만들어 놓지가 더 중요함
    // 안에 속성과 기능을 준비하여 음악플레이어를 호출하는 개발자가 잘 사용할 수 있도록 캡슐처럼 클래스안에 잘 구성되어있다. >> 캡슐화
    int volume = 0;
    boolean isOn = false;


     void on(){ // 자기 자신의 데이터를 쓰기 때문에 input 값을 다 빼준다.
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
     void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

     void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }
     void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

     void showStatus(){
        System.out.println("음악 플레이어 상태 확인");
        if(isOn){
            System.out.println("음악 플레이어 ON , 볼륨: " + volume);
        }else{
            System.out.println("음악 플레이어 OFF");
        }
    }
}
