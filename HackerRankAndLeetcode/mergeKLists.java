public ListNode mergeDivideAndConquer(ListNode[] lists) {
  if (lists == null || lists.length == 0) {
    return null;
  }
  return divideAndConquer(lists, 0, lists.length - 1);
}

private ListNode divideAndConquer(ListNode[] lists, int lo, int hi) {
  if (lo > hi) { // invalid
    return null;
  }
  if (lo == hi) { // size = 1
    return lists[lo];
  }
  int mid = lo + (hi - lo) / 2; // left-leaning
  ListNode left = divideAndConquer(lists, lo, mid);
  ListNode right = divideAndConquer(lists, mid + 1, hi);
  return mergeList(left, right);
}

private ListNode mergeList(ListNode n1, ListNode n2) {
  ListNode dummy = new ListNode(-1);
  ListNode prev = dummy;
  while(n1 != null && n2 != null) {
    if(n1.val < n2.val) {
      prev.next = n1;
    } else {
      prev.next = n2;
      n2 = n2.next;
    }
    prev.next = (n1 != null) ? n1 : n2;
    return dummy.next;
  }
