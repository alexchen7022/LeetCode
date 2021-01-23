import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveLinkedListElementsTest {

    private final RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();

    @Test
    void removeElements() {
        int[] input = {1, 2, 6, 3, 4, 5, 6}, expected = {1, 2, 3, 4, 5};
        RemoveLinkedListElements.ListNode head = givenNode(input);
        head = removeLinkedListElements.removeElements(head, 6);
        int i = 0;
        while (true) {
            assertEquals(expected[i], head.val);
            head = head.next;
            i++;
            if (head.next == null) {
                break;
            }
        }

    }

    private RemoveLinkedListElements.ListNode givenNode(int[] target) {
        RemoveLinkedListElements.ListNode head = new RemoveLinkedListElements.ListNode(target[0]);
        RemoveLinkedListElements.ListNode current = head;
        for (int i = 1; i < target.length; i++) {
            RemoveLinkedListElements.ListNode node = new RemoveLinkedListElements.ListNode(target[i]);
            current.next = node;
            current = node;
        }
        return head;
    }
}