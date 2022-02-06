package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day08_FileExistTest {
    @Test
    public void isExist(){
//       Home Path
        String homeDirectory = System.getProperty("user.home");//root folder in Java
        System.out.println(homeDirectory);

//        Path of the image

        String pathOfImage=homeDirectory+"\\Desktop\\download.png";//windows
        System.out.println(pathOfImage);

//       Verify is a path exist
        //boolean isExist = Files.exists(Paths.get(pathOfImage));//true
        System.out.println(Files.exists(Paths.get(pathOfImage)));//true
        //Assert.assertTrue(isExist);


    }
}