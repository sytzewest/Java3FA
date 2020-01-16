package com;

import Main.Table;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    @Test
    void compare() {
        Table Eredivisie = new Table("Eredivisie");
        assertEquals(1, (Eredivisie.compare(1,4)));
    }

    @Test
    void getLeagueName() {
        Table Eredivise = new Table("Eredivisie");
        assertEquals("Eredivisie", Eredivise.getLeagueName());
    }
}