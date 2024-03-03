package persistence.sql.dml.builder;

import domain.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import persistence.sql.model.Table;
import persistence.sql.dml.model.DMLColumn;

import static org.assertj.core.api.Assertions.assertThat;

class InsertQueryBuilderTest {

    private InsertQueryBuilder queryBuilder;
    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("name", 10, "a@a.com");
        final Table table = new Table(person.getClass());
        final DMLColumn column = new DMLColumn(person);
        queryBuilder = new InsertQueryBuilder(table, column);
    }

    @Test
    void insertQueryTest() {
        final var expected = "INSERT INTO users (id, nick_name, old, email) VALUES (null, 'name', 10, 'a@a.com');";

        final var actual = queryBuilder.build(person);

        assertThat(actual).isEqualTo(expected);
    }

}
