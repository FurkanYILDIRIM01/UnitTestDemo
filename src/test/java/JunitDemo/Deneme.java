package JunitDemo;

import org.junit.*;

public class Deneme {
    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Before class calisti");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("After class calisti");
    }

    @Before
    public void before() throws Exception {
        System.out.println("method öncesi");
    }

    @After
    public void after() throws Exception {
        System.out.println("method sonrası");

    }

    @Test
    public void Helloworld1() {
        System.out.println("hello world");
    }

    @Test
    public void Helloword2() {
        System.out.println("hello word 2");
    }



}

