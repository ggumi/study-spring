package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository{
    // JpaRepository를 상속받으면 springDataJpa가 SpringDataJpaMemberRepository의 구현체를 자동으로 만들어서 빈에 등록
    // 인터페이스가 인터페이스를 구현받을때는 implements대신 extends 사용함
    @Override
    Optional<Member> findByName(String name);
}
