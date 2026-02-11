#include "difference_of_squares.h"

unsigned int sum_of_squares(unsigned int num) {
    unsigned int sum = 0;

    for (unsigned int i = 1; i <= num; i++){
        sum += i * i; // acumula i²  
    }

    return sum;
}

unsigned int square_of_sum(unsigned int num) {
    unsigned int sum = 0;

    for (unsigned int i = 1; i <= num; i++){
        sum += i; // acumula i
    }
    
    return sum * sum;
}

unsigned int difference_of_squares(unsigned int num) {
    return square_of_sum(num) - sum_of_squares(num);
}