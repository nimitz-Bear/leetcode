/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList<Integer> rev1 = revList(l1);
        for (int i = 0; i < rev1.size(); i++) {
            System.out.println(rev1.get(i));
        }

        LinkedList<Integer> rev2 = revList(l2);
        for (int i = 0; i < rev2.size(); i++) {
            System.out.println(rev2.get(i));
        }

        // determine which list is bigger
        int size = Math.max(rev1.size(), rev2.size());

        //TODO: deal with different size lists
        // create a new series of ListNodes to store result
        LinkedList<ListNode> output = new LinkedList<ListNode>();
        ListNode prev = null;
        int carryOver = 0;

        for (int i = 0; i < size; i++) {

            // cases for if the sizes are unequal
            int sum = 0;
            if (i >= rev1.size()) {
                sum = 0 + (rev2.get(i)) + carryOver;

            } else if (i >= rev2.size()) {
                 sum = (rev1.get(i)) + 0 + carryOver;
            } else {
                sum = (rev1.get(i)) + (rev2.get(i)) + carryOver;
            }
            
            // carryOver from previous results, if previous result was > 10
            carryOver = 0;
            if (sum >= 10) {
                carryOver = 1;

                // if the last index has a carry over, need to create an extra digit
                if (i == size - 1) {
                    current.add(new ListNode(1, current)
                }
            }
            ListNode current = new ListNode(sum % 10, null);

            output.add(current);
            if (prev != null) {
                prev.next = current;
            }
           

            prev = current;
        }

        System.out.println("break break break");
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i).val);
        }

        
        return output.peekFirst();
    }

    private LinkedList<Integer> revList(ListNode startNode) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        ListNode current = startNode;
        while(current != null) {
            result.addFirst(current.val);
            current = current.next;
        }

        return result;
    }


}