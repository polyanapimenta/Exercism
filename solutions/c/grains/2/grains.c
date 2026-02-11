#include "grains.h"

uint64_t square(uint8_t index){
    uint8_t  exp    = index-1;
    uint64_t result = 1;
    
    for (int j = 0; j < exp; j++) {
        result *= 2;
    }
    
    return result;
}

// Big O notation
// O(1)       -> Nenhum loop
// O(log n)   -> Busca Binaria (1 loop ao meio 1/2)
// O(n)       -> Apenas 1 loop
// O(n log n) -> Menor complexidade de ordenação (1 loop inteiro mais 1/2 meio loop )
// O(2n)      -> 2 loop no mesmo nivel
// O(n^2)     -> loop dentro de loop (é como se fosse 4 loops no mesmo nível)
// O(nˆ3)     -> loop dentro de loop dentro de loop (é como se fosse 8 loops no mesmo nível)
// O(n!)      -> n fatorial, força todos os elementos possíveis. (5!) = 5*4*3*2*1 = 120
    
uint64_t total(void){
    uint64_t result = 1;
    uint64_t sum    = 1;

    for (int j = 0; j < 64; j++) {
        result = result * 2;
        sum += result;
    }

    return sum;
}