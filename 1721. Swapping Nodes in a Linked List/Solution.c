/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* swapNodes(struct ListNode* head, int k){
    struct ListNode* curr = head;
    int length = 1;
    while (curr->next != NULL) {
        length += 1;
        curr = curr->next;
    }
    struct ListNode* firstNode = head;
    struct ListNode* secondNode = head;
    for (int i = 1; i < length + 1; i++) {
        if (i < k) {
            firstNode = firstNode->next;
        }
        if (i < length - k + 1) {
            secondNode = secondNode->next;
        }
    }
    int temp = firstNode->val;
    firstNode->val = secondNode->val;
    secondNode->val = temp;
    return head;

}