package homework;

import homework.Car;

public class Garage {
    public static void main (String [] args){

        Car mercedes = new Car();
        Car rangeRover = new Car();
        Car lexus = new Car();
        Car toyota = new Car();

        mercedes.carMake = "Mercedes";
        mercedes.tires = "Michelin";
        mercedes.wheel = "steering wheel";
        mercedes.window = "4 windows";
        mercedes.lights = "LED";
        mercedes.color = "red";
        mercedes.year = 2021;
        mercedes.price = "$5000";

        mercedes.drive();
        mercedes.heat();
        mercedes.cool();
        mercedes.stop();
        mercedes.playMusic();
        mercedes.isExpensive();
        System.out.println();

        rangeRover.carMake = "Range Rover";
        rangeRover.tires = "Goodyear";
        rangeRover.wheel = "steering wheel";
        rangeRover.window = "6 windows";
        rangeRover.lights = "xenon";
        rangeRover.color = "white";
        rangeRover.year = 2022;
        rangeRover.price = "$15000";

        rangeRover.drive();
        rangeRover.heat();
        rangeRover.cool();
        rangeRover.stop();
        rangeRover.playMusic();
        rangeRover.isExpensive();
        System.out.println();

        lexus.carMake = "Lexus";
        lexus.tires = "Bridgestone";
        lexus.wheel = "steering wheel";
        lexus.window = "2 windows";
        lexus.lights = "white";
        lexus.color = "black";
        lexus.year = 2018;
        lexus.price = "$7,000";

        lexus.drive();
        lexus.heat();
        lexus.cool();
        lexus.stop();
        lexus.playMusic();
        lexus.isExpensive();
        System.out.println();

        toyota.carMake = "Toyota";
        toyota.tires = "Continental";
        toyota.wheel = "steering wheel";
        toyota.window = "4 windows";
        toyota.lights = "blue LED";
        toyota.color = "yellow";
        toyota.year = 2015;
        toyota.price = "$3,000";

        toyota.drive();
        toyota.heat();
        toyota.cool();
        toyota.stop();
        toyota.playMusic();
        toyota.isExpensive();

    }
}
