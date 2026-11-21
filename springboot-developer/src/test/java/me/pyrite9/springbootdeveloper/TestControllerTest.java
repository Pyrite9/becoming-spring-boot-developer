package me.pyrite9.springbootdeveloper;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest     // 테스트용 애플리케이션 컨텍스트 작성
@AutoConfigureMockMvc   // MockMvc 생성 및 자동 구성
public class TestControllerTest {
    @Autowired
    protected MockMvc mockMvc;

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private WebApplicationContext context;

    @BeforeEach     // 테스트 실행 전 실행하는 메서드
    public void mockMvcSetup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(context)
                .build();
    }

    @AfterEach      // 테스트 실행 후 실행하는 메서드
    public void cleanUp() {
        memberRepository.deleteAll();
    }

    @DisplayName("getAllMembers: Member 조회에 성공한다.")
    @Test
    public void getAllMembers() throws Exception {
        // given
        final String url = "/test";
        Member savedMember = memberRepository.save(new Member(null, "홍길동"));

        // when

        // get(url) -> GET 요청을 만든다 (설계)
        // accept -> 리턴 형태 결정
        // mockMvc.perform -> 실제로 요청 보내기
        final ResultActions result = mockMvc.perform(get(url)
                .accept(MediaType.APPLICATION_JSON));

        // then
        // 응답의 조건검사
        // ok(200)인가?
        // id는 savedMember의 id인가?
        // name은 savedMember의 name인가?
        result
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value(savedMember.getId()))
                .andExpect(jsonPath("$[0].name").value(savedMember.getName()));

        // 한줄 정리
        // perform : 요청을 만들어 보내고 ,검사할 수 있는 결과 손잡이 반환
        // andExpect : 그 결과가 기대와 맞는지 하나씩 검증하고, 틀리면 테스트 실패
    }
}
