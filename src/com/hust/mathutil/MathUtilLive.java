/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hust.mathutil;

/**
 *
 * @author khanh
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("expected 5! = 120; actual: " + result);
        //kĩ thuật kiểm thử phần mềm: ước lượng xem giá trị trả về của hàm là gì
        //expected value
        System.out.println("expected 6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("expected 0! = 1; actual: " + MathUtil.getFactorial(0));
        
        //THÊM CODE SAU LẦN ĐẦU TIÊN LÀM CHUYỆN ẤY - CODE LÊN SERVER 6:21PM 14/8/2021
        System.out.println("expected 1! = 1; actual: " + MathUtil.getFactorial(1));
        System.out.println("expected 3! = 6; actual: " + MathUtil.getFactorial(6));
    }
    
}
