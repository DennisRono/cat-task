#include <stdio.h>
#include <stdlib.h>

int main(){
    int a,b,c,d,e,f,g,h,sum;
    float avg;
    printf("ENTER YOUR MARKS");
    printf("\nUCU100 communication skills: ");
    scanf("%d", &a);
    printf("\nUCU101 Development Studies: ");
    scanf("%d", &b);
    printf("\nSCO100 Fundamentals of computing: ");
    scanf("%d", &c);
    printf("\nSCO102 Introduction to programming: ");
    scanf("%d", &d);
    printf("\nSCO104 Computer Organization and Organization: ");
    scanf("%d", &e);
    printf("\nSCO106 Electronics: ");
    scanf("%d", &f);
    printf("\nSCO108 Discrete Math: ");
    scanf("%d", &g);
    printf("\nSCO110 Mathematical Foundation For Computer Science: ");
    scanf("%d", &h);
    if ( a <= 100 || b <= 100 || c <= 100 || d <= 100 || e <= 100 || f <= 100 || g <= 100 || h <= 100 ){
        sum = a+b+c+d+e+f+g+h;
        avg = sum/8;
        if (avg > 80){
        printf("You Scored %f.1 A", avg);
        } else if (avg > 60){
            printf("You Scored %f.1 B", avg);
        } else if (avg > 50){
            printf("You Scored %f.1 C", avg);
        } else if (avg > 40){
            printf("You Scored %f.1 D", avg);
        } else {
            printf("You Scored %f Failed", avg);
        }
    } else {
    printf("Each of your Marks Should not Exceed 100");
    }
    return 0;
}
