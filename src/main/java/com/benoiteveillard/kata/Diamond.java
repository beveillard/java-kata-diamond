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

public class Diamond {

    public static String printDiamond(char widestPoint) {
        String diamond = "";
        int widestPointIndex = widestPoint - 'A';

        for (int lineIndex = 0; lineIndex < widestPointIndex; lineIndex++) {
            diamond += printDiamondLine(widestPointIndex, lineIndex);
        }

        for (int lineIndex = widestPointIndex; lineIndex >= 0; lineIndex--) {
            diamond += printDiamondLine(widestPointIndex, lineIndex);
        }

        return diamond;
    }

    public static String printDiamondLine(int widestPointIndex, int lineIndex) {
        String diamondLine;

        diamondLine = printSpaces(widestPointIndex - lineIndex);
        diamondLine += (char) (lineIndex + 'A');

        if (lineIndex != 0) {
            diamondLine += printSpaces(2 * lineIndex - 1);
            diamondLine += (char) (lineIndex + 'A');
        }

        return diamondLine + "\n";
    }

    public static String printSpaces(int nbSpaces) {
        String spaces = "";

        for (int index = 0; index < nbSpaces; index++) {
            spaces += " ";
        }

        return spaces;
    }
}
