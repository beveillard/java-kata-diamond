/*
 * Give a letter, print a diamond starting with 'A' with the
 * supplied letter at the widest point.
 *
 * For example, print-diamond 'C' prints:
 *   A
 *  B B
 * C   C
 *  B B
 *   A
 */

package com.benoiteveillard.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTests {

    @Test
    @DisplayName("print 0 spaces")
    void print0spaces() {
        assertEquals("", Diamond.printSpaces(0));
    }

    @Test
    @DisplayName("print 3 spaces")
    void print3spaces() {
        assertEquals("   ", Diamond.printSpaces(3));
    }

    @Test
    @DisplayName("print line 0 of 0")
    void printLine0of0() {
        assertEquals("A\n", Diamond.printDiamondLine(0, 0));
    }

    @Test
    @DisplayName("print line 0 of 3")
    void printLine0of3() {
        assertEquals("   A\n", Diamond.printDiamondLine(3, 0));
    }

    @Test
    @DisplayName("print line 1 of 3")
    void printLine1of3() {
        assertEquals("  B B\n", Diamond.printDiamondLine(3, 1));
    }

    @Test
    @DisplayName("print line 3 of 3")
    void printLine3of3() {
        assertEquals("D     D\n", Diamond.printDiamondLine(3, 3));
    }

    @Test
    @DisplayName("Widest point: A")
    void verifyDiamondWithWidestPointA() {
        assertEquals("A\n", Diamond.printDiamond('A'));
    }

    @Test
    @DisplayName("Widest point: B")
    void verifyDiamondWithWidestPointB() {
        assertEquals(" A\nB B\n A\n", Diamond.printDiamond('B'));
    }

    @Test
    @DisplayName("Widest point: C")
    void verifyDiamondWithWidestPointC() {
        assertEquals("  A\n B B\nC   C\n B B\n  A\n", Diamond.printDiamond('C'));
    }

}
