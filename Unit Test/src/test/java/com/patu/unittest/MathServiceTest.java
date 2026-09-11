package com.patu.unittest;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MathServiceTest {

    @Autowired
    MathService mathService;

    @Test
    void faka(){
        IO.println("faka");
    }

    @BeforeEach
    public void before(){
        IO.println("before");
    }

    @BeforeAll
    public static void beforeAll(){
        IO.println("beforeAll");
    }

    @AfterEach
    public void after(){
        IO.println("after");
    }

    @AfterAll
    public static void afterAll(){
        IO.println("afterAll");
    }

    @Test
    void testAdd() {
       // int result = mathService.add(2, 3);
      //  IO.println("Result: " + result);
        //assert result == 5;\

        int result = this.mathService.add(2, 3);
        Assertions.assertEquals(5, result);

    }



    @Test
    public void testSub() {
        int result = mathService.sub(5, 3);
        assert result == 2;
    }

    @Test
    public void testMul() {
        int result = mathService.mul(2, 3);
        assert result == 6;
    }

    @Test
    public void testDiv() {
        int result = mathService.div(6, 3);
        assert result == 2;
    }

}