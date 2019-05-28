package com.zsw.algorithms;

import com.zsw.algorithms.entity.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 反转一个单链表
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * <p>
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 *
 * @author ZhangShaowei on 2019/5/28 11:35
 **/
public class ReverseList {


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;
        ListNode l3 = new ListNode(3);
        l2.next = l3;
        ListNode l4 = new ListNode(4);
        l3.next = l4;
        ListNode l5 = new ListNode(5);
        l4.next = l5;
        ListNode l6 = new ListNode(6);
        l5.next = l6;

        ListNode reverse = reverseList(l1);
        System.out.println(reverse);

    }

    public static ListNode reverseList(ListNode head) {
        ListNode index = head;
        ListNode tail = null;
        ListNode temp = null;
        while (index != null) {
            temp = index.next;
            index.next = tail;
            tail = index;
            index = temp;
        }
        return tail;
    }



}
