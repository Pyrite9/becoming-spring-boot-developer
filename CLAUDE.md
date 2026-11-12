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

## 학습 진행 방식

- 실습 코드는 관리자가 직접 작성한다. Claude는 책의 코드를 대신 써넣지 않는다
- 막혔을 때는 답을 바로 주지 말고 힌트 → 원인 좁히기 → 해결 순으로 단계별로 이끈다
- 의존성은 책에서 해당 장에 도달했을 때 추가한다. 미리 넣지 않는다
- 장 하나를 끝낼 때마다 커밋한다 (예: `ch02: 스프링 부트 3 시작하기`)
- OAuth client secret, JWT secret 같은 값은 커밋하지 않는다
