#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int coef;
    int exp;
    struct Node *next;
} Node;

typedef Node *List;

List read_list() {}

void read_list_2(List *l) {}

List mul_list(List l1, List l2) {}

List add_list(List l1, List l2) {}

void print_list(List l) {}

void delete_list(List l) {}

int main() {
    List l1, l2, la, lm;
    l1 = read_list();
    l2 = read_list();
    // mul
    lm = mul_list(l1, l2);
    print_list(lm);
    // add
    la = add_list(l1, l2);
    print_list(la);
    // delete
    delete_list(l1);
    delete_list(l2);
    delete_list(la);
    delete_list(lm);
    return 0;
}