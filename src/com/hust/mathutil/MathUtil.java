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
//TA VIẾT CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI
//KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA KO NHỚ CÁI GÌ CHO RIÊNG TA
//HÀM STATIC GIÚP LÀM ĐIỀU NÀY  
public class MathUtil {
    
    //n! = 1.2.3.4.5
    //Quy ước 0! = 1! = 1
    //ko tính giai thừa cho số âm
    //20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    //21! lố kiểu long
    //nếu đưa vào âm hay 21 giai thừa ta éo tính, ta đập vào mặt ai xài hàm một cái ngoại lệ
    public static long getFactorial(int n) {
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20");
        //hàm dừng liền ko cần return
        
        //xuống đây là n = từ 0 đến 20 r
        if(n == 0 || n == 1)
            return 1;   //dừng ngay khi n đặc biệt
        
        //xuống đến đây n = 2 -> 20
        //chơi for hoặc đệ quy - recursion
        //kĩ thuật nhồi con heo đất
        //i = 2, i = 3, i = 4, i = n nhồi liên tục i vào tích
        long product = 1; //tích khởi đầu bằng 1
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;        
    }
}
