package com.mckinsey.bootcamp.exercise2;

public class Length{
    private int magnitude;

    private String unit;

    public Length(int magnitude, String unit){
        this.magnitude = magnitude;
        this.unit = unit;
    }


    @Override
    public boolean equals(Object object){
          Length other = (Length) object;
          if(this.unit == other.unit){
              return this.magnitude == other.magnitude;
          }
          switch (this.unit){
              case "meters" :
                  this.magnitude = this.magnitude*100;
                  break;

              case "kilometers" :
                  this.magnitude = this.magnitude*100000;
          }
        switch (other.unit){
            case "meters" :
                this.magnitude = this.magnitude*100;
                break;

            case "kilometers" :
                this.magnitude = this.magnitude*100000;
                break;
        }
          return this.magnitude == other.magnitude;
    }

//    public boolean equals(Length other){
//        return other.magnitude == magnitude;
//    }
}
