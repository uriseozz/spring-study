# 📙 JPA 학습
<p>자바 OMR 표준 JPA 프로그래밍 - 기본편 / 김영한</p>
<a href="https://www.inflearn.com/course/ORM-JPA-Basic/dashboard">강의 바로가기</a>

### 커리큘럼
1. JPA소개
    1. SQL 중심적인 개발의 문제점
    2. JPA소개
2. JPA 시작하기
    1. Hello JPA - 프로젝트 생성
    2. Hello JPA - 애플리케이션 개발


   </br>


## 1. JPA소개
### 1) SQL 중심적인 개발의 문제점
1. 무한반복, 지루한 코드
2. 패러다임의 불일치 : 객체 vs 관계형데이터베이스
    * 객체는 참조를 사용 : member.getTeam()
    * 테이블은 외래키를 사용 : join on m.team_id = t.team_id
### 2) JPA소개
* Java Persistence API
* 자바 진영의 **ORM** 기술 표준
    * Object-relational mapping(객체 관계 매핑)
    * 객체는 객체대로 설계
    * 관계형 데이터베이스는 관계형 데이터베이스대로 설계
    * ORM 프레임워크가 중간에서 매핑
    * 대중적인 언어에는 대부분 ORM 기술이 존재
* JPA는 애플리케이션과 JDBC 사이에서 동작
* JPA는 표준 명세

## 2. JPA 시작하기
### 1) Hello JPA - 프로젝트 생성
* h2, 메이븐 사용
### 2) Hello JPA - 애플리케이션 개발