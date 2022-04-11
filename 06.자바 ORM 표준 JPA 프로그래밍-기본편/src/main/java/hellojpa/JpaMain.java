package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf =  Persistence.createEntityManagerFactory("hello");

        // 엔티티 등록
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        //엔티티 매니저는 데이터 변경시 트랜잭션을 시작
        tx.begin(); // [트랜잭션] 시작


        try {

            // 비영속
            Member member = new Member();
            member.setId(2L);
            member.setName("HelloB");

            //영속 : DB저장 X, 1차 캐시에 저장
            em.persist(member);

            // 1차캐시에서 조회
            Member findMember = em.find(Member.class, "member1");

            // DB에서 조회
            Member findMember2 = em.find(Member.class, "member2");

            em.persist(findMember);
            em.persist(findMember2);
            //여기까지 INSERT SQL을 데이터베이스에 보내지 않음
            // 커밋하는 순간 데이터베이스에 INSERT SQL을 보낸다.
            tx.commit(); // [트랜잭션] 커밋

        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        em.close();

        emf.close();
    }
}
