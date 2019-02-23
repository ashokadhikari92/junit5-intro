package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before - Only once...");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before Each Test....");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        greeting = new Greeting();

        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        greeting = new Greeting();

        System.out.println(greeting.helloWorld(" Ashok"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Each Test...");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After - Only once....");
    }
}