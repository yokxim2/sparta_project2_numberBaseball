숫자야구 게임 만들기

진행 중 어려웠던 점, 개발 일기 등은 트러블슈팅 TIL 글에 모두 적어 놨습니다.

== 필수 기능 ==

Lv 1

- 사용자로부터 입력값 받기
    - 맞춰야 하는 숫자는 3자리 숫자다.
    - 각 자리는 1~9 사이의 숫자로만 구성되어 있고,
    - 동일한 숫자는 사용할 수 없다.
    - 문자는 입력할 수 없다.
- 정답 숫자는 랜덤(Random) 메서드를 사용해서 생성해야 한다.
- 결과값 출력하기(입력값과 정답 비교 시)
    - 스트라이크: 같은 자리에 같은 숫자가 있음
    - 볼: 숫자는 같지만, 자리는 다름
    - 아웃: 숫자도, 자리도 다름
    - 3 스트라이크일 시 축하 메시지와 함께 그 게임 종료
- 게임을 이어서 할 수 있도록 해야 함

Lv 2

- 입력값이 유효한지 검사
- 결과 값 출력시 옵션 제공
    
    [ 1. 게임 시작하기 / 2. 게임 기록 보기 / 3. 종료하기]
    
    - 게임 기록 보기는 옵션만 만들고 구현은 안해도 됨


== 도전 기능 ==

Lv 3

- 경기 기록 표시 기능 추가 [Level 2에서 미구현한 기능]
    - 현재 프로그램 실행 후 몇번째 게임을 진행중인지
    - 해당 게임에서 몇번째 시도만에 정답을 맞혔는지
    - Format:
        
        < 게임 기록 보기 >
        
        1번째 게임 : 시도 횟수 - 14
        
        2번째 게임 : 시도 횟수 - 9
        
        3번째 게임 : 시도 횟수 - 12
        
        …
        
- 출력 개선
    - 옵션 선택 시 1 ~ 3 외 숫자를 눌렀을 때 오류 메시지 노출

Lv 4

- 게임 난이도 조절
    - 옵션 0번 추가; “자리수 설정”
    - 3~5 사의 숫자를 입력해서 정답의 자릿수를 결정할 수 있도록 해야 함
    - 자릿수를 입력 시 자동으로 게임 시작



Full class diagram

![NumberBaseball_detailed (1)](https://github.com/user-attachments/assets/a5e9d718-0a10-486e-9de1-8b87f6913111)

TroubleShooting TIL Link:
https://ultra-comb-ede.notion.site/Java-09-12-24-59b198245b79495ab6c7cb6202ecea64?pvs=4
