package oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        // 음악 플레이어 켜기
        player.on();
        // 볼륨증가
        player.volumeUp();
        // 볼륨증가
        player.volumeUp();
        // 볼륨 감소
        player.volumeDown();
        // 음악플레이어 상태
        player.showStatus();
        // 음악플레이어 끄기
        player.off();

        // 음악플레이어를 사용하는 개발자는 내부에 뭐가 있는지 몰라도 사용이 가능하다.
    }
}
