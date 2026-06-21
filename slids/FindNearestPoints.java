package book_by.y.danial;

import java.util.Scanner;

public class FindNearestPoints {
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter how many pionts: ");
        int number=s.nextInt();
        System.out.print("Enter the pionts: ");
        double [][]point=new double[number][2];
        for(int i=0;i<point.length;i++){
            
                point[i][0]=s.nextDouble(); 
                point[i][1]=s.nextDouble();  
        }
        int p1=0;int p2=1;
        var short_distance=distance(point[p1][0], point[p1][1],point[p2][0], point[p2][1]);
        
        for(int i=0;i<point.length;i++){
            for(int j=i+1;j<point.length;j++){
                double distance=distance(point[i][0], point[i][1],point[j][0],point[j][1]);
                if(short_distance>distance){
                    p1=i;p2=j;
                    short_distance=distance;
                }
            }
        }
        System.out.println("The shortest points are ("+point[p1][0]+","+point[p1][1]+") and ("+point[p2][0]+","+point[p2][1]+")"); 
    }
    //the distance method
    public static double distance(double x1,double y1, double x2, double y2){
        return (Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
    }
}
