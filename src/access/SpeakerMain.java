package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        //speaker.volume = 200;
        speaker.showVolume();
    }
}
    // 접근 제어자의 핵심은 속성과 기능을 외부로 부터 숨기는 것
