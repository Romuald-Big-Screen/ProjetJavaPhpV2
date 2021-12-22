package com.ProjetJavaPhpV2.ProjetJavaPhpV2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJPA {
    @BeforeEach
    public void setUp() throws Exception {
    }
    @Test
    public static void test1() {
        try {
            ClassPathXmlApplicationContext app=
                    new ClassPathXmlApplicationContext(new String[]{"application.yml"});
            as (true);
        } catch (Exception e) {
            assert (e.getMessage(),false);
        }
    }
}
