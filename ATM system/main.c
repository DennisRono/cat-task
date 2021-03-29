#include <stdio.h>
#include <stdlib.h>
int balance;
int main()
{
    printf("\t\tWELCOME TO OUR ATM\n");
    printf("\t\tPIN is 1234\n");
    user();
    return 0;
}
void user(){
    int pin = 1234;
    int x;
    printf("Enter your PIN: ");
    scanf("%d", &x);
    if (pin == x){
        doanything();
    } else {
        printf("incorrect pin!!\n");
        user();
    }
}
void doanything(){
    int deposit,z,withdraw;
    printf("\t DO ANYTHING \n");
    printf("\t 1. Deposit Cash\n");
    printf("\t 2. Withdraw Cash\n");
    printf("\t 3. Check Balance\n");
    scanf("%d", &z);
    switch (z){
    case 1:
        printf("Enter the amount: ");
        scanf("%d", &deposit);
        if (deposit != 100 || deposit < 100000){
                balance += deposit;
                printf("SUCESS! New Balance is %d", balance);
                options();
        } else {
            printf("\n\tDeposit cannot be less than 100 and greater than 100000 ");
            options();
        }
    break;
    case 2:
        printf("\nEnter the amount: ");
        scanf("%d", &withdraw);
        if (withdraw > balance){
            printf("\nInsufficient Funds!");
            options();
        } else {
            if (withdraw%20 == 0){
                balance -= withdraw;
                printf("\nSuccess new balance is %d", balance);
                options();
            } else {
                printf("\nShould be a Multiple of 20");
                options();
            }
        }
    break;
    case 3:
        printf("\nYour Balance is %d", balance);
        options();
    break;
    default:
        printf("Invalid Option!");
}
    }


int options(){
    int option;
    printf("\nPress 1 to continue and 2 to Exit\n");
    scanf("%d", &option);
    if (option == 1){
        doanything();
    } else {
        return 0;
    }
}
