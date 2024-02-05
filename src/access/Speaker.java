package access;

public class Speaker {
    // 해당 클래스 안에서는 volume 에 접근할 수 있다 .
    // volume 이 100 을 넘지 않는다 , 10 씩 증가 , 10 씩 감소 등등

    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if(volume >= 100){
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        }else{
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown(){
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume(){
        System.out.println("현재음량: " + volume);
    }
}
