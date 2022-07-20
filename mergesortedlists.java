
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;//when list1 is empty
        if(list2==null)
            return list1;//when list2 is empty
        if(list1.val > list2.val){
            ListNode temp=list1;
            list1=list2;
            list2=temp;
        }
        ListNode res=list1;//Smallest one always points to list1
        while(list1 != null && list2 != null)//loop until the value becomes null
        {
            ListNode tp=null;
            while(list1 != null && list1.val<=list2.val)//until list1 gets empty and the value in list2 is smaller or less than value in list2
            {
                tp=list1;
                list1=list1.next;//traversing in list1
            }
            tp.next=list2;
            ListNode swap=list1;
            list1=list2;
            list2=swap;
        }
        return res;
    }
}