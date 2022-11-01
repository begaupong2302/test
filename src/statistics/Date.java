/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statistics;

/**
 *
 * @author poong
 */
public class Date {
    public int day;
    public int month;
    public int year;
    public Date(int day, int month, int year){
        this.day = day;
        this.year = year;
        this.month = month;
    }
    
    static int exp(Date date1, Date date2){
        if (date1.year == date2.year){
            if (date1.month == date2.month){
                if (date1.day == date2.day){
                    return 0;
                }else if(date1.day > date2.day){
                    return -1;
                }else{
                    return 1;
                }
            }else if(date1.month > date2.month){
                return -1;
            }else{
                return 1;
            }
        }else if(date1.year > date2.year){
            return -1;
        }else{
            return 1;
        }
    }
}
