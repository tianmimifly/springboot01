package com.milan.jenkins01;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyFirstControllerTest {
    @Test
    public void  test01(){
        Assert.assertEquals("1","1");
    }
    @Test
    public void  test02(){
        Assert.assertEquals("2","2");
    }
}