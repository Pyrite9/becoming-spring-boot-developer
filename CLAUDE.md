# Spring Boot 학습 공간

"스프링 부트 3 백엔드 개발자 되기"(2판, 신선영) 를 처음부터 다시 따라가는 학습용 저장소다.

## 구조

- `springboot-developer/` — 책의 실습 프로젝트. 책과 같은 이름·패키지(`me.shinsunyoung.springbootdeveloper`)를 쓴다
- IntelliJ에서는 `springboot-developer` 폴더를 연다 (저장소 루트가 아니다)

## 버전 (책과 다르다)

| 항목 | 책(2판) | 이 저장소 |
| --- | --- | --- |
| Spring Boot | 3.2.x | 3.5.16 |
| Java | 17 | 21 (Temurin) |
| Gradle | 8.x | 8.14.7 (wrapper) |

- 책 코드가 그대로 안 돌면 버전 차이를 먼저 의심하고, 원인을 공식 문서에서 확인해 설명한다
- Spring Boot 4.x로는 올리지 않는다 (책 범위 밖)

## 명령

`springboot-developer/` 안에서 실행한다.

- 빌드·테스트: `.\gradlew.bat build`
- 실행: `.\gradlew.bat bootRun` (http://localhost:8080)
- 테스트만: `.\gradlew.bat test`

## 책 내용 참조

- Claude는 책 본문을 갖고 있지 않다. 책에 뭐가 어떤 순서로 나오는지 기억으로 단정하지 않는다
- 전자책(YES24 eBook 뷰어)은 캡처 차단이 걸려 있어 스크린샷으로 읽을 수 없다 (2026-11-12 확인). 다시 시도하지 않는다
- 종이책을 직접 찍은 스캔본이 있으면 `books/` 에 장 단위로 둔다: 사진은 `books/ch02/`, 묶은 PDF는 `books/ch02.pdf`. 있으면 해당 장을 읽고 설명에 쓴다
- `books/` 는 `.gitignore` 대상이다. 저장소가 public이므로 스캔본을 커밋·push하거나 다른 경로로 복사하지 않는다
- 관리자가 현재 장·절과 만들고 있는 것을 알려주고, 필요하면 해당 부분을 요약하거나 작성한 코드를 보여준다
- 예제 코드 대조가 필요하면 저자의 2판 예제 저장소를 기준으로 한다: https://github.com/shinsunyoung/springboot-developer-2rd
- 책 본문을 그대로 옮겨 적지 않는다

## 학습 진행 방식

- 실습 코드는 관리자가 직접 작성한다. Claude는 책의 코드를 대신 써넣지 않는다
- 막혔을 때는 답을 바로 주지 말고 힌트 → 원인 좁히기 → 해결 순으로 단계별로 이끈다
- 절이 끝나면 질문 몇 개로 이해했는지 확인한다
- 의존성은 책에서 해당 장에 도달했을 때 추가한다. 미리 넣지 않는다
- 장 하나를 끝낼 때마다 커밋한다 (예: `ch02: 스프링 부트 3 시작하기`)
- OAuth client secret, JWT secret 같은 값은 커밋하지 않는다
