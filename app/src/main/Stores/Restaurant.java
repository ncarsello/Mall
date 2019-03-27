package com.example.nicholas.mall;

/**
 * Created by nicholas on 24 February  2019.
 */

public class Restaurant extends Store{
        private String name;
        private String type;

        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }

        public void setType(String type){
            this.type = type;
        }
        public String getType(){
            return type;
        }
    }
