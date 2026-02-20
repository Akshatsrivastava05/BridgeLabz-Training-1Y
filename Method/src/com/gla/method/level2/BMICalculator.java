package com.gla.method.level2;
import java.util.Scanner;
public class BMICalculator 
{
    public static void calculateBMI(double[][] persons) 
	{
        for (int i = 0; i < persons.length; i++) 
		{
            double weight = persons[i][0];
            double heightCm = persons[i][1];

            double heightMeter = heightCm / 100;
            double bmi = weight / (heightMeter * heightMeter);

            persons[i][2] = bmi; 
        }
    }
    public static String[] getBMIStatus(double[][] persons) 
	{
        String[] status = new String[persons.length];
        for (int i = 0; i < persons.length; i++) 
		{
            double bmi = persons[i][2];

            if (bmi <= 18.4) 
			{
                status[i] = "Underweight";
            } 
			else if (bmi >= 18.5 && bmi <= 24.9) 
			{
                status[i] = "Normal";
            } 
			else if (bmi >= 25.0 && bmi <= 39.9) 
			{
                status[i] = "Overweight";
            } 
			else 
			{
                status[i] = "Obese";
            }
        }
        return status;
    }
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][3];
        for (int i = 0; i < 10; i++) 
		{
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            persons[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            persons[i][1] = sc.nextDouble();
        }
        calculateBMI(persons);
        String[] status = getBMIStatus(persons);
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < 10; i++) 
		{
         System.out.println("Person "+(i+1)+"| Weight: "+persons[i][0]+" kg | Height: "+persons[i][1]+" cm | BMI: "+String.format("%.2f",persons[i][2]) " | Status: "+status[i]);
        
		}
		}
}