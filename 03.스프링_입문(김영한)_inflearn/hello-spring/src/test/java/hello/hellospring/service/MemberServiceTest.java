package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import hello.hellospring.serviece.MemberService;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService;
    MemoryMemberRepository repository;

    @BeforeEach
    public void beforeEath() {
        repository = new MemoryMemberRepository();
        memberService = new MemberService(repository);
    }

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    void 회원가입() {
        //given
        Member member = new Member();
        member.setName("hello");

        //when
        Long saveId = memberService.join(member);

        //then
        Member findMember = memberService.findOne(saveId).get();
        Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    void 중복_회원_예외() {
        //given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        //when
        memberService.join(member1);
        //람다식
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> memberService.join(member2));

        Assertions.assertThat(e.getMessage()).isEqualTo("중복된 이름 입니다.");
//        try {
//            memberService.join(member2);
//            fail();
//        } catch (IllegalArgumentException e) {
//            Assertions.assertThat(e.getMessage()).isEqualTo("중복된 이름 입니다.");
//        }

        //then

    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}