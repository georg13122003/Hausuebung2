/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pkg2;

import java.util.Scanner;

/**
 *
 * @author gmairhuber18
 */
public class NumberTester {

    String file;
    NumberTest OddEvenTester;
    NumberTest PrimeTester;
    NumberTest PalindromeTester;
    Scanner sc = new Scanner(System.in);

    public NumberTester(String filename) {

        this.file = filename;

    }

    public void setOddEvenTester(NumberTest oddtest) {
        this.OddEvenTester = oddtest;
    }

    public void setPrimeTester(NumberTest primetest) {
        this.PrimeTester = primetest;
    }

    public void PalindromeTester(NumberTest palindrometest) {
        this.PalindromeTester = palindrometest;
    }

    public void testFile() {
            int anzahl = sc.nextInt();
            for (int i = 0; i < anzahl; i++) {
            //switch
        }
    }
}
