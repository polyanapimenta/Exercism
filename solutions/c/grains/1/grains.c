#include "grains.h"

uint64_t square(uint8_t index){
    // if (index < 0 || index > 64)
    //     return 0;

    uint8_t  base   = 2;
    uint8_t  exp    = index-1;
    uint64_t result = 0;

    if (exp == 0) {
        return result = 1;
    } else if (exp == 1) {
        return result = base;
    }

    result = base;
    for (int j = 1; j < exp; j++) {
        result *= 2;
    }
    
    return result;
}

uint64_t total(void){
    uint8_t index   = 64;
    uint8_t base    = 2;
    uint8_t exp     = 0;
    uint64_t result = 0;
    uint64_t sum    = 0;

    for (int i = 0; i < index ; i++) {
        if (exp == 0) {
            result = 1;
        }

        else if (exp == 1) {
            result = base;
        }

        else {
            result = base;
            for (int j = 1; j < exp; j++) {
                result *= 2;
            }
        }

        sum += result;
        result = 0;
        exp++;
    }
    return sum;
}