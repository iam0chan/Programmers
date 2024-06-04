#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// array_len은 배열 array의 길이입니다.
int solution(int array[], size_t array_len) {
    int answer = 0;
    int temp = 0;
    
    for(int i=0; i<array_len; i++){
        for(int j=i+1;j<array_len;j++){
            if(array[i]>array[j]){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }
    for(int k=0; k<array_len; k++){
        printf("%d",array[k]);
    }
    answer = array[array_len/2];
    
    return answer;
}