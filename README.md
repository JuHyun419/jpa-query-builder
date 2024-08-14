##  jpa-query-builder

### Reflection
- Java Reflection API 를 활용하고, 테스트를 진행합니다.

1. 클래스 정보 출력
2. test 로 시작하는 메서드 실행
3. @PrintView 어노테이션 메서드 실행
4. private filed 에 값 할당
5. 인자를 가진 생성자의 인스턴스 생성

위의 작업들은 [ReflectionTest](src/test/java/persistence/study/ReflectionTest.java) 에서 확인할 수 있습니다.


### QueryBuilder DDL
- Reflection API 를 활용하여 create, drop DDL 쿼리를 생성하는 코드를 작성합니다.
- [ddl](src/main/java/persistence/sql/ddl) 패키지에 존재하는 [DDLQueryBuilder](src/main/java/persistence/sql/ddl/mapping/DDLQueryBuilder.java) 에서 확인할 수 있습니다.


### QueryBuilder DML
- Reflection API 를 활용하여 insert, select, delete DML 쿼리를 생성하는 코드를 작성합니다.
- [dml](src/main/java/persistence/sql/dml) 패키지에 존재하는 코드들을 통해 Insert, Select, Delete 쿼리 빌더가 존재합니다.


### EntityManager
- DDL, DML 의 QueryBuilder 를 통해 find, persist, remove 등의 메서드를 가지는 [EntityManager](src/main/java/persistence/entity/EntityManager.java) 인터페이스와 [EntityManagerImpl](src/main/java/persistence/entity/EntityManagerImpl.java) 구현체를 작성합니다.
- EntityManager 에 대한 [EntityManagerImplTest](src/test/java/persistence/entity/EntityManagerImplTest.java) 테스트 코드를 작성하여 검증합니다.
