import java.util.*;
import java.lang.Math;
import java.text.DecimalFormat;

public String BMI (double bmi){
    if( bmi > 0 && bmi >= 18.5 ){
        System.out.println("Underweight : Risk of not getting enough food");
    }
    else if( bmi >= 18.6 && bmi >= 22.9 ){
        System.out.println("Suitable weight :D");
    }
    else if( bmi >= 23.0 && bmi >= 24.9 ){
        System.out.println("Overweight");
    }
    else if( bmi >= 25.0 && bmi >= 29.9 ){
        System.out.println("Fat : there is a risk of disease ");
    }
    else   System.out.println("Very fat : there is a risk of disease ");
        return;
         
}       

    public static String main(String[]args){ 
        System.out.print("Please enter your weight (Kg.) : ");
        double weight = sc.nextDouble();

        System.out.print("Please enter your height (CM.) : ");
        double height = sc.nextDouble();
        
        System.out.print("Age : ");
        int age = sc.nextInt();

        
        double bmi = weight / ( Math.pow( ( height / 100 ), 2 ) );
        if (age < 5 && age >= 18){
            double height_by_age = (6 * age)+77;
            double weight_by_age = ((age * 7)-5)/2;
            
            if(height_by_age < height && weight_by_age < weight){
                System.out.println("considered short");
                System.out.println("considered Underweight");
                System.out.println( "BMI :  "+new DecimalFormat("##.##").format( bmi ) );
                BMI(bmi);
            }
            else if(height_by_age > height && weight_by_age < weight){
                System.out.println("considered hight");
                System.out.println("considered Underweight");
                System.out.println( "BMI :  "+new DecimalFormat("##.##").format( bmi ) );
                BMI(bmi);
            }
            else if(height_by_age > height && weight_by_age > weight){ 
                System.out.println("considered hight");
                System.out.println("considered fat");
                System.out.println( "BMI :  "+new DecimalFormat("##.##").format( bmi ) );
                BMI(bmi);
            }
            else 
                System.out.println("standard height");
                System.out.println("standard weight");
                System.out.println( "BMI :  "+new DecimalFormat("##.##").format( bmi ) );
                BMI(bmi);
        }
        else (age >18){
            if( weight > 0 && height > 0 ) {
                System.out.println( "Weight : "+weight );
                System.out.println( "Height :"+height );
                System.out.println( "BMI :  "+new DecimalFormat("##.##").format( bmi ) );
                BMI(bmi);
        }
        System.out.println("Error!!");
    }
    }