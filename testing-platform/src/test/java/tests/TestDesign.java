package tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDesign {

    @BeforeClass
    public void openPage() {
        System.out.println("S1. Open Emag");
        System.out.println("R1. Page is opened");
    }

    @Test
    public void testCase1() {
        System.out.println("S2. Go To Laptops");
        System.out.println("R2. Laptop page is opened");
        System.out.println("S3. Click a laptop");
        System.out.println("R3. “Adauga in cos” button is displayed");
    }

    @Test
    public void testCase2() {
        System.out.println("S2. Search for “laptop”");
        System.out.println("R2. Search results page is opened");
        System.out.println("S3. Click an item");
        System.out.println("R3. “Adauga in cos” button is displayed");
    }
}
