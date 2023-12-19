package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void openAndShut() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"), true);
    }

    @Test
    public void inBetween() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("Launch[Code]"), true);
    }

    @Test
    public void atBeginning() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"), true);
    }

    @Test
    public void emptyString() {
        assertEquals(BalancedBrackets.hasBalancedBrackets(""), true);
    }

    @Test
    public void emptyBrackets() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("[]"), true);
    }

    @Test
    public void unclosedBrackets() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("[LaunchCode"), false);
    }

    @Test
    public void unOrderedBrackets() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("Launch]Code["), false);
    }

    @Test
    public void singleBracket() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("["), false);
    }

    @Test
    public void backwardsBrackets() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("]["), false);
    }

    @Test
    public void multiOrderedBrackets() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("[Launch][Code]"), true);
    }

    @Test
    public void multiUnorderedBrackets() {
        assertEquals(BalancedBrackets.hasBalancedBrackets("][]["), false);
    }
}