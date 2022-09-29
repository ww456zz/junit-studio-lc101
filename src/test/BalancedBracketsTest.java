package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void bracketWithInnerTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hgfyiolg]"));
    }

    @Test
    public void bracketsInTextWithTextInsideReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("ksahlk[mvnb,]"));
    }

    @Test
    public void bracketsBeforeTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]cmhdcg"));
    }

    @Test
    public void twoBracketsWithTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("jgfk[vjvhkvjhj]vbnvm[vnbm]"));
    }

    @Test
    public void unorderedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void unclosedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void unorderedBracketsWithTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("gfvjkhg]gjhjh["));
    }

    @Test
    public void unclosedBracketWithTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("gkj[fghkgh"));
    }

    @Test
    public void noOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("hk]vj"));
    }

    @Test
    public void unclosedBracketsWithTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("I[love[Ruta]bagas]and[ban]ananananan[anas["));
    }
}
