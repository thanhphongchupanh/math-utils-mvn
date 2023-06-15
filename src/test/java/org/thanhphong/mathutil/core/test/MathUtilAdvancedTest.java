/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.thanhphong.mathutil.core.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Executable;
import java.lang.reflect.TypeVariable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.thanhphong.mathutil.core.MathUtility;
import static org.thanhphong.mathutil.core.MathUtility.*;
import sun.reflect.generics.repository.ConstructorRepository;

/**
 *
 * @author ADMIN
 */
public class MathUtilAdvancedTest {
    
    // hàm chuẩn bị bộ data test để sau đó fill vào hàm
    public static Object[] initTestData(){
        Object testDate[][] = {{0, 1},
                               {1, 1},
                               {2, 2}, 
                               {4, 24}};
        
        return testDate;
    }
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunsWell(int n, long expected){
        assertEquals(expected, getFactorial(n));
    }
    
    //@Test //(expected = IllegalAccessException.class)
    public void testFactorialGivenWrongArguementThrowException(){
//        Executable gF = new Executable() {
//            @Override
//            public void execute() throws Throwable{
//                MathUtility.getFactorial(-5);
//            }
//        };

        Executable gF = () -> MathUtility.getFactorial(-5);
        assertThrows(IllegalAccessException.class,
                                    gF);  // hàm thuộc interface
                                                // lamda cho nhanh
        
    }
}
