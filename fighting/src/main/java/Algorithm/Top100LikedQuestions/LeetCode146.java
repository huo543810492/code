package Algorithm.Top100LikedQuestions;

import java.util.HashMap;
import java.util.Map;

public class LeetCode146 {
    class DLinkedNode { //双向链表英文是，Doubly Linked List
        int key;//为什么只用记录value的双向链表还要记录key？当容量不够，从链表移除元素时候，得把hashmap里面的那个key也移除，这样才知道该移除哪个
        int value;
        DLinkedNode prev;
        DLinkedNode next;
    }
    //核心思想：hashMap 实现，key是int，value是双向链表，hashmap作用是实现O(1)的查询时间复杂度，双向链表实现记录LRU
//当查询get的时候，remove该node并把他放到head的后面，当链表满了需要移除元素时，直接从tail remove
    public class LRUCache {

        private Map<Integer, DLinkedNode> cache = new HashMap<>();
        private int size;
        private int capacity;
        private DLinkedNode head, tail;

        private void addNode(DLinkedNode node) {
            /**
             * Always add the new node right after head.
             */
            node.prev = head;
            node.next = head.next;

            head.next.prev = node;//next的反方向指到node，由于head.next还没改，依然是next不是node
            head.next = node;
        }

        private void removeNode(DLinkedNode node){
            /**
             * Remove an existing node from the linked list.
             */
            DLinkedNode prev = node.prev;
            DLinkedNode next = node.next;

            prev.next = next;
            next.prev = prev;
        }

        private void moveToHead(DLinkedNode node){
            /**
             * Move certain node in between to the head.
             */
            removeNode(node);
            addNode(node);
        }

        private DLinkedNode popTail() {
            /**
             * Pop the current tail.
             */
            DLinkedNode res = tail.prev;
            removeNode(res);
            return res;//return 为了remove hashmap里面的key
        }

        public LRUCache(int capacity) {
            this.size = 0;
            this.capacity = capacity;

            head = new DLinkedNode();
            // head.prev = null;

            tail = new DLinkedNode();
            // tail.next = null;

            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            DLinkedNode node = cache.get(key);
            if (node == null) return -1;

            // move the accessed node to the head;
            moveToHead(node);

            return node.value;
        }

        public void put(int key, int value) {
            DLinkedNode node = cache.get(key);

            if(node == null) {
                DLinkedNode newNode = new DLinkedNode();
                newNode.key = key;
                newNode.value = value;

                cache.put(key, newNode);
                addNode(newNode);

                ++size;

                if(size > capacity) {
                    // pop the tail
                    DLinkedNode tail = popTail();
                    cache.remove(tail.key);
                    --size;
                }
            } else {
                // update the value.
                // 即使是put,如果是已经存在的node,也要moveToHead,毕竟这也算使用
                node.value = value;
                moveToHead(node);
            }
        }
    }
}
