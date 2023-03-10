/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leticie
 */
public class Timer {
    
    private int valueSeconds;
    private int valueHundredsOfSeconds;
    
    public Timer() {
        this.valueSeconds = 0;
        this.valueHundredsOfSeconds = 0;
    }
    
    public String toString(){
        if(valueHundredsOfSeconds <= 9 && valueSeconds < 9) {
            return "0" + valueSeconds + ":0" + valueHundredsOfSeconds;
        }
        if (valueHundredsOfSeconds <= 9) {
            return valueSeconds + ":0" + valueHundredsOfSeconds;
        }
        if (valueSeconds <= 9) {
            return "0" + valueSeconds + ":" + valueHundredsOfSeconds;
        }
        return valueSeconds + ":" + valueHundredsOfSeconds;
    }
            
    public void advance(){
        if(valueHundredsOfSeconds < 99) {
            this.valueHundredsOfSeconds += 1;
        } else {
            this.valueHundredsOfSeconds = 0;
            if(valueSeconds < 59){
                this.valueSeconds += 1;
            } else {
                this.valueSeconds = 0;
            }
        }
    }       
    
}
