package com.javarush.task.task14.task1408;

public class  UkrainianHen extends Hen implements Country{
        
        public String getDescription() {
       return super.getDescription() + 
        
            " Моя страна - "+ Country.UKRAINE+
            ". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
            
            
        }
        
        @Override
        public int getCountOfEggsPerMonth(){
             return 5;
        }
        
    }
