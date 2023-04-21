/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Utilities {
    public static String convertDate(String date) {
        String[] dates = date.split("-");
        return dates[2]+"/"+dates[1]+"/"+dates[0];
        
    }
    public static String convertMoneyFormat(long money) {
        String atmp=String.valueOf(money);
        String res = "";
        String tmp="";
        int index=0;
        for(int i=atmp.length()-1; i>=0;i--){
            tmp=atmp.charAt(i)+tmp;
            index+=1;
            if(index==3){
                res = ("."+tmp)+res;
                tmp="";
                index=0;
            }
        }
        res=tmp+res;
        if(res.charAt(0)=='.')
            res = res.substring(1);
        return res;
        
        
        
    }
    
}
