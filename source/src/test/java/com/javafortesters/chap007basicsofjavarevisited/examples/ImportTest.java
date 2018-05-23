package com.javafortesters.chap007basicsofjavarevisited.examples;

import com.javafortesters.chap001basicsofjava.examples.classes.*;
import com.javafortesters.domainentities.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImportTest {

    @Test
    public void nonImportTest() {
        assertEquals(3, 2 + 1);
    }

    @Test
    public void importClassNameTest() {
        User user = new User();
        // no assert needed for docs
    }

    @Test
    public void importClassWithWildcard() {
        AClassWithAMethod aClass = new AClassWithAMethod();
        AnEmptyClass emptyClass = new AnEmptyClass();
        // no assert needed for docs
    }

    @Test
    public void nonStaticImport() {
        assertEquals(5, 3 + 2);
        assertEquals(6, 3 + 3);
    }

}