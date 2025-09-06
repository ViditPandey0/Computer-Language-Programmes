#include <stdio.h>
int func1(int a, int b) {
 return a * b;
}
int func2(int a, int b) {
 return a + b;
}
int main() {
 int x = 2, y = 3, z = 4;
 printf("%d", func1(func2(x, y), z));
 return 0;
}
