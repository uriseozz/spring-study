# ๐์คํ๋ง ์๋ฌธ ๊ฐ์ ํ์ต
<p>์ฝ๋๋ก ๋ฐฐ์ฐ๋ ์คํ๋ง ๋ถํธ, ์น MVC, DB ์ ๊ทผ ๊ธฐ์  / ๊น์ํ</p>
<a href="https://www.inflearn.com/course/์คํ๋ง-์๋ฌธ-์คํ๋ง๋ถํธ/dashboard">๊ฐ์ ๋ฐ๋ก๊ฐ๊ธฐ</a>


### ์ปค๋ฆฌํ๋ผ
1. ํ๋ก์ ํธ ํ๊ฒฝ์ค์ 
   1. ํ๋ก์ ํธ ์์ฑ
   2. ๋ผ์ด๋ธ๋ฌ๋ฆฌ ์ดํด๋ณด๊ธฐ
   3. View ํ๊ฒฝ์ค์ 
   4. ๋น๋ํ๊ณ  ์คํํ๊ธฐ
2. ์คํ๋ง ์น๊ฐ๋ฐ ๊ธฐ์ด 
   1. ์ ์ ์ปจํ์ธ 
   2. MVC์ ํํ๋ฆฟ ์์ง
   3. API
3. ํ์ ๊ด๋ฆฌ ์์  - ๋ฐฑ์๋ ๊ฐ๋ฐ
   1. ๋น์ฆ๋์ค ์๊ตฌ์ฌํญ ์ ๋ฆฌ
   2. ํ์ ๋๋ฉ์ธ๊ณผ ๋ฆฌํฌ์งํ ๋ฆฌ ๋ง๋ค๊ธฐ
   3. ํ์ ๋ฆฌํฌ์งํ ๋ฆฌ ํ์คํธ ์ผ์ด์ค ์์ฑ
   4. ํ์ ์๋น์ค ๊ฐ๋ฐ
   5. ํ์ ์๋น์ค ํ์คํธ
4. ์คํ๋ง ๋น๊ณผ ์์กด๊ด๊ณ
   1. ์ปดํจ๋ํธ ์ค์บ๊ณผ ์๋ ์์กด๊ด๊ณ ์ค์ 
   2. ์๋ฐ ์ฝ๋๋ก ์ง์  ์คํ๋ง ๋น ๋ฑ๋กํ๊ธฐ
5. ํ์๊ด๋ฆฌ ์์  - ์น MVC ๊ฐ๋ฐ
   1. ํ์ ์น ๊ธฐ๋ฅ - ํํ๋ฉด ์ถ๊ฐ
   2. ํ์ ์น ๊ธฐ๋ฅ - ๋ฑ๋ก
   3. ํ์ ์น ๊ธฐ๋ฅ - ์กฐํ
6. ์คํ๋ง DB ์ ๊ทผ ๊ธฐ์ 
   1. H2 ๋ฐ์ดํฐ๋ฒ ์ด์ค ์ค์น
   2. ์์ JDBC
   3. ์คํ๋ง ํตํฉ ํ์คํธ
   4. ์คํ๋ง JdbcTemplate
   5. JPA
   6. ์คํ๋ง ๋ฐ์ดํฐ JPA
7. AOP
   1. AOP๊ฐ ํ์ํ ์ํฉ
   2. AOP ์ ์ฉ
</br>

---
</br>

## 1. ํ๋ก์ ํธ ํ๊ฒฝ์ค์ 
### 1) ํ๋ก์ ํธ ์์ฑ
์คํ๋ง ๋ถํธ ์คํํฐ์์ ์คํ๋ง ํ๋ก์ ํธ ์์ฑ
https://start.spring.io/
</br>

### 2) ํ๋ก์ ํธ ๋ผ์ด๋ธ๋ฌ๋ฆฌ
Gradle์ ์์กด๊ด๊ณ๊ฐ ์๋ ๋ผ์ด๋ธ๋ฌ๋ฆฌ๋ฅผ ํจ๊ป ๋ค์ด๋ก๋
</br>
</br>

**์คํ๋ง๋ถํธ ๋ผ์ด๋ธ๋ฌ๋ฆฌ**
* spring-boot-starter-web
  * spring-boot-starter-tomcat: ํฐ์บฃ(์น์๋ฒ)
  * spring-webmvc: ์คํ๋ง ์น MVC
* spring-boot-starter(๊ณตํต): ์คํ๋ง ๋ถํฐ + ์คํ๋ง์ฝ์ด + ๋ก๊น
  * spring-boot
    * spring-core
  * spring-boot-starter-logging
    * logback, slf4j
</br>
</br>

**ํ์คํธ๋ผ์ด๋ธ๋ฌ๋ฆฌ**
* spring-boot-starter-test
  * junit: ํ์คํธ ํ๋ ์์ํฌ(์ต๊ทผ junit5๊น์ง ๋์์ ์ฌ์ฉ)
  * mockito: ๋ชฉ ๋ผ์ด๋ธ๋ฌ๋ฆฌ
  * assertj: ํ์คํธ ์ฝ๋๋ฅผ ์ข ๋ ํธํ๊ฒ ์์ฑํ๊ฒ ๋์์ฃผ๋ ๋ผ์ด๋ธ๋ฌ๋ฆฌ
  * spring-test: ์คํ๋ง ํตํฉ ํ์คํธ ์ง์
</br>
</br>

### 3) View ํ๊ฒฝ์ค์ 
์ปจํธ๋กค๋ฌ์์ ๋ฆฌํด๊ฐ์ผ๋ก ๋ฌธ์๋ฅผ ๋ฐํํ๋ฉด viewResolver๊ฐ ํ๋ฉด์ ์ฐพ์ ์ฒ๋ฆฌ
![img.png](img.png)
* thymeleaf๋ฅผ ์ฌ์ฉํ๊ธฐ ์ํด html ํ๊ทธ์ ๋ค์์คํ์ด์ค๋ฅผ ์์ฑํด IDE๊ฐ ํ์๋ฆฌํ๋ฅผ ์ธ์ํ๋๋ก ํ๋ค.</br>
```<html xmlns:th="http://www.thymeleaf.org">```
* modelAttribute๋ฅผ ์ฌ์ฉํด data๋ฅผ thymeleaf๋ก view ํ๋ฉด์ ๋ณด๋ด์ค๋ค</br>
```
public String hello(Model model) {
    model.addAttribute("data", "hello");
    return "hello";
}
```
hello.html</br>
```<p th:text="'์๋ํ์ธ์. ' + ${data}" >์๋ํ์ธ์. ์๋</p>```
</br>
</br>

### 4) ๋น๋ํ๊ณ  ์คํํ๊ธฐ
</br>
</br>

## 2. ์คํ๋ง ์น๊ฐ๋ฐ ๊ธฐ์ด
### 1) ์ ์  ์ปจํ์ธ 
์คํ๋ง๋ถํฐ ์ ์  ์ปจํด์ธ  ๊ธฐ๋ฅ </br>
https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/html/spring-boot-features.html#boot-features-spring-mvc-static-content
</br>
</br>

### 2) MVC์ ํํ๋ฆฟ ์์ง
Model, View, Controller</br>
Controller, Model</br>
```
public String helloMvc(@RequestParam("name") String name, Model model) {
    model.addAttribute("name", name);
    return "hello-template";
}
```

Controller์ Model์ ํตํด view์ ๊ฐ์ ๋๊ฒจ์ค</br>
![img_7.png](img_7.png)

spring์ด Controll์์ viewResolver์ return ๊ฐ์ผ๋ก hello-template, model๋ก name๊ฐ์ ๋๊ฒจ์ค</br>
![img_9.png](img_9.png)</br>
</br>
</br>

### 3) API
* ```@ResponseBody```๋ฅผ ์ฌ์ฉํ๋ฉด viewResolver๋ฅผ ์ฌ์ฉํ์ง ์๊ณ  HTTP์ Body์ ๋ฌธ์๋ด์ฉ์ ์ง์ ๋ฐํ(JSON์ผ๋ก)</br>
* viewResolver ๋์  ```HttpMessageConverter```๊ฐ ๋์</br>
![img_1.png](img_1.png)
</br>
</br>

## 3. ํ์ ๊ด๋ฆฌ ์์  - ๋ฐฑ์๋ ๊ฐ๋ฐ
### 1) ๋น์ฆ๋์ค ์๊ตฌ์ฌํญ ์ ๋ฆฌ
### 2) ํ์ ๋๋ฉ์ธ๊ณผ ๋ฆฌํฌ์งํ ๋ฆฌ ๋ง๋ค๊ธฐ
* Otional : java8์ ๋ฑ์ฅ, null๊ฐ์ ์ฒ๋ฆฌํ  ๋ ์ฌ์ฉ
* ์์) ```Optional<Member> findById(Long id);```

### 3) ํ์ ๋ฆฌํฌ์งํ ๋ฆฌ ํ์คํธ ์ผ์ด์ค ์์ฑ
```
    public void clearStore() {
        store.clear();  //data clear
    }
```
```
    @AfterEach // ๋ฉ์๋๊ฐ ๋๋ ํ ์คํ(<-> @BeforEach)
    public void afterEach() {
        repository.clearStore();  //data clear
    }

    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring"); //"spring"์๋ ฅ, member์ ์ ์ฅ
        repository.save(member); //repository์ member์ ์ฅ

        Member result = repository.findById(member.getId()).get(); //result๋ณ์์ repository์์ ์์ด๋๋ก ์กฐํํ Member์ ๋ณด๋ฅผ ๋ด๋๋ค
//        Assertions.assertEquals(member, result);
        Assertions.assertThat(member).isEqualTo(result); //member์ result ๋น๊ต
    }
```
### 4) ํ์ ์๋น์ค ๊ฐ๋ฐ
```
//๊ฐ์ ์ด๋ฆ์ด ์๋ ์ข๋ณต ํ์X
Optional<Member> result = memberRepository.findByName(member.getName()); //Optional์ ํตํด ์ ํจ์ฑ๊ฒ์ฌ
result.ifPresent(m -> {      // .fiPresent : null์ธ ๊ฒฝ์ฐ์ default ๊ฐ ๋ฐํ 
    throw new IllegalArgumentException("์ค๋ณต๋ ์ด๋ฆ ์๋๋ค.");
});
```
```
//๊ฐ์ ์ด๋ฆ์ด ์๋ ์ข๋ณต ํ์X
private void validateDuplicateMember(Member member) {   // Optionall ์๋ต๊ฐ๋ฅ
    memberRepository.findByName(member.getName())
        .ifPresent(m -> {
            throw new IllegalArgumentException("์ค๋ณต๋ ์ด๋ฆ ์๋๋ค.");
        });
}
```
</br>
</br>

### 5) ํ์ ์๋น์ค ํ์คํธ
</br>
</br>

## 4. ์คํ๋ง ๋น๊ณผ ์์กด๊ด๊ณ
### 1) ์ปดํจ๋ํธ ์ค์บ๊ณผ ์๋ ์์กด๊ด๊ณ ์ค์ 
**์คํ๋ง ๋น์ ๋ฑ๋กํ๋ 2๊ฐ์ง ๋ฐฉ๋ฒ**
* ์ปดํฌ๋ํธ ์ค์บ๊ณผ ์๋ ์์กด๊ด๊ณ ์ค์ 
* ์๋ฐ ์ฝ๋๋ก ์ง์  ์คํ๋ง ๋น ๋ฑ๋กํ๊ธฐ
</br>
</br>

**์ปดํฌ๋ํธ ์ค์บ ์๋ฆฌ**
* @Component ์ ๋ธํ์ด์์ด ์์ผ๋ฉด ์คํ๋ง ๋น์ผ๋ก ์๋ ๋ฑ๋ก
* @Component ๋ฅผ ํฌํจํ๋ ๋ค์ ์ ๋ธํ์ด์๋ ์คํ๋ง ๋น์ผ๋ก ์๋ ๋ฑ๋ก</br>
```@Controller```
```@Service```
```@Repository```
</br>
</br>

**ํ์์๋น์ค ์คํ๋ง ๋น ๋ฑ๋ก**
* ์์ฑ์์ @Autowired๋ฅผ ์ฌ์ฉํ๋ฉด ๊ฐ์ฒด ์์ฑ ์์ ์ ์คํ๋ง ์ปจํ์ด๋์์ ํด๋น ์คํ๋ง ๋น์ ์ฐพ์ ์ฃผ์
```
@Service
public class MemberService {
    private final MemberRepository memberRepository;
 
    @Autowired  
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
}
```


### 2) ์๋ฐ ์ฝ๋๋ก ์ง์  ์คํ๋ง ๋น ๋ฑ๋กํ๊ธฐ
* @Configuration ์ด๋ธํ์ด์์ ์ด์ฉํ์ฌ Bean์ ์์ฑ ํ  ์ ์์
```
@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
```

**<์ฐธ๊ณ ์ฌํญ>**
* ์ ํํ ๋์ง ์๊ฑฐ๋, ์ํฉ์ ๋ฐ๋ผ ๊ตฌํ ํด๋์ค๋ฅผ ๋ณ๊ฒฝํด์ผ ํ๋ฉด ์ค์ ์ ํตํด ์คํ๋ง๋น์ผ๋ก ๋ฑ๋ก
* @Autowired๋ฅผ ํตํ DI๋ Controller, Service ๋ฑ๊ณผ ๊ฐ์ด ์คํ๋ง์ด ๊ด๋ฆฌํ๋ ๊ฐ์ฒด์์๋ง ๋์
</br>
</br>

## 5. ํ์๊ด๋ฆฌ ์์  - ์น MVC ๊ฐ๋ฐ
### 1) ํ์ ์น ๊ธฐ๋ฅ - ํํ๋ฉด ์ถ๊ฐ
### 2) ํ์ ์น ๊ธฐ๋ฅ - ๋ฑ๋ก
### 3) ํ์ ์น ๊ธฐ๋ฅ - ์กฐํ
</br>
</br>

## 6. ์คํ๋ง DB ์ ๊ทผ ๊ธฐ์ 
### 1) H2 ๋ฐ์ดํฐ๋ฒ ์ด์ค ์ค์น
ํ์ด๋ธ ๊ด๋ฆฌ๋ฅผ ์ํด ํ๋ก์ ํธ ๋ฃจํธ์ "sql/ddl.sql"ํ์ผ ์์ฑ
```
drop table if exists member CASCADE;
create table member
(
 id bigint generated by default as identity,
 name varchar(255),
 primary key (id)
);
```
</br>
</br>

### 2) ์์ JDBC
build.gradle ํ์ผ์ jdbc, h2 ๋ฐ์ดํฐ๋ฒ ์ด์ค ๊ด๋ จ ๋ผ์ด๋ธ๋ฌ๋ฆฌ ์ถ๊ฐ
```
implementation 'org.springframework.boot:spring-boot-starter-jdbc'
runtimeOnly 'com.h2database:h2'
```
</br>

์คํ๋ง ๋ถํธ ๋ฐ์ดํฐ๋ฒ ์ด์ค ์ฐ๊ฒฐ ์ค์  ์ถ๊ฐ</br>
"resources/application.properties"
```
spring.datasource.url=jdbc:h2:tcp://localhost/~/test
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
```
</br>
</br>

### 3) ์คํ๋ง ํตํฉ ํ์คํธ
* @SpringBootTest : ์คํ๋ง ์ปจํ์ด๋์ ํ์คํธ๋ฅผ ํจ๊ป ์คํ
* @Transactional : ํ์คํธ ์์ ์ ์ ํธ๋์ญ์์ ์์ํ๊ณ ,
ํ์คํธ ์๋ฃ ํ์ ํญ์ ๋กค๋ฐฑํ๋ค. ์ด๋ ๊ฒ ํ๋ฉด DB์ ๋ฐ์ดํฐ๊ฐ ๋จ์ง ์์ผ๋ฏ๋ก ๋ค์ ํ์คํธ์ ์ํฅ์ ์ฃผ์ง
์๋๋ค.
  </br>
  </br>

### 4) ์คํ๋ง JdbcTemplate
### 5) JPA
### 6) ์คํ๋ง ๋ฐ์ดํฐ JPA
</br>
</br>

## 7. AOP
### 1) AOP๊ฐ ํ์ํ ์ํฉ
**์ํฉ**
* ๋ชจ๋  ๋ฉ์๋์ ํธ์ถ ์๊ฐ์ ์ธก์ ํ๊ณ  ์ถ๋ค๋ฉด?
* ๊ณตํต ๊ด์ฌ ์ฌํญ(cross-cutting concern) vs ํต์ฌ ๊ด์ฌ ์ฌํญ(core concern)
* ํ์ ๊ฐ์ ์๊ฐ, ํ์ ์กฐํ ์๊ฐ์ ์ธก์ ํ๊ณ  ์ถ๋ค๋ฉด?</br>

**๋ฌธ์ **
* ํ์๊ฐ์, ํ์ ์กฐํ์ ์๊ฐ์ ์ธก์ ํ๋ ๊ธฐ๋ฅ์ ํต์ฌ ๊ด์ฌ ์ฌํญ์ด ์๋๋ค.
* ์๊ฐ์ ์ธก์ ํ๋ ๋ก์ง์ ๊ณตํต ๊ด์ฌ ์ฌํญ์ด๋ค.
* ์๊ฐ์ ์ธก์ ํ๋ ๋ก์ง๊ณผ ํต์ฌ ๋น์ฆ๋์ค์ ๋ก์ง์ด ์์ฌ์ ์ ์ง๋ณด์๊ฐ ์ด๋ ต๋ค.
* ์๊ฐ์ ์ธก์ ํ๋ ๋ก์ง์ ๋ณ๋์ ๊ณตํต ๋ก์ง์ผ๋ก ๋ง๋ค๊ธฐ ๋งค์ฐ ์ด๋ ต๋ค.
* ์๊ฐ์ ์ธก์ ํ๋ ๋ก์ง์ ๋ณ๊ฒฝํ  ๋ ๋ชจ๋  ๋ก์ง์ ์ฐพ์๊ฐ๋ฉด์ ๋ณ๊ฒฝํด์ผ ํ๋ค.
</br>

### 2) AOP ์ ์ฉ
#### AOP : Aspect Oriented Programming
* ๊ณตํต ๊ด์ฌ ์ฌํญ(cross-cutting concern) vs ํต์ฌ ๊ด์ฌ ์ฌํญ(core concern) ๋ถ๋ฆฌ
* AOP์๋ @Aspect ์ฌ์ฉ
* @Component or @Bean ์ฌ์ฉ
* AOP๋ ํ๋ก์๋ผ๋ ๊ฐ์ง class ์ฌ์ฉ</br>
![img_2.png](img_2.png)

</br>
</br>

**๋ฌธ์  ํด๊ฒฐ**
* ํ์๊ฐ์, ํ์ ์กฐํ๋ฑ ํต์ฌ ๊ด์ฌ์ฌํญ๊ณผ ์๊ฐ์ ์ธก์ ํ๋ ๊ณตํต ๊ด์ฌ ์ฌํญ์ ๋ถ๋ฆฌํ๋ค.
* ์๊ฐ์ ์ธก์ ํ๋ ๋ก์ง์ ๋ณ๋์ ๊ณตํต ๋ก์ง์ผ๋ก ๋ง๋ค์๋ค.
* ํต์ฌ ๊ด์ฌ ์ฌํญ์ ๊น๋ํ๊ฒ ์ ์งํ  ์ ์๋ค.
* ๋ณ๊ฒฝ์ด ํ์ํ๋ฉด ์ด ๋ก์ง๋ง ๋ณ๊ฒฝํ๋ฉด ๋๋ค.
* ์ํ๋ ์ ์ฉ ๋์์ ์ ํํ  ์ ์๋ค.
