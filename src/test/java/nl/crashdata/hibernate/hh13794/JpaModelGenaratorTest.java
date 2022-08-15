package nl.crashdata.hibernate.hh13794;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class JpaModelGenaratorTest {

    @Test
    void usingAnnotations() {
        assertNull(DummyEntity_.id);
        assertNull(ChildEntity_.id);
    }

    @Test
    void usingXml() {
        assertNull(ChildEntity_.changedAt);
    }
}
