package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import hello.hellospring.serviece.MemberService;

import java.util.List;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository;
    MemberService memberService;

    @BeforeEach
    private void beforeEach() {
        repository = new MemoryMemberRepository();
        memberService = new MemberService(repository);
    }

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring"); //"spring"입력, member에 저장
        repository.save(member); //repository에 member저장

        Member result = repository.findById(member.getId()).get(); //result변수에 repository에서 아이디로 조회한 Member정보를 담는다
//        Assertions.assertEquals(member, result);
        Assertions.assertThat(member).isEqualTo(result); //member와 result 비교
    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName(member1.getName()).get();

        Assertions.assertThat(member1).isEqualTo(result);
    }

    @Test
    public void findAll() {
     Member member1 = new Member();
     member1.setName("springd1");
     repository.save(member1);

    Member member2 = new Member();
    member2.setName("spring2");
    repository.save(member2);

     List<Member> result = repository.findAll();

    Assertions.assertThat(2).isEqualTo(result.size());
    }
}