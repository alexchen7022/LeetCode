public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode returnNode = new ListNode();
        ListNode currentNode = head;
        ListNode indexNode = null;

        while (true) {
            if (currentNode == null) {
                break;
            }
            if (currentNode.val == val) {
                currentNode = currentNode.next;
                if (indexNode != null) {
                    indexNode.next = null;
                }
                continue;
            }
            if (indexNode == null) {
                indexNode = currentNode;
            } else {
                indexNode.next = currentNode;
                indexNode = indexNode.next;
            }
            if (returnNode.next == null) {
                returnNode.next = indexNode;
            }

            currentNode = currentNode.next;
        }
        return returnNode.next;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
