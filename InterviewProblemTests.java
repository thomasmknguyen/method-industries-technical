import org.junit.Test;
import static org.junit.Assert.*;

public class InterviewProblemTests {

    @Test
    public void Sum_ReturnsAdd() {
        assertEquals("+", InterviewProblem.mathFunction(1, 2, 3));
    }

    @Test
    public void Difference_ReturnsSubtract() {
        assertEquals("-", InterviewProblem.mathFunction(1, 2, -1));
    }

    @Test
    public void Product_ReturnsMultiply() {
        assertEquals("*", InterviewProblem.mathFunction(3, -3, -9));
    }

    @Test
    public void Quotient_ReturnsDivide() {
        assertEquals("/", InterviewProblem.mathFunction(3, 3, 1));
    }

    @Test
    public void SumAndProduct_ReturnsAddAndMultiply() {
        assertEquals("+*", InterviewProblem.mathFunction(2, 2, 4));
    }

    @Test
    public void DifferenceAndQuotient_ReturnsSubtractAndDivide() {
        assertEquals("-/", InterviewProblem.mathFunction(4, 2, 2));
    }

    @Test
    public void ProductAndQuotient_ReturnsMultiplyAndDivide() {
        assertEquals("*/", InterviewProblem.mathFunction(0, 3, 0));
    }

    @Test
    public void SumAndDifference_ReturnsAddAndSubtract() {
        assertEquals("+-", InterviewProblem.mathFunction(1, 0, 1));
    }

    @Test
    public void AllZeroes_ReturnsAddAndSubtractAndMultiply() {
        assertEquals("+-*", InterviewProblem.mathFunction(0, 0, 0));
    }

    @Test
    public void NoOperands_ReturnsNone() {
        assertEquals("None", InterviewProblem.mathFunction(7, 1, 11));
    }
}